import javax.swing.*;
import java.awt.*;

public class Harrera extends JDialog {

   private JButton ikusib;
   private JButton sartub;
   private JPanel panel;
   
   public Harrera() {
   
   ikusib = new JButton("Ikusi");
   sartub = new JButton("Sartu");
   panel = new JPanel();
   
   ikusib.addActionListener(e -> ikusi());
   sartub.addActionListener(e -> sartu());
   
   panel.add(ikusib);
   panel.add(sartub);
   getContentPane().add(panel);
   
   
   setTitle("Harrera");
   setSize(200,80);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
   setVisible(true);
   
   }
   
   public static void main(String[] args){
      Harrera h = new Harrera();  
   }
   
   public void ikusi (){
      dispose();
      Zerrenda z = new Zerrenda(); 
   }
   
   public void sartu (){
      dispose();
      Insert i = new Insert();
   }

}