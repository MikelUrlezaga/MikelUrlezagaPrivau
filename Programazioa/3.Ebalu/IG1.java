import javax.swing.JFrame;
import javax.swing.JButton;

public class IG1 {
   public static void main (String [] args){
      JFrame jf = new JFrame ("Gure lehenengo IG");
      jf.setSize(300,400);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton boton = new JButton("Haz clic");
      boton.addActionListener(e -> System.out.println("Hola mundo"));
      jf.add(boton);
      jf.setVisible(true);
   }
}  
