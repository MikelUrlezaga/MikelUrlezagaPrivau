import javax.swing.*;
import java.awt.*;

public class JLabelAriketa extends JFrame {
  public JLabelAriketa() {
    
    JLabel etiqueta = new JLabel("Hola Mundo!");
    setLayout(null);
    etiqueta.setBounds(100, 100, 100, 100);

    add(etiqueta);

    setTitle("Ejemplo de JLabel");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JLabelAriketa();
  }
}