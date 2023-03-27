import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class HasieraGUI extends JFrame {
   JTextArea jta;
   DB db;
   public HasieraGUI (){
      db = new DB();
      jta=new JTextArea();
      JPanel jp = new JPanel ();
      jp.add(jta);
      jta.setText(db.produktuak().toString());
      this.getContentPane().add(jp);      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(200,100);
      this.setVisible(true);
   }
   public static void main (String [] args){
      HasieraGUI hgui = new HasieraGUI();
   }
}