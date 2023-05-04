package Erronka;
import javax.swing.*;
import java.awt.*;


public class GehituEskaria extends JFrame {
    public GehituEskaria (){

        JLabel jLabel1 = new JLabel("   BEZERO ID");
        JLabel jLabel2 = new JLabel("   EGOERA");
        JLabel jLabel3 = new JLabel("   SALTZAILE ID");
        JLabel jLabel4 = new JLabel("   BEZERO ID");
        JLabel jLabel5 = new JLabel("   PRODUKTU ID");
        JTextField jtf1 = new JTextField ("");
        JTextField jtf2 = new JTextField ("");
        JTextField jtf3 = new JTextField ("");
        JTextField jtf4 = new JTextField ("");
        JComboBox jcb = new JComboBox<>();
        JButton Comit = new JButton("COMIT");
        JMenuBar menuBar = new JMenuBar();


        jLabel1.setBounds(200,50,200,50);
        setLayout(null);
        Font fontActual1 = jLabel1.getFont();
        Font fontNueva1 = fontActual1.deriveFont(fontActual1.getSize()+10f);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setFont(fontNueva1);
        add(jLabel1);

        jLabel2.setBounds(200,125,200,50);
        setLayout(null);
        Font fontActual2 = jLabel2.getFont();
        Font fontNueva2 = fontActual2.deriveFont(fontActual2.getSize()+10f);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setFont(fontNueva2);
        add(jLabel2);

        jLabel3.setBounds(200,200,200,50);
        setLayout(null);
        Font fontActual3 = jLabel3.getFont();
        Font fontNueva3 = fontActual3.deriveFont(fontActual3.getSize()+10f);
        jLabel3.setOpaque(true);
        jLabel3.setBackground(Color.WHITE);
        jLabel3.setFont(fontNueva3);
        add(jLabel3);

        jLabel4.setBounds(200,275,200,50);
        setLayout(null);
        Font fontActual4 = jLabel4.getFont();
        Font fontNueva4 = fontActual4.deriveFont(fontActual4.getSize()+10f);
        jLabel4.setOpaque(true);
        jLabel4.setBackground(Color.WHITE);
        jLabel4.setFont(fontNueva4);
        add(jLabel4);

        jLabel5.setBounds(200,350,200,50);
        setLayout(null);
        Font fontActual5 = jLabel5.getFont();
        Font fontNueva5 = fontActual2.deriveFont(fontActual5.getSize()+10f);
        jLabel5.setOpaque(true);
        jLabel5.setBackground(Color.WHITE);
        jLabel5.setFont(fontNueva5);
        add(jLabel5);

        jcb.addItem("Pending");
        jcb.addItem("Canceled");
        jcb.addItem("Shipped");
        jcb.setSelectedIndex(-1);
        jcb.setBounds(400, 350, 150, 50);
        getContentPane().add(jcb);

        jtf1.setBounds(400,50,150,50);
        add(jtf1);
        jtf2.setBounds(400,125,150,50);
        add(jtf2);
        jtf3.setBounds(400,200,150,50);
        add(jtf3);
        jtf4.setBounds(400,275,150,50);
        add(jtf4);



        Comit.setBounds(700,175,150,50);
        add(Comit);


        setJMenuBar(menuBar);


        setTitle("GEHITU ESKARIA");
        setSize(1000, 500);
        getContentPane().setBackground(Color.PINK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GehituEskaria();
    }
}
