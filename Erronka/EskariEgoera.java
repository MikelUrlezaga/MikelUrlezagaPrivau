package Erronka;
import javax.swing.*;
import java.awt.*;


public class EskariEgoera extends JFrame {
    public EskariEgoera (){

        JLabel jLabel1 = new JLabel("   ESKARI ID");
        JLabel jLabel2 = new JLabel("   EGOERA");
        JLabel jLabel3 = new JLabel("   Pending / Canceled / Shipped");
        JTextField jtf1 = new JTextField ("");
        JTextField jtf2 = new JTextField ("");
        JButton Comit = new JButton("COMIT");
        JMenuBar menuBar = new JMenuBar();


        jLabel1.setBounds(200,150,200,50);
        setLayout(null);
        Font fontActual1 = jLabel1.getFont();
        Font fontNueva1 = fontActual1.deriveFont(fontActual1.getSize()+10f);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setFont(fontNueva1);
        add(jLabel1);

        jLabel2.setBounds(200,300,200,50);
        setLayout(null);
        Font fontActual2 = jLabel2.getFont();
        Font fontNueva2 = fontActual2.deriveFont(fontActual2.getSize()+10f);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setFont(fontNueva2);
        add(jLabel2);

        jLabel3.setBounds(200,350,350,50);
        setLayout(null);
        Font fontActual3 = jLabel3.getFont();
        Font fontNueva3 = fontActual3.deriveFont(fontActual3.getSize()+10f);
        jLabel3.setOpaque(true);
        jLabel3.setBackground(Color.WHITE);
        jLabel3.setFont(fontNueva2);
        add(jLabel3);

        jtf1.setBounds(400,150,150,50);
        add(jtf1);

        jtf2.setBounds(400,300,150,50);
        add(jtf2);

        Comit.setBounds(700,175,150,50);
        add(Comit);


        setJMenuBar(menuBar);


        setTitle("ESKARI EGOERA ALDATU");
        setSize(1000, 500);
        getContentPane().setBackground(Color.PINK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EskariEgoera();
    }
}

