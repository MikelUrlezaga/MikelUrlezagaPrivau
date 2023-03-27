import javax.swing.*;

public class Ariketa1 {

   public static void main (String [] args){
      JFrame jf = new JFrame("Ariketa1");
      JTextField jtf = new JTextField ("Idatzi...");
      JButton jb = new JButton ("Klikatu");
      jb.addActionListener (e -> testua(jtf));
      JPanel jp = new JPanel();
      jp.add(jb);
      jp.add(jtf);
      jf.getContentPane().add(jp);      
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(200,100);
      jf.setVisible(true);
   }
   
   public static void testua (JTextField jtf){
      jtf.setText("Kaxo mundua");
   }
}