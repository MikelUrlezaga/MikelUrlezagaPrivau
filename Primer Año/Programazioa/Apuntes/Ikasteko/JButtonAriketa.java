import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;

public class JButtonAriketa {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("Mi ventana");
      ventana.setSize(400, 300);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton boton = new JButton("Haz clic");
      boton.setPreferredSize(new Dimension(50,50)); // No sirve porque es necesario un JPanel
      boton.addActionListener(e -> System.out.println("¡Hola mundo!"));
      ventana.add(boton);
      ventana.setVisible(true);
   }
}
