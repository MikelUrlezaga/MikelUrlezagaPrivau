import javax.swing.*;
import java.awt.*;

public class Eguneratu extends DB {
    
    private JButton boton;
    private JComboBox <Integer> combo = new JComboBox<>();
    private JTextField textfield;
    private JPanel panel;
    private JDialog jd;

    public Eguneratu(){

        boton=new JButton("Eguneratu");
        for (int j = 0; j < idak.length; j++) {
            combo.addItem(idak[j]);
        }
        textfield=new JTextField("tlfno");
        panel=new JPanel();
        jd=new JDialog();

        panel.add(combo);
        panel.add(textfield);
        panel.add(boton);
        jd.add(panel);


        jd.setTitle("Erabiltzailea eguneratu");
        jd.setSize(200,100);
        jd.setLocationRelativeTo(null);
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setVisible(true);  
    }
}
