import javax.swing.*;
import java.awt.*;


public class Zerrenda extends JFrame {

   private JButton atzerab;
   private JTextArea textarea;
   private JPanel panel1;

   
   public Zerrenda(){
   
   
   textarea = new JTextArea("Bezeroak",7,30);
   atzerab = new JButton("Atzera");
   panel1 = new JPanel();

   atzerab.addActionListener(e -> atzera());
   
   
   panel1.add(textarea);
   panel1.add(atzerab);
   getContentPane().add(panel1);
   
   
   
   setTitle("Bezero zerrenda");
   setSize(400,200);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   
   }
   
   public void atzera (){
      dispose();
      Harrera h = new Harrera();
   }

}