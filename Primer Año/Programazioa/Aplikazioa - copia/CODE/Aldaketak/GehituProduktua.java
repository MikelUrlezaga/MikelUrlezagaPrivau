package CODE.Aldaketak;
import javax.swing.*;

import CODE.DBConexion;

import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * Kategoria berri bat sortzeko
 * @author Talde_2
 * @see DBConexion
 */
public class GehituProduktua extends DBConexion {

    private JLabel jLabel1 = new JLabel("   IZENA");
    private JLabel jLabel2 = new JLabel("   DESKRIBAPENA");
    private JLabel jLabel3 = new JLabel("   BALIOA");
    private JLabel jLabel4 = new JLabel("   SALNEURRIA");
    private JLabel jLabel5 = new JLabel("   ID_KATEGORIA");
    private JTextField jtf1 = new JTextField ("    SARTU IZENA");
    private JTextField jtf2 = new JTextField ("  SARTU DESKRIBAPENA");
    private JTextField jtf3 = new JTextField ("    SARTU BALIOA");
    private JTextField jtf4 = new JTextField ("    SARTU SALNEURRIA");
    private JTextField jtf5 = new JTextField ("    SARTU ID_KATEGORIA");
    private JButton Comit = new JButton("COMIT");
    private JMenuBar menuBar = new JMenuBar();
    private JDialog jd = new JDialog();
    
    /**
     * Produktua gehitzeko interfazea sortzeko
     * @see #GProduktu()
     */
    public void gui (){


        jLabel1.setBounds(200,25,225,50);
        jd.setLayout(null);
        Font fontActual1 = jLabel1.getFont();
        Font fontNueva1 = fontActual1.deriveFont(fontActual1.getSize()+10f);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setFont(fontNueva1);
        jd.add(jLabel1);

        jLabel2.setBounds(200,100,225,50);
        jd.setLayout(null);
        Font fontActual2 = jLabel2.getFont();
        Font fontNueva2 = fontActual2.deriveFont(fontActual2.getSize()+10f);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setFont(fontNueva2);
        jd.add(jLabel2);

        jLabel3.setBounds(200,175,225,50);
        jd.setLayout(null);
        Font fontActual3 = jLabel3.getFont();
        Font fontNueva3 = fontActual3.deriveFont(fontActual3.getSize()+10f);
        jLabel3.setOpaque(true);
        jLabel3.setBackground(Color.WHITE);
        jLabel3.setFont(fontNueva3);
        jd.add(jLabel3);

        jLabel4.setBounds(200,250,225,50);
        jd.setLayout(null);
        Font fontActual4 = jLabel4.getFont();
        Font fontNueva4 = fontActual4.deriveFont(fontActual4.getSize()+10f);
        jLabel4.setOpaque(true);
        jLabel4.setBackground(Color.WHITE);
        jLabel4.setFont(fontNueva4);
        jd.add(jLabel4);

        jLabel5.setBounds(200,325,225,50);
        jd.setLayout(null);
        Font fontActual5 = jLabel5.getFont();
        Font fontNueva5 = fontActual5.deriveFont(fontActual5.getSize()+10f);
        jLabel5.setOpaque(true);
        jLabel5.setBackground(Color.WHITE);
        jLabel5.setFont(fontNueva5);
        jd.add(jLabel5);

        jtf1.setBounds(475,25,150,50);
        jtf2.setBounds(475,100,450,50);
        jtf3.setBounds(475,175,150,50);
        jtf4.setBounds(475,250,150,50);
        jtf5.setBounds(475,325,150,50);
        jd.add(jtf1);
        jd.add(jtf2);
        jd.add(jtf3);
        jd.add(jtf4);
        jd.add(jtf5);

        Comit.setBounds(700,250,150,50);
        Comit.addActionListener(e -> GProduktu());
        jd.add(Comit);


        jd.setJMenuBar(menuBar);


        jd.setTitle("GEHITU PRODUKTUA");
        jd.setSize(1000, 500);
        jd.getContentPane().setBackground(Color.PINK);
        jd.setLocationRelativeTo(null);
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setVisible(true);
    }

    /**
     * Datu basean produktua gehitzeko
     * @see #cerrar()
     * @see #connect()
     */
    public void GProduktu() {

        int IDa=0;
        String Izenap = jtf1.getText();
        String DeskrP = jtf2.getText();
        int Balioa = Integer.parseInt(jtf3.getText());
        int Salneurria = Integer.parseInt(jtf4.getText());
        int IdK = Integer.parseInt(jtf5.getText());


        try{
            connect();
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT MAX(ID) AS PEPE FROM PRODUKTU");
            while (rs.next()) {
                IDa=rs.getInt("PEPE");
                IDa++;
            }
            conn.close();
            statement.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("ERROREA: " +e);
        } 



        String insertSQL = "INSERT INTO PRODUKTU(ID, IZENA, DESKRIBAPENA, BALIOA, SALNEURRIA, ID_KATEGORIA) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            connect();
            PreparedStatement pS = conn.prepareStatement(insertSQL);
            pS.setInt(1,IDa);
            pS.setString(2,Izenap);
            pS.setString(3,DeskrP);
            pS.setInt(4,Balioa);
            pS.setInt(5,Salneurria);
            pS.setInt(6,IdK);
            pS.executeUpdate();
            cerrar();
                                                                                                     
        }catch(SQLException e){
            System.out.println("ERROREA: " +e);
        }   
    }

    /**
     * Produktua gehitzeko sortzailea
     * @see #gui()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     */
    public GehituProduktua(String direccion, String erab, String pass) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        gui();
    }
}
