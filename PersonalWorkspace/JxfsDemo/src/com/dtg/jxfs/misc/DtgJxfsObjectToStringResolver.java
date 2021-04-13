package com.dtg.jxfs.misc;

import java.lang.reflect.Field;
import java.util.Hashtable;

public class DtgJxfsObjectToStringResolver {

    public final static String[] PREFIX_EMPTY = {};

	public final static String[] PREFIX_OPERATION_COMPLETE 	= { "JXFS_RC_", "JXFS_E_" };

	public final static String[] PREFIX_STATUS 				= { "JXFS_S_" };
	public final static String[] PREFIX_STATUS_NOT 			= { "JXFS_S_BIN_", "JXFS_S_MEDIA_" };

	public final static String[] PREFIX_INTERMEDIATE 		= { "JXFS_I_", "JXFS_E_" };
    
    public final static String[] PREFIX_OPERATION_ID		= { "JXFS_O_", "JXFSDIRECTIO_OFFSET"};	

    public final static String[] PREFIX_MEDIA_STATUS		= { "JXFS_S_MEDIA_"};
    
    public final static String[] PREFIX_DIRECTIO_COMMAND	= { "DTG_JXFS_" };
    
    private static DtgJxfsObjectToStringResolver    instance_;
    private static Hashtable                		intIdsHt_ = new Hashtable();

    //private static String                   LastValue   = null;

    static {
        instance_ = new DtgJxfsObjectToStringResolver();
    }

    public final static String getIdStringFromObject( Object theObject, int field)
    {
        return getIdStringFromObject( theObject, field, PREFIX_EMPTY, PREFIX_EMPTY);
    }
    
    public final static String getOperationIdStringFromObject( Object theObject, int field){
    	return getIdStringFromObject( theObject, field, PREFIX_OPERATION_ID, PREFIX_EMPTY);
    }

    public final static String getOperationCompleteIdStringFromObject( Object theObject, int field)
    {
        return getIdStringFromObject( theObject, field, PREFIX_OPERATION_COMPLETE, PREFIX_EMPTY);
    }

    public final static String getStatusIdStringFromObject( Object theObject, int field)
    {
        return  getIdStringFromObject( theObject, field, PREFIX_STATUS, PREFIX_STATUS_NOT);
    }

    public final static String getIntermediateIdStringFromObject( Object theObject, int field)
    {
        return getIdStringFromObject( theObject, field, PREFIX_INTERMEDIATE, PREFIX_EMPTY);
    }
    
    public final static String getMediaStatusIdStringFromObject( Object theObject, int field){
    	return getIdStringFromObject( theObject, field, PREFIX_MEDIA_STATUS, PREFIX_EMPTY);
    }
    
    public final static String getDirectIOCommandStringFromObject( Object theObject, int field){
    	return getIdStringFromObject( theObject, field, PREFIX_DIRECTIO_COMMAND, PREFIX_EMPTY);
    }

    public final static String getIdStringFromObject( Object theObject, int field, String sPrefix)
    {
    	return getIdStringFromObject( theObject, field, new String[]{ sPrefix }, PREFIX_EMPTY, false);
    }

    public final static String getIdStringFromObject( Object theObject, int field, String[] aPrefix)
    {
    	return getIdStringFromObject( theObject, field, aPrefix, PREFIX_EMPTY, false);
    }

    public final static String getIdStringFromObject( Object theObject, int field, String[] aPrefix, String[] aPrefixNot)
    {
    	return getIdStringFromObject( theObject, field, aPrefix, aPrefixNot, false);
    }
    
    private final static String exploreClass( Class classToExplore, Object theObject, int field, String[] aPrefix, String[] aPrefixNot, boolean checkExactMatch ){
    	Field[] fieldsA = classToExplore.getFields();
        Field   fieldObject;
        Object  object;
        for( int i = 0; i < fieldsA.length; i++) {
            fieldObject    = fieldsA[ i];
            try {
                object  = fieldObject.get( theObject);

                if( object instanceof Integer) {

                    intIdsHt_.put( classToExplore.toString() + "." + (( Integer)object).intValue(), fieldObject.getName());

                    if((( Integer)object).intValue() == field) {

                        if( fitWithPrefix( fieldObject.getName(), aPrefix, aPrefixNot, checkExactMatch)) {
                        	return fieldObject.getName();
                        	
                        }
                    }
                }
            } catch( Exception e) {
                // System.err.println( "DtgJxfsObjectToStringResolver.getIdStringFromObject Error [" + e + "]");
            }
        }
        return null;
    }
    
