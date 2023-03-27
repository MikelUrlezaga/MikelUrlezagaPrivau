import javax.swing.*;
import java.io.FileWriter;

public class PertsonaGehituGUI extends JDialog {
   
   private JTextField jtfId;
   private JTextField jtfTeam;
   private JTextField jtfCountry;
   private JTextField jtfNameF;
   private JTextField jtfNameL;
      
   public PertsonaGehituGUI (PertsonaUI pui){
      setTitle ("Gehitu pertsona");
      //abiarazi klaseko atributuak
      jtfId = new JTextField();
      jtfCountry = new JTextField();
      jtfTeam = new JTextField();
      jtfNameF = new JTextField();
      jtfNameL = new JTextField();
      
      //panela sortu eta elementuak gehitu
      JPanel jp = new JPanel();
      jp.add(jtfId);
      jp.add(jtfTeam);
      jp.add(jtfCountry);
      jp.add(jtfNameF);
      jp.add(jtfNameL);
      
      // Gehitu panela JDialog-era
      
      getContentPane().add(jp) ;
      
      // add jbutton
      JButton jb = new JButton ("Gehitu");
      jp.add(jb);
      jb.addActionListener(e -> gehitu(pui));
      
      // Definitu tamaina eta ikusgarri egin
      setSize (200,300);
      setVisible(true);   
      
   }
   
   public void gehitu(PertsonaUI pui){
      try{
         FileWriter fw = new FileWriter ("E3_Ariketa_3_Pertsonak.txt",true);
         fw.write("\n"+jtfId.getText()+" "+jtfTeam.getText()+" "+jtfCountry.getText()+" "+jtfNameF.getText()+" "+jtfNameL.getText());
         fw.close();
         pui.datuakIrakurri();
         this.dispose();
      } catch (Exception e){
         System.out.println("Errorea JDialog"+e);
      }    
      
      
   }
  /* public static void main (String [] args){
      PertsonaGehituGUI p = new PertsonaGehituGUI();
   }*/
}
