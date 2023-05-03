package Erronka;
import javax.swing.*;
import java.awt.*;


public class GehituKategoria extends JFrame {
    public GehituKategoria (){

        JLabel jLabel = new JLabel("   IZENA");
        JTextField jtf = new JTextField ("    SARTU KATEGORIA");
        JButton Comit = new JButton("COMIT");
        JMenuBar menuBar = new JMenuBar();


        jLabel.setBounds(200,175,100,50);
        setLayout(null);
        Font fontActual = jLabel.getFont();
        Font fontNueva = fontActual.deriveFont(fontActual.getSize()+10f);
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.WHITE);
        jLabel.setFont(fontNueva);
        add(jLabel);

        jtf.setBounds(400,175,150,50);
        add(jtf);

        Comit.setBounds(700,175,150,50);
        add(Comit);


        setJMenuBar(menuBar);


        setTitle("GEHITU KATEGORIA");
        setSize(1000, 500);
        getContentPane().setBackground(Color.PINK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GehituKategoria();
    }
}
