import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdibideDatuBase {

   public static void main (String [] args){
      Connection conn = null;
      Statement stnt = null;
      ResultSet rs = null;
      String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
      String user = "LOREZAINTZA";
      String pass = "LOREZAINTZA";
      try {
          conn = DriverManager.getConnection(url, user, pass);
          stnt = conn.createStatement();
          rs = stnt.executeQuery("SELECT * FROM PRODUKTUAK");
          while (rs.next()) {
            System.out.println(rs.getString ("IZENA"));
          }
          conn.close();
          stnt.close();
          rs.close();
      } catch (SQLException e) {
          System.out.println("ERROREA: " + e);
      }
   }
}