import java.io.File;

import net.sourceforge.tess4j.*;



public class ProcessImage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static String crackImage(String filePath) {  
        File imageFile = new File(filePath);  
        ITesseract instance = new Tesseract();  
        try {  
            String result = instance.doOCR(imageFile);  
            return result;  
        } catch (TesseractException e) {  
            System.err.println(e.getMessage());  
            return "Error while reading image";  
        }  
    }
    
}
