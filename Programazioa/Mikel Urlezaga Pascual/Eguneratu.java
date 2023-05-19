import javax.swing.*;
import java.awt.*;

public class Eguneratu extends DB {
    
    private JButton boton;
    private JComboBox <Integer> combo = new JComboBox<>();
    private JTextField textfield;
    private JPanel panel;
<<<<<<< HEAD
    DB db = new DB();
    private int [] id;
    
=======
    private JDialog jd;
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35

    public Eguneratu(){

        id = db.bezeroak();
        boton=new JButton("Eguneratu");
<<<<<<< HEAD
        for (int j = 0; j < id.length; j++) {
            combo.addItem((Integer)id[j]);
=======
        for (int j = 0; j < idak.length; j++) {
            combo.addItem(idak[j]);
>>>>>>> 67770de223d7b9793e375955db30e768b94dee35
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
