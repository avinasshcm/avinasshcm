import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class CopyBundles {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Path source =  Paths.get("Z:\\LO\\DailyBuilds\\5.2\\LO_5.2.0.0.2\\PatchBundle") ;
        Path target =  Paths.get("D:\\Payments\\INSTALL-LOCATION\\FBE520\\CheckLatestBuild_520\\Patch_Location\\1") ;
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

}
