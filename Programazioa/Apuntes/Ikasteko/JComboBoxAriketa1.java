import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxAriketa1 {
    public static void main(String[] args) {
       
    
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};


        JComboBox<String> comboBox = new JComboBox<>(opciones);


        JPanel panel = new JPanel();
        panel.add(comboBox);


        JFrame frame = new JFrame("Ejemplo de JComboBox con array");
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        
    }
}
