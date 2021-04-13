package com.dtg.jxfs.tools.demo.clients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Vector;

import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.ptr.IJxfsPrinterConst;
import com.jxfs.control.ptr.JxfsReceiptPrinter;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.events.JxfsOperationCompleteEvent;
import com.jxfs.events.JxfsStatusEvent;
import com.jxfs.general.IJxfsConst;
import com.jxfs.general.JxfsDeviceInformation;
import com.jxfs.general.JxfsDeviceManager;

public class JxfsPtrDemoDia implements IJxfsConst, IJxfsPrinterConst, IJxfsOperationCompleteListener, IJxfsStatusListener  {

	private final static int APP_END	= -2;
	private final static int APP_BEGIN  = -1;
	private final static int APP_OPEN   = 0;
	private final static int APP_PRINT  = 1;
	private final static int APP_EJECT  = 2;
	private final static int APP_CLOSE  = 3;
	private final static int APP_ERROR  = 4;
	
	int appStatus_ = APP_BEGIN;
	ApplicationFlow	appFlow_;
		
	JxfsDeviceManager jxfsDM_;
	JxfsReceiptPrinter printer_;
	int identificationID_;
	
	private static final String MEDIA = "receipt.mdf";
	private static final String PROMOCION = "promocion.frm";
	private static final String ETIQUETA_1 = "etiqueta.frm";
	private static final String ETIQUETA_2 = "etiqueta2.frm";
	private static final String TIKET_CABECERA = "tiket_cabecera.frm";
	private static final String TIKET_CUERPO = "tiket_cuerpo.frm";
	private static final String TIKET_PIE = "tiket_pie.frm";
	
	private static final int SAMPLE_PROMOCION = 0;
	private static final int SAMPLE_ETIQUETA_1 = 1;
	private static final int SAMPLE_ETIQUETA_2 = 2;
	private static final int SAMPLE_TIKET_CABECERA  = 3;
	private static final int SAMPLE_TIKET_CUERPO  = 4;
	private static final int SAMPLE_TIKET_PIE  = 5;	
	
	private String   media_  = MEDIA;
	private String   form_   = PROMOCION;
	
	private int sample_ = SAMPLE_PROMOCION;
	
	private static BufferedReader bufIn_ = null; 

	
	private static String[] CAMPOS_ETIQUETA_1 = new String[] { "producto" , "cantidad", "precio_previo", "precio_nuevo", 
		"unidad_previo", "precio_unidad_previo", "unidad_nuevo", "precio_unidad_nuevo", "codigo_producto"};
	
	private static String[] CAMPOS_PROMOCION = new String[] { "codigo_barras", "oferta_titulo", "oferta_1", "oferta_2" };
	
	private static String[] CAMPOS_CABECERA = new String[] { "fecha", "hora", "nose_1", "nose_2", "factura", "caja"};
	
	private static String[] CAMPOS_PIE = new String[] { "club_dia", "tarjeta", "importe", "comercio", "operacion", "aut", "referencia_dia" };
	