    public final static String getIdStringFromObject( Object theObject, int field, String[] aPrefix, String[] aPrefixNot, boolean checkExactMatch)
    {
    	if (null == theObject) return null;
    	
        Class   classToExplore    = getClassToExplore( theObject);
        String  id;
        String  value;


        id    = classToExplore.toString() + "." + field;
        value = ( String)intIdsHt_.get( id);

        //
        if( value != null && !fitWithPrefix( value, aPrefix, aPrefixNot, checkExactMatch)) {
        	value = null;
        }

        if( value == null) {
        	value = exploreClass( classToExplore, theObject, field, aPrefix, aPrefixNot, checkExactMatch );
        }

        if( value == null) {
            classToExplore  = createClass( "com.jxfs.general.IJxfsConst", theObject);
            value = exploreClass( classToExplore, theObject, field, aPrefix, aPrefixNot, checkExactMatch );
        }
        
        if( value == null){
        	classToExplore = getAlternativeClassToExplore( theObject);
        	if( classToExplore != null){
                value = exploreClass( classToExplore, theObject, field, aPrefix, aPrefixNot, checkExactMatch );
        	}
        }

        return value;
    }

    public final static boolean fitWithPrefix( String s, String[] aPrefix, String aPrefixNot[], boolean checkExactMatch)
    {
    	boolean startsWith 	= aPrefix.length == 0 ? true : false;

    	for (int i = aPrefix.length - 1; i >= 0; i--) {
    		if( checkExactMatch) {
				if( s.equals( aPrefix[ i])) {
					startsWith = true;
					break;
				}
    		} else {
				if( s.startsWith( aPrefix[ i])) {
					startsWith = true;
					break;
				}
    		}
		}

    	//
    	if( startsWith) {
    		if( aPrefixNot != null){
	        	for (int i = aPrefixNot.length - 1; i >= 0; i--) {
	        		if( checkExactMatch) {
		    			if( s.equals( aPrefixNot[ i])) {
		    				return false;
		    			}
	        		} else {
		    			if( s.startsWith( aPrefixNot[ i])) {
		    				return false;
		    			}
	        		}
	    		}
    		}
        	return true;
    	} else {
    		return false;
    	}
    }
    
    public final static Class getAlternativeClassToExplore( Object theObject){
        if( theObject instanceof com.jxfs.control.chk.JxfsCheckReader) {
            return createClass( "com.dtg.jxfs.consts.DtgJxfsCheckReaderConst", theObject);
        }
        
        return null;
    }

    public final static Class getClassToExplore( Object theObject)
    {
        //
        if( theObject instanceof com.jxfs.control.alm.JxfsAlarm) {
            return createClass( "com.jxfs.control.alm.IJxfsALMConst", theObject);
        }

        //
        if( theObject instanceof com.jxfs.control.cdr.JxfsATM ||
            theObject instanceof com.jxfs.control.cdr.JxfsCashRecycler ||
            theObject instanceof com.jxfs.control.cdr.JxfsCashDispenser) {

            return createClass( "com.jxfs.control.cdr.IJxfsCDRConst", theObject);
        }

        //
        if( theObject instanceof com.jxfs.control.chk.JxfsCheckReader) {
            return createClass( "com.jxfs.control.chk.IJxfsCheckReaderConst", theObject);
        }

        //
        if( theObject instanceof com.jxfs.control.dep.JxfsDepository) {
            return createClass( "com.jxfs.control.dep.IJxfsDepConst", theObject);
        }


        if( theObject instanceof com.jxfs.control.msd.JxfsChipCard) {
            return ( instance_.new InternalChipCard()).getClass();
        }

        if( theObject instanceof com.jxfs.control.msd.JxfsMagStripe) {
            return ( instance_.new InternalMagStripe()).getClass();
        }

        //
        if( theObject instanceof com.jxfs.control.pin.JxfsPINKeypad ||
            theObject instanceof com.jxfs.control.pin.JxfsSecurePINKeypad) {
            return createClass( "com.jxfs.control.pin.IJxfsPINConst", theObject);
        }

        //
        if( theObject instanceof com.jxfs.control.ptr.JxfsPrinter) {
            return createClass( "com.jxfs.control.ptr.IJxfsPrinterConst", theObject);
        }

        //
        if( theObject instanceof com.jxfs.control.siu.JxfsSiu) {
            return createClass( "com.jxfs.control.siu.IJxfsSiuConst", theObject);
        }

        //
        if( theObject instanceof com.jxfs.control.tio.JxfsTIO) {
            return createClass( "com.jxfs.control.tio.IJxfsTIOConst", theObject);
        }

        return theObject.getClass();
    }

    /*
     */
    private final static Class createClass( String className, Object theObject)
    {
        if( className != null) {
            try {
                return Class.forName( className);
            } catch( ClassNotFoundException cnfe) {
//                JxfsChecker.trace( "Error [" + cnfe + "]", "JxfsCheckerPluginUtil.getClassToExplore");
            }
        }

        return theObject.getClass();
    }

    /*
     */
    protected class InternalChipCard implements com.jxfs.control.msd.IJxfsCCDConst,
                                              com.jxfs.control.msd.IJxfsMotorizedCardConst {

        public int JXFS_S_CCD_MEDIA_STATUS   = 4005;

    }

    /*
     */
    protected class InternalMagStripe implements com.jxfs.control.msd.IJxfsMSDConst,
                                               com.jxfs.control.msd.IJxfsMotorizedCardConst {
    }
}
