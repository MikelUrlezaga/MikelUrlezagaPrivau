import javax.swing.*;
import java.awt.*;

public class Ariketa3 {

   public static void main (String [] args){
      JFrame jf = new JFrame("Ariketa3");
      JTextField jtf = new JTextField ("0");
      JButton jbPlus = new JButton ("+");
      JButton jbMinus = new JButton ("-");
      jbPlus.addActionListener (e -> gehitu(jtf));
      jbMinus.addActionListener (e -> kendu(jtf));
      //JPanel jp = new JPanel();
      //jp.add(jb);
      //jp.add(jtf);
      jf.add(jbPlus);
      jf.add(jbMinus);
      jf.add(jtf);
      //jf.getContentPane().add(jp);  
      jf.setLayout(new GridLayout(1,3));    
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(200,100);
      jf.setVisible(true);
   }
   
   public static void gehitu (JTextField jtf){
      //bihurtu string to int
      int zbk = Integer.parseInt(jtf.getText());
      zbk++;
      jtf.setText(""+zbk);
   }
   
   public static void kendu (JTextField jtf){
      //bihurtu string to int
      int zbk = Integer.parseInt(jtf.getText());
      zbk--;
      jtf.setText(""+zbk);
   }
}