	private JxfsPtrDemoDia( String initString)
	{
		try {
			// init JXFS DM
            jxfsDM_ = JxfsDeviceManager.getReference();
            jxfsDM_.initialize( initString);
            
            Vector receiptPrintersA_ = jxfsDM_.getDeviceListFor( JxfsReceiptPrinter.class, JXFS_LEVEL_ALL);
            
            if( receiptPrintersA_.size() > 0) {
                String deviceName =(( JxfsDeviceInformation) receiptPrintersA_.elementAt( 0)).getDeviceName ();

    			// get the PRinter JXFS Control
                System.out.println( "Receipt Printer: " + deviceName);
                IJxfsBaseControl deviceControl = jxfsDM_.getDevice( deviceName);
                deviceControl.addOperationCompleteListener( this);
                deviceControl.addStatusListener( this);
                
            	if( deviceControl instanceof JxfsReceiptPrinter){
            		printer_ = ( JxfsReceiptPrinter)deviceControl;
                	appFlow_ = new ApplicationFlow();
                	appFlow_.start();
                }
            }
            
        } catch( JxfsException e){
        	System.err.println( e.toString());
        }
	}
	
	
	int typeOfTest()
	{
		boolean bEnd = false;
		int result = SAMPLE_PROMOCION;
		while (!bEnd)
		{
			StringBuffer question = new StringBuffer();
			question.append("\nSelecciona el tipo de prueba:");
			question.append("\n\t1 - Imprimir etiqueta (todo texto)");
			question.append("\n\t2 - Imprimir etiqueta tipo 2 (precios como imagenes)");
			question.append("\n\t3 - Imprimir ejemplo de promocion");
			question.append("\n\t4 - Imprimir ejemplo de tiket");
			question.append("\n\t");
			int value = 0;
			try {
				value = Integer.parseInt(getResponseStr(question.toString()));
				switch (value) {
				case 1:
					result = SAMPLE_ETIQUETA_1;
					bEnd = true;
					break;
				case 2:
					result = SAMPLE_ETIQUETA_2;
					bEnd = true;
					break;
				case 3:
					result = SAMPLE_PROMOCION;
					bEnd = true;
					break;
				case 4:					
					result = SAMPLE_TIKET_CABECERA;
					bEnd = true;
					break;
				}
			} catch (Exception ex) {}
			if (!bEnd) System.out.println("respuesta incorrecta!!!");
		}
		return result;
	}
	
	String[] camposEtiqueta1 ()
	{
		String aux = getResponseStr("Rellenar campos (S/N)");
		if ( (null == aux) || (!aux.equalsIgnoreCase("S")) ) {
			return new String[0];
		}
		
		String[] campos = new String[CAMPOS_ETIQUETA_1.length];
		for (int i=0; i<CAMPOS_ETIQUETA_1.length; i++) {
			campos[i] = CAMPOS_ETIQUETA_1[i] + "=" + getResponseStr(CAMPOS_ETIQUETA_1[i]);
		}
		return campos;
	}
	
	String[] camposEtiqueta2 ()
	{
		return new String[0];
	}

	String[] camposPromocion()
	{
		String aux = getResponseStr("Rellenar campos (S/N)");
		if ( (null == aux) || (!aux.equalsIgnoreCase("S")) ) {
			return new String[0];
		}

		String[] campos = new String[CAMPOS_PROMOCION.length];
		for (int i=0; i<CAMPOS_PROMOCION.length; i++) {
			campos[i] = CAMPOS_PROMOCION[i] + "=" + getResponseStr(CAMPOS_PROMOCION[i]);
		}
		return campos;
	}
	
	String[] camposCabecera()
	{
		String aux = getResponseStr("Rellenar campos (S/N)");
		if ( (null == aux) || (!aux.equalsIgnoreCase("S")) ) {
			return new String[0];
		}

		String[] campos = new String[CAMPOS_CABECERA.length];
		for (int i=0; i<CAMPOS_CABECERA.length; i++) {
			campos[i] = CAMPOS_CABECERA[i] + "=" + getResponseStr(CAMPOS_CABECERA[i]);
		}
		return campos;
	}

	
	String[] camposCuerpo()
	{
		String aux = getResponseStr("Rellenar campos (S/N)");
		if ( (null == aux) || (!aux.equalsIgnoreCase("S")) ) {
			return new String[0];
		}

		int numElementos = 5;
		try {
			numElementos = Integer.parseInt(getResponseStr("Numero de productos en la compra"));
		} catch (Exception ex){};
		
		String[] campos = new String[numElementos*4 + 3];
		int j=0;
		for (int i=0; i<numElementos; i++) {
			System.out.println("Elemento " + (i+1) + " de " + numElementos + ": ");
			campos [j++] = "articulo["+i+"]="+getResponseStr("\tarticulo");
			campos [j++] = "cantidad["+i+"]="+getResponseStr("\tcantidad");
			campos [j++] = "precio_unitario["+i+"]="+getResponseStr("\tprecio_unitario");
			campos [j++] = "precio["+i+"]="+getResponseStr("\tprecio");
		}
		campos[j++] = "total=" + getResponseStr("total");
		campos[j++] = "efectivo=" + getResponseStr("efectivo");
		campos[j++] = "cambio=" + getResponseStr("cambio");
		
		return campos;
	}
	
