import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;



public class DB {

   private String url;
   private String user;
   private String pass;
   
   //zuen datuekin bete behar duzue
   public DB (){
      this.url="";
      this.user="LOREZAINTZA";
      this.pass="LOREZAINTZA";
   }
   
   //sortzailea parametroekin
   public DB (String url, String user, String pass){
      this.url=url;
      this.user=user;
      this.pass=pass;
   }
   
   
   //konexioa egin, bat generikoa balio izango duena konexio guztietarako
   public Connection konexioa (){
      Connection conn = null;
      try{
         conn = DriverManager.getConnection(url, user, pass);
         System.out.println("Konexioa eginda");
         return conn;
      } catch (Exception e){
         System.out.println("Konexio errorea: "+e);
      }
      return conn;
   }
}
   ///HEMEN kontsultak
   
   // 1   SELECT * FROM BEZEROAK
      
   // 2   INSERT INTO BEZEROAK (zutabe1, zutabe2, zutabe2,etc) VALUES (balioa1, balioa2, balioa3, etc);