import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;


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

   ///HEMEN kontsultak, metedo bat kontsulta bakoitzeko, gogoratu konexioak itxi behar direla   
   public Enplegatuak enplegatuak (){
      Enplegatuak eDB = new Enplegatuak();
      try {
          Connection conn = konexioa();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM LANGILEAK");
          while (rs.next()) {
            //taulako emaitza bakoitzeko sortu produktua eta abierazi kontsultako datuekin
            Enplegatua e = new Enplegatua (rs.getInt("LANGILEKODEA"),rs.getString("IZENA"),rs.getString("ABIZENA1"),rs.getString("ABIZENA2"),rs.getString("LUZAPENA"),rs.getString("EMAILA"),rs.getString("BULEGOKODEA"), rs.getInt("NAGUSIKODEA"),rs.getString("LANPOSTUA"));
            
            //p objektua gordeko da produktuen array-an
            eDB.addEnplegatua(e);
            
          }
          //konexioak itxi
          conn.close();
          stmt.close();
          rs.close();
          //bistaratu pantailatik produktuak
          //zuek ariketan textArea batean sartuko dituzue
      } catch (SQLException e) {
          System.out.println("ERROREA: " + e);
      }
      return eDB;
   }
   
   public void gehituBezero(Bezeroa b){
      String insertSQL = "INSERT INTO BEZEROAK(BEZEROKODEA, BEZEROIZENA, KONTAKTUIZENA, KONTAKTUABIZENA, TELEFONOA, FAX, HELBIDELERROA1, HELBIDELERROA2, HERRIA, ESKUALDEA, HERRIALDEA, POSTAKODEA, SALEROSKETALANGILEKODEA, KREDITUMUGA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      
      try{
         Connection conn = konexioa();
         PreparedStatement pS = conn.prepareStatement(insertSQL);
         pS.setInt(1, b.getKodea());
         pS.setString(2, b.getIzena());
         pS.setString(3, b.getKontaktuIzena());         
         pS.setString(4, b.getKontaktuAbizena());
         pS.setString(5, b.getTelefonoa());
         pS.setString(6, b.getFax());
         pS.setString(7, b.getHelbide1());
         pS.setString(8, b.getHelbide2());
         pS.setString(9, b.getHerria());
         pS.setString(10, b.getEskualdea());
         pS.setString(11, b.getHerrialdea());
         pS.setString(12, b.getPostaKodea());
         pS.setInt(13, b.getSalerosketaLangileKodea());
         pS.setDouble(14, b.getKredituMuga());
         pS.executeUpdate();                                                                                          
      }catch(SQLException e){
         System.out.println("ERROREA: " +e);
      }   
   }

   public void eguneratuBezeroa (Bezeroa b){
   
      String updateSQL = "UPDATE BEZEROAK SET BEZEROIZENA = ?, KONTAKTUIZENA = ?, KONTAKTUABIZENA = ?, TELEFONOA = ?, FAX = ?, HELBIDELERROA1 = ?, HELBIDELERROA2 = ?, HERRIA = ?, ESKUALDEA = ?, HERRIALDEA = ?, POSTAKODEA = ?, SALEROSKETALANGILEKODEA = ?, KREDITUMUGA = ? WHERE BEZEROKODEA = ?";
      
      try{
         Connection conn = konexioa();
         PreparedStatement pS = conn.prepareStatement(updateSQL);
         pS.setString(1, b.getIzena());
         pS.setString(2, b.getKontaktuIzena());         
         pS.setString(3, b.getKontaktuAbizena());
         pS.setString(4, b.getTelefonoa());
         pS.setString(5, b.getFax());
         pS.setString(6, b.getHelbide1());
         pS.setString(7, b.getHelbide2());
         pS.setString(8, b.getHerria());
         pS.setString(9, b.getEskualdea());
         pS.setString(10, b.getHerrialdea());
         pS.setString(11, b.getPostaKodea());
         pS.setInt(12, b.getSalerosketaLangileKodea());
         pS.setDouble(13, b.getKredituMuga());
         pS.setInt(14, b.getKodea());
         pS.executeUpdate();   
                                                                                                
      }catch(SQLException e){
         System.out.println("ERROREA: " +e);
      }   
   }
}