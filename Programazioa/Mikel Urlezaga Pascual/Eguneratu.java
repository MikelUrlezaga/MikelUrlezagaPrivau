import javax.swing.*;
import java.awt.*;

public class Eguneratu extends JDialog {
    
    private JButton boton;
    private JComboBox <Integer> combo = new JComboBox<>();
    private JTextField textfield;
    private JPanel panel;

    DB db = new DB();
    private int [] id;
    


    public Eguneratu(){

        id = db.bezeroak();

        boton=new JButton("Eguneratu");

        for (int j = 0; j < id.length; j++) {
            combo.addItem(id[j]);
        }
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
