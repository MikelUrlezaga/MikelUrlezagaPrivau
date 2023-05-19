import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Arrays;



public class DB {

   private String url;
   private String user;
   private String pass;
   protected String select = null;
   protected String from = null;
   protected Connection conn = null;
   protected Statement statement = null;
   protected String where = "";
   protected ResultSet rs = null;
   protected int [] idak = new int [0];
<<<<<<< HEAD
   protected String [] dena = new String [0];
=======
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
   
   //zuen datuekin bete behar duzue
   public DB (){
      this.url="jdbc:oracle:thin:@localhost:1521/xepdb1";
      this.user="LOREZAINTZA";
      this.pass="LOREZAINTZA";
<<<<<<< HEAD
=======
      bezeroak();
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
   }
   
   //sortzailea parametroekin
   public DB (String url, String user, String pass){
      this.url=url;
      this.user=user;
      this.pass=pass;
   }
   
   
   //konexioa egin, bat generikoa balio izango duena konexio guztietarako
   public Connection konexioa (){
      try{
         conn = DriverManager.getConnection(url, user, pass);
         statement=conn.createStatement();
<<<<<<< HEAD
=======
         System.out.println("Konexio eginda");
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
      } catch (Exception e){
         System.out.println("Konexio errorea: "+e);
      }
      return conn;
   }

   ///HEMEN kontsultak
   protected void consulta() {

      String consulta = "SELECT " + select + " FROM " + from;

      try {
          rs = statement.executeQuery(consulta);
      } catch (Exception e) {
         System.out.println("ERROREA: " + e);
      }
  }
<<<<<<< HEAD

   protected void aldaketak() {

      String aldaketa = "UPDATE BEZEROAK SET TELEFONOA = ? WHERE BEZEROKODEA = ?";

      try {
         rs = statement.executeQuery(aldaketa);
      } catch (Exception e) {
        System.out.println("ERROREA: " + e);
      }

   }
   // 1   SELECT * FROM BEZEROAK
   public String [] bezeroguztiak (){


      select = "*";
=======
   // 1   SELECT * FROM BEZEROAK
   public void bezeroak (){

      int ID;

      select = "BEZEROKODEA";
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
      from = "BEZEROAK";
      konexioa();
      consulta();
      
      try{
      while (this.rs.next()) {
<<<<<<< HEAD

         dena = Arrays.copyOf(dena, dena.length+1);

         dena [dena.length-1] = ""+rs.getInt("BEZEROKODEA") + " " +rs.getString("BEZEROIZENA") + " " + rs.getString("KONTAKTUIZENA") + " " + rs.getString("KONTAKTUABIZENA") + " " + rs.getString("TELEFONOA") + " " + rs.getString("FAX") + " " + rs.getString("HELBIDELERROA1") + " " + rs.getString("HELBIDELERROA2") + " " + rs.getString("HERRIA") + " " + rs.getString("ESKUALDEA") + " " + rs.getString("HERRIALDEA") + " " + rs.getString("POSTAKODEA") + " " + rs.getInt("SALEROSKETALANGILEKODEA") + " " + rs.getString("KREDITUMUGA"); 
=======
         ID = rs.getInt("BEZEROKODEA");

         idak = Arrays.copyOf(idak, idak.length+1);

         idak [idak.length-1] = ID;
      
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
      }
      conn.close();
      statement.close();
      rs.close();
      } catch (SQLException e) {
         System.out.println("ERROREA: " + e);
      }
<<<<<<< HEAD
      return dena;
=======
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
   }
   // 2   SELECT ID_BEZERO FROM BEZEROAK
   public int [] bezeroak (){

      int ID;

      select = "BEZEROKODEA";
      from = "BEZEROAK";
      konexioa();
      consulta();
      
      try{
      while (this.rs.next()) {
         ID = rs.getInt("BEZEROKODEA");

         idak = Arrays.copyOf(idak, idak.length+1);

         idak [idak.length-1] = ID;
      
      }
      conn.close();
      statement.close();
      rs.close();
      } catch (SQLException e) {
         System.out.println("ERROREA: " + e);
      }
      return idak;
   }
   // 3   UPDATE BEZEROAK SET TELEFONOA = ? WHERE BEZEROKODEA = ?
   public aldaketa (String telefonoa){

      String aldaketa = "UPDATE BEZEROAK SET TELEFONOA = ? WHERE BEZEROKODEA = ?";


      try{

         konexioa();
         aldaketak();
         
      } catch(SQLException e){

      }
   }
}