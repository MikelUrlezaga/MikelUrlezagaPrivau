import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


// datu base klasea konexioa eta kontsultak egiteko
public class DB {

   private String url;
   private String user;
   private String pass;
   
   //defektuzko sortzailea 
   public DB (){
      this.url="jdbc:oracle:thin:@localhost:1521/xepdb1";
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
         return conn;
      } catch (Exception e){
         System.out.println("Konexio errorea: "+e);
      }
      return conn;
   }

   ///HEMEN kontsultak, metodo bat kontsulta bakoitzeko, gogoratu konexioak itxi behar direla   
   public Produktuak produktuak (){
      Produktuak pDB = new Produktuak();
      try {
          Connection conn = konexioa();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUKTUAK");
          while (rs.next()) {
            //taulako emaitza bakoitzeko sortu produktua eta abierazi kontsultako datuekin
            Produktua p = new Produktua (rs.getInt("PRODUKTUKODEA"),rs.getString ("IZENA"),rs.getString ("GAMA"),rs.getString ("NEURRIA"),rs.getString ("HORNITZAILEA"),rs.getString ("DESKRIBAPENA"),rs.getInt(6),rs.getDouble(7),rs.getDouble(8));
            //p objektua gordeko da produktuen array-an
            pDB.addProduktuak(p);
            //System.out.println(rs.getString ("IZENA"));
          }
          //konexioak itxi
          conn.close();
          stmt.close();
          rs.close();
          //bistaratu pantailatik produktuak
          //zuek ariketan textArea batean sartuko dituzue
          pDB.getProduktuak();
      } catch (SQLException e) {
          System.out.println("ERROREA: " + e);
      }
      return pDB;
   }
}