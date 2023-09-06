import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class HasieraGUI extends JFrame {
   JComboBox <String> jcb;
   DB db;
   Enplegatuak e;
   JButton jBTxertatu;
   JButton jBEguneratu;
   public HasieraGUI (){
      jBTxertatu = new JButton ("Txertatu");
      jBEguneratu = new JButton ("Eguneratu"); 
      db = new DB();
      e=db.enplegatuak();
      jcb=new JComboBox();
      JPanel jp = new JPanel ();
      jp.add(jcb);
      jp.add(jBTxertatu);
      jp.add(jBEguneratu);
      
      //action listener botoiei
      jBTxertatu.addActionListener(e->txertatu());
      jBEguneratu.addActionListener(e->eguneratu());
      
      kargatuEnplegatuak();
      this.getContentPane().add(jp);      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(200,100);
      this.setVisible(true);
   }
   
   public void kargatuEnplegatuak(){
      for (int i=0;i<e.luzeera();i++){
         jcb.addItem(e.lortuIzenAbizenak(i));
      }
   }
   public void txertatu(){
      JDTxertatu jdT = new JDTxertatu(this);
   }
   public void eguneratu(){
      JDEguneratu jdE = new JDEguneratu(this);
   }
   public static void main (String [] args){
      HasieraGUI hgui = new HasieraGUI();
   }
}