import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonAriketa {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("Mi ventana");
      ventana.setSize(400, 300);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton boton = new JButton("Haz clic");
      boton.addActionListener(e -> System.out.println("¡Hola mundo!")); // interakzioa ahalbidetzen du
      ventana.add(boton);
      ventana.setVisible(true);
   }
}
