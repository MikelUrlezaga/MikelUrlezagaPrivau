import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class JTextFieldAriketa{
   public static void main(String[] args) {
      JFrame lehio = new JFrame("Lehenengo Interfaze-Grafikoa");
      lehio.setSize(400, 300);
      lehio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      lehio.setVisible(true);

      JTextField jtf = new JTextField ("JTextField");
      jtf.setBounds(200,200,200,200);
      lehio.add(jtf);
      JTextArea jta = new JTextArea ("JTextArea");
      jta.setBounds(200,200,200,200);
      lehio.add(jta);
   }
}