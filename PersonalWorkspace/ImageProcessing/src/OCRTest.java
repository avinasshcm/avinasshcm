import java.io.File;

public class OCRTest {

    static String STR = "";

    public static void main(String[] args) {
        OCR l = new OCR(0.70f);
        l.loadFontsDirectory(OCRTest.class, new File("fonts"));
        l.loadFont(OCRTest.class, new File("fonts", "font_1"));
        ImageBinaryGrey i = new ImageBinaryGrey(Capture.load(OCRTest.class, "full.png"));
        STR = l.recognize(i, 1285, 654, 1343, 677, "font_1");
        System.out.println(STR);
    }
}