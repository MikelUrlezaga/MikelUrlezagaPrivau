import javax.swing.*;
import java.awt.*;

public class Eguneratu extends JDialog {
    
    private JButton boton;
    private JComboBox combo;
    private JTextField textfield;
    private JPanel panel;

    public Eguneratu(){

        boton=new JButton("Eguneratu");
        combo=new JComboBox();
        textfield=new JTextField("tlfno");
        panel=new JPanel();

        panel.add(combo);
        panel.add(textfield);
        panel.add(boton);
        add(panel);


        setTitle("Erabiltzailea eguneratu");
        setSize(200,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);  
    }
}
