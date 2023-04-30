import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploJTextField extends JFrame {
  
   public EjemploJTextField() {
    
      JTextField textField = new JTextField("Introduce tu nombre aquí");
      
      textField.setBounds(50, 50, 200, 30);
      
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.add(textField);
      
      setTitle("Ejemplo JTextField");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      add(panel);
      
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new EjemploJTextField();
   }
}
