import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class Main
{
  public static void main(String[] args)
  {
    Logger logger = Logger.getLogger(Main.class);
    GetDetails details = new GetDetails();
    try {
      logger.info("Fetching the details from Nandeesh " + args[0] + "\\build.properties");

      details.getDetails(args[0]);
    }
    catch (IOException e1) {
      logger.error("Details.properties not found or contains error");
      logger.error(e1.getMessage());
      GetPublishList.status = Boolean.valueOf(false);
    }
    catch (NullPointerException e)
    {
      logger.error("Details.properties not found or contains error");
      logger.error(e);

      GetPublishList.status = Boolean.valueOf(false);
    }
    catch (Exception e)
    {
      logger.error("Error While Fetching the Details");
      logger.error(e);

      GetPublishList.status = Boolean.valueOf(false);
    }

    String connectionString = details.getUrl();

    logger.info("Using ConnectionString : " + connectionString);

    GetPublishList pl = null;
    try {
      logger.info("Using User : " + details.getuName());

      logger.info("Using Password : " + details.getPassword());

      logger.info("Using Query : " + details.getQuery());

      logger.info("Using XSDQuery : " + details.getXsdquery());

      pl = new GetPublishList(connectionString, details.getuName(), details.getPassword(), details.getQuery(), details.getXsdquery(), args[0]);
    }
    catch (IOException e)
    {
      logger.error("File Read Error while accessing Difference.txt");
      logger.error(e);
      GetPublishList.status = Boolean.valueOf(false);
    }
    catch (ClassNotFoundException e)
    {
      logger.error("Error While Generating the Publish List");
      logger.error(e);
      GetPublishList.status = Boolean.valueOf(false);
    }
    catch (SQLException e)
    {
      logger.error("SQL Exception. Please specify the correct Query");
      logger.error(e);
      GetPublishList.status = Boolean.valueOf(false);
    } catch (Exception e) {
      logger.error("Error while comparing the Database and the artf.txt File");
      logger.error(e);
      GetPublishList.status = Boolean.valueOf(false);
    }
    try
    {
      pl.createDifference();
    }
    catch (IOException e) {
      logger.error("Error while creating Difference.txt");
      logger.error(e);
      GetPublishList.status = Boolean.valueOf(false);
    }
    System.out.println(pl.getStatus());
  }
}
