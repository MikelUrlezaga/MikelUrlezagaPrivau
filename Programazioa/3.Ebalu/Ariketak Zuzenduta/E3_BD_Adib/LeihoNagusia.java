import javax.swing.JFrame;
public class LeihoNagusia extends JFrame {
   //hemen sortuko duzue jframe-a beharrezkoak diren elementuekin
   
   
   //main metodoa
   public static void main (String [] args){
      DB db = new DB ("jdbc:oracle:thin:@localhost:1521/xepdb1","LOREZAINTZA","LOREZAINTZA");
      new LeihoNagusia();
   }
}