	String[] camposPie()
	{
		String aux = getResponseStr("Rellenar campos (S/N)");
		if ( (null == aux) || (!aux.equalsIgnoreCase("S")) ) {
			return new String[0];
		}

		String[] campos = new String[CAMPOS_PIE.length];
		for (int i=0; i<CAMPOS_PIE.length; i++) {
			campos[i] = CAMPOS_PIE[i] + "=" + getResponseStr(CAMPOS_PIE[i]);
		}
		return campos;
	}
	
	private class ApplicationFlow extends Thread {

		public void run() {
			while( appStatus_ != APP_END) {
				try {
					String fields[] = new String[0];
					switch( appStatus_) 
					{
						case APP_BEGIN:
							identificationID_ = printer_.open();
							break;
							
						case APP_OPEN:
							sample_ = typeOfTest();
							switch (sample_) {
							case SAMPLE_ETIQUETA_1:
								form_ = ETIQUETA_1;
								fields = camposEtiqueta1();
								break;
							case SAMPLE_ETIQUETA_2:
								form_ = ETIQUETA_2;
								fields = camposEtiqueta2();
								break;
							case SAMPLE_TIKET_CABECERA:
								form_ = TIKET_CABECERA;
								fields = camposCabecera();
								break;
							case SAMPLE_PROMOCION:
								form_ = PROMOCION;
								fields = camposPromocion();
								break;
							default:
							}
							identificationID_ = printer_.printForm( form_, media_, fields);
							// for this test just open & close device 
//							identificationID_ = printer_.close();
							break;
							
						case APP_PRINT:
							switch (sample_)
							{
							case SAMPLE_TIKET_CABECERA:
								sample_ = SAMPLE_TIKET_CUERPO;
								form_ = TIKET_CUERPO;
								fields = camposCuerpo();
								identificationID_ = printer_.printForm( form_, media_, fields);
								break;
							case SAMPLE_TIKET_CUERPO:
								sample_ = SAMPLE_TIKET_PIE;
								form_ = TIKET_PIE;
								fields = camposPie();
								identificationID_ = printer_.printForm( form_, media_, fields);
								break;
							default:
								identificationID_ = printer_.ejectMedia( JXFS_PTR_CTRL_FLUSH | JXFS_PTR_CTRL_PARTIALCUT);
								break;
							}
						break;
						case APP_EJECT:
							identificationID_ = printer_.close();
						break;
						case APP_CLOSE:
						case APP_ERROR:
							System.out.println( "<<<<< JXFS shutdown >>>>>");
					    	jxfsDM_.shutdown();
					    	appStatus_ = APP_END;
						break;
					}

					if( appStatus_ == APP_END) {
				        System.exit( 0);
					} else {
						System.out.println( appStatus_ + " wait for OCE ...");
						waitForOce();
					}
			    } catch( JxfsException e){
			    	System.err.println( e.toString());
					appStatus_ = APP_ERROR;
			    }
			}
		}
	}
	
    /**
     * Receives a J/XFS Status Event and shows a properly message on the user interface.
     * @param event a <code>JxfsStatusEvent</code>.
     */
    public void statusOccurred( JxfsStatusEvent event)
    {
        int status = event.getStatus();
    	
        System.out.println( "JxfsStatusEvent >>> " + event.toString());
        System.out.println( "    status:  " + event.getStatus() + " - " + getFieldName( status, "JXFS_S_"));
        System.out.println( "    result:  " + event.getResult() + " (" + event.getExtendedResult() + ")");
        System.out.println( "    details: " + event.getDetails());
    }

    /**
     * Receives a J/XFS Operation Complete Event and updates the values of
     * {@link #Return} and {@link #ExecuteOK} properly and sets
     * {@link #LockOperationComplete} to <code>false</code>.
     * @param event a <code>JxfsOperationCompleteEvent</code>.
     */
    public void operationCompleteOccurred( JxfsOperationCompleteEvent event)
    {
    	int operationID = event.getOperationID();
        int result = event.getResult();

        System.out.println( "OCE " + event);
        System.out.println( "    event operationID             [" + operationID + "]  " + getFieldName( operationID, "JXFS_O_"));
        System.out.println( "    event result                  [" + result + "]  " + getFieldName( result, "JXFS_RC_"));
        System.out.println( "    event identificationID        [" + event.getIdentificationID() + "]");
        System.out.println( "    last command identificationID [" + identificationID_ + "]");
        
        //
		synchronized (appFlow_) {
	    	if( result == JXFS_RC_SUCCESSFUL) {
	    		switch( operationID) {
	    			case JXFS_O_OPEN:
	                    System.out.println( "    >>> JXFS_O_OPEN " + event.toString());
	    				appStatus_ = APP_OPEN;
	    				break;
	
	    			case JXFS_O_PTR_WRITE_FORM_DATA:
	                    System.out.println( "    >>> JXFS_O_PTR_WRITE_FORM_DATA " + event.toString());
	    				appStatus_ = APP_PRINT;
	    				break;
	    			
	    			case JXFS_O_PTR_EJECT_MEDIA:
	                    System.out.println( "    >>> JXFS_O_PTR_EJECT_MEDIA " + event.toString());
	    				appStatus_ = APP_EJECT;
	    				break;
	    			
	    			case JXFS_O_CLOSE:
	                    System.out.println( "    >>> JXFS_O_CLOSE " + event.toString());
	    				appStatus_ = APP_CLOSE;
	    				break;
	    		}
	    	} else {
	    		System.err.println( "    >>> " + event.toString());
				appStatus_ = APP_ERROR;
	    	}
	
	    	//
			appFlow_.notify();
		}
    }
    
	public void waitForOce()
	{
		try {
			synchronized (appFlow_) {
				appFlow_.wait();
			}
		} catch( InterruptedException ie) {
	    	System.err.println( ie.toString());
		}
	}
    

    //
    /**
     * return the field name of the specified printer constant
     * @param value		constant value 
     * @param prefix	constant prefix 
     * @return
     */
    private final String getFieldName( int value, String prefix)
    {
    	try {
        	// we know that it would be a printer related status so ... 
    		Field[] aFields = IJxfsPrinterConst.class.getFields();
    		
    		for (int i = 0; i < aFields.length; i++) {
    			if ( aFields[ i].getType() == int.class 
    					&& aFields[i].getInt( this) == value 
    					// usually constants are unique but in some cases the same constant value is used in different 'environments'.
    					// by example 0 will match JXFS_S_BIN_OK and JXFS_RC_SUCCESSFUL
    					&& aFields[ i].getName().startsWith( prefix)) {
    				
    				return aFields[ i].getName();
    			}
			}
    	} catch( Exception se) {
    	}
    	
    	return "???";
    }
    
    //
	public static void main( String[] args)
	{
		
		bufIn_ = new BufferedReader(new InputStreamReader(System.in));

//		String exp1 = "*.frm";
////		String exp2 = "*.mdf";
//		
//		String s2 = "hello.frm";
//	
//		Pattern p = Pattern.compile( exp1);
//		 Matcher m = p.matcher(s2);
//		 
//		System.out.println( "" + m.matches());
////		System.out.println( "" + s2.matches( exp2));
		String initString ;
//		initString = "com.jxfs.forum.communication.local.SpecificDeviceManagerLOCAL,ws2,DynastyTest,C:/svn_workspaces/3.0_branches/GDS_3/res/GlobalDS3/Server/Repository/Read.repository";
		initString = "com.jxfs.forum.communication.rmi.SpecificDeviceManagerRMI,ws2,Demo,2006;localhost,";
		new JxfsPtrDemoDia( initString);
	}
	
	
	public static String getResponseStr(String question)
	{
		String sResp = null;
		
		try 
		{
			if ((null == question)) System.out.print ("> "); 
			else System.out.print(question + " ? ");
			sResp = bufIn_.readLine();
			if (null != sResp) sResp = sResp.trim();
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
			sResp = null;
		}
		
		return sResp;
	}	

}
