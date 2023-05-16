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
      this.url="jdbc:oracle:thin:@localhost:1521/xepdb1";
      this.user="LOREZAINTZA";
      this.pass="LOREZAINTZA";
      konexioa();
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
         System.out.println("Konexio eginda");
         return conn;  
      } catch (Exception e){
         System.out.println("Konexio errorea: "+e);
      }
      return conn;
   }

   ///HEMEN kontsultak
   
   // 1   SELECT * FROM BEZEROAK
   
   // 2   SELECT ID_BEZERO FROM BEZEROAK
   
   // 3   UPDATE BEZEROAK SET TELEFONOA = ? WHERE BEZEROKODEA = ?
}