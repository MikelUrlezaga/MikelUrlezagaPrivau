import javax.swing.*;
import java.awt.*;

public class EjemploJTextArea {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ejemplo JTextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        
        JTextArea textArea = new JTextArea("Kaixo",5, 20);

        
        frame.getContentPane().add(BorderLayout.CENTER, textArea);

        
        frame.setVisible(true);
    }
}
