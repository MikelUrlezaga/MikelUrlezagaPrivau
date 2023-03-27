import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;

public class IG1 {
   public static void main (String [] args){
      // botoiak
      JButton jb1 = new JButton ("1");
      JButton jb2 = new JButton ("2");
      JButton jb3 = new JButton ("3");
      jb1.setPreferredSize(new Dimension(80, 80));
      
      //panel sortu eta elementuak gehitu
      JPanel jp = new JPanel ();
      jp.add(jb1);
      jp.add(jb2);
      jp.add(jb3);
      
      //JFrame sortu eta gehitu jpanel
      JFrame jf = new JFrame ("Gure lehenengo IG");
      jf.setSize (500,200);
      jf.getContentPane().add(jp);
      jf.pack();
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setVisible(true);
   }
}