import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GetType
{
  ArrayList<String> types = new ArrayList();

  public ArrayList<String> getDetails(String path)
    throws IOException, NullPointerException
  {
    BufferedReader bufferedReader = null;
    try {
      File f1 = new File(path + "\\artifacttypes.txt");

      bufferedReader = new BufferedReader(new FileReader(f1.getPath()));

      String line = null;

      while ((line = bufferedReader.readLine()) != null)
      {
        StringTokenizer st = new StringTokenizer(line, "=");
        String artf = st.nextToken();
        String num = st.nextToken();
        this.types.add(artf);
        this.types.add(num);
      }
    }
    finally
    {
      bufferedReader.close();
    }

    return this.types;
  }
}
