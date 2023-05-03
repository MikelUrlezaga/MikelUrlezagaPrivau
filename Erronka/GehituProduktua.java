package Erronka;

import javax.swing.*;
import java.awt.*;


public class GehituProduktua extends JFrame {
    public GehituProduktua (){

        JLabel jLabel1 = new JLabel("   IZENA");
        JLabel jLabel2 = new JLabel("   DESKRIBAPENA");
        JLabel jLabel3 = new JLabel("   BALIOA");
        JLabel jLabel4 = new JLabel("   SALNEURRIA");
        JLabel jLabel5 = new JLabel("   ID_KATEGORIA");
        JTextField jtf1 = new JTextField ("    SARTU IZENA");
        JTextField jtf2 = new JTextField ("    SARTU DESKRIBAPENA");
        JTextField jtf3 = new JTextField ("    SARTU BALIOA");
        JTextField jtf4 = new JTextField ("    SARTU SALNEURRIA");
        JTextField jtf5 = new JTextField ("    SARTU ID_KATEGORIA");
        JButton Comit = new JButton("COMIT");
        JMenuBar menuBar = new JMenuBar();


        jLabel1.setBounds(200,100,100,50);
        setLayout(null);
        Font fontActual1 = jLabel1.getFont();
        Font fontNueva1 = fontActual1.deriveFont(fontActual1.getSize()+10f);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setFont(fontNueva1);
        add(jLabel1);

        jLabel2.setBounds(200,200,100,50);
        setLayout(null);
        Font fontActual2 = jLabel2.getFont();
        Font fontNueva2 = fontActual2.deriveFont(fontActual2.getSize()+10f);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setFont(fontNueva2);
        add(jLabel2);

        jLabel3.setBounds(200,300,100,50);
        setLayout(null);
        Font fontActual3 = jLabel3.getFont();
        Font fontNueva3 = fontActual3.deriveFont(fontActual3.getSize()+10f);
        jLabel3.setOpaque(true);
        jLabel3.setBackground(Color.WHITE);
        jLabel3.setFont(fontNueva3);
        add(jLabel3);

        jLabel4.setBounds(200,400,100,50);
        setLayout(null);
        Font fontActual4 = jLabel4.getFont();
        Font fontNueva4 = fontActual4.deriveFont(fontActual4.getSize()+10f);
        jLabel4.setOpaque(true);
        jLabel4.setBackground(Color.WHITE);
        jLabel4.setFont(fontNueva4);
        add(jLabel4);

        jLabel5.setBounds(200,500,100,50);
        setLayout(null);
        Font fontActual5 = jLabel5.getFont();
        Font fontNueva5 = fontActual5.deriveFont(fontActual5.getSize()+10f);
        jLabel5.setOpaque(true);
        jLabel5.setBackground(Color.WHITE);
        jLabel5.setFont(fontNueva5);
        add(jLabel5);

        jtf1.setBounds(400,175,150,50);
        jtf2.setBounds(400,175,150,50);
        jtf3.setBounds(400,175,150,50);
        jtf4.setBounds(400,175,150,50);
        jtf5.setBounds(400,175,150,50);
        add(jtf1);
        add(jtf2);
        add(jtf3);
        add(jtf4);
        add(jtf5);

        Comit.setBounds(700,175,150,50);
        add(Comit);


        setJMenuBar(menuBar);


        setTitle("GEHITU PRODUKTUA");
        setSize(1000, 500);
        getContentPane().setBackground(Color.PINK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GehituProduktua();
    }
}
