package CODE.Aldaketak;

import javax.swing.*;

import CODE.DBConexion;

import java.awt.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Eskaria gehitzeko
 * @author Talde_2
 * @see DBConexion
 */
public class GehituEskaria extends DBConexion {

    private JLabel jLabel1 = new JLabel("   BEZERO ID");
    private JLabel jLabel2 = new JLabel("   EGOERA");
    private JLabel jLabel4 = new JLabel("   ZENBATEKOA");
    private JLabel jLabel5 = new JLabel("   PRODUKTU ID");
    private JTextField jtf1 = new JTextField("");
    private JTextField jtf2 = new JTextField("");
    private JTextField jtf4 = new JTextField("");
    private JComboBox jcb = new JComboBox<>();
    private JButton Comit = new JButton("COMIT");
    private JMenuBar menuBar = new JMenuBar();
    private JDialog jd = new JDialog();
    private int idsal = 0;

      /**
     * Eskari gehitzeko interfazea sortzeko
     * @see #geskaria()
     */
    public void gui() {

        jLabel1.setBounds(200, 50, 200, 50);
        jd.setLayout(null);
        Font fontActual1 = jLabel1.getFont();
        Font fontNueva1 = fontActual1.deriveFont(fontActual1.getSize() + 10f);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setFont(fontNueva1);
        jd.add(jLabel1);

        jLabel2.setBounds(200, 350, 200, 50);
        jd.setLayout(null);
        Font fontActual2 = jLabel2.getFont();
        Font fontNueva2 = fontActual2.deriveFont(fontActual2.getSize() + 10f);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setFont(fontNueva2);
        jd.add(jLabel2);

        jd.setLayout(null);

        jLabel4.setBounds(200, 275, 200, 50);
        jd.setLayout(null);
        Font fontActual4 = jLabel4.getFont();
        Font fontNueva4 = fontActual4.deriveFont(fontActual4.getSize() + 10f);
        jLabel4.setOpaque(true);
        jLabel4.setBackground(Color.WHITE);
        jLabel4.setFont(fontNueva4);
        jd.add(jLabel4);

        jLabel5.setBounds(200, 125, 200, 50);
        jd.setLayout(null);
        Font fontActual5 = jLabel5.getFont();
        Font fontNueva5 = fontActual2.deriveFont(fontActual5.getSize() + 10f);
        jLabel5.setOpaque(true);
        jLabel5.setBackground(Color.WHITE);
        jLabel5.setFont(fontNueva5);
        jd.add(jLabel5);

        jcb.addItem("Pending");
        jcb.addItem("Canceled");
        jcb.addItem("Shipped");
        jcb.setSelectedIndex(-1);
        jcb.setBounds(400, 350, 150, 50);
        jd.getContentPane().add(jcb);

        jtf1.setBounds(400, 50, 150, 50);
        jd.add(jtf1);
        jtf2.setBounds(400, 125, 150, 50);
        jd.add(jtf2);
        jtf4.setBounds(400, 275, 150, 50);
        jd.add(jtf4);

        Comit.setBounds(700, 175, 150, 50);
        Comit.addActionListener(e -> geskaria());
        jd.add(Comit);

        jd.setJMenuBar(menuBar);

        jd.setTitle("GEHITU ESKARIA");
        jd.setSize(1000, 500);
        jd.getContentPane().setBackground(Color.PINK);
        jd.setLocationRelativeTo(null);
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setVisible(true);
    }

      /**
     * Eskaria egiteko
     * @see #connect()
     * @see #cerrar()
     */
    public void geskaria() {

        int IDa = 0;
        int Egoera = 1;
        int id_bezero = Integer.parseInt(jtf1.getText());
        int lerro = 0;
        int id_produktu = Integer.parseInt(jtf2.getText());
        int zenbatekoa = Integer.parseInt(jtf4.getText());
        double salneurri = 0;

        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String formattedDate = sdf.format(date);

        String JEgoera = (String) jcb.getSelectedItem();
        switch (JEgoera) {
            case "Pending":
                Egoera = 1;
                break;

            case "Canceled":
                Egoera = 2;
                break;

            case "Shipped":
                Egoera = 3;
                break;
        }

        try {
            connect();
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT MAX(ID) AS PEPE FROM ESKARI");
            while (rs.next()) {
                IDa = rs.getInt("PEPE");
                IDa++;
            }
            conn.close();
            statement.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("ERROREA: " + e);
        }

        try {
            connect();
            statement = conn.createStatement();
            ResultSet rs = statement
                    .executeQuery("SELECT MAX(ID_LERRO) AS PEPA FROM ESKARI_LERRO WHERE ID_ESKARI = " + IDa);
            while (rs.next()) {
                lerro = rs.getInt("PEPA");
                lerro++;
            }
            conn.close();
            statement.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("ERROREA: " + e);
        }

        try {
            connect();
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT SALNEURRIA AS PEPO FROM PRODUKTU WHERE ID = " + id_produktu);
            while (rs.next()) {
                salneurri = rs.getDouble("PEPO");
            }
            conn.close();
            statement.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("ERROREA: " + e);
        }

        String insertSQL1 = "INSERT INTO ESKARI(ID, ID_BEZERO, ID_EGOERA, ID_SALTZAILE, ESKAERA_DATA) VALUES (?, ?, ?, ?, TO_DATE(?,'DD/MM/YY'))";
        try {
            connect();
            PreparedStatement pS = conn.prepareStatement(insertSQL1);
            pS.setInt(1, IDa);
            pS.setInt(2, id_bezero);
            pS.setInt(3, Egoera);
            pS.setInt(4, idsal);
            pS.setString(5, formattedDate);
            pS.executeUpdate();
            cerrar();

        } catch (SQLException e) {
            System.out.println("ERROREA: " + e);
        }

        String insertSQL2 = "INSERT INTO ESKARI_LERRO(ID_ESKARI, ID_LERRO, ID_PRODUKTU, KOPURUA, SALNEURRIA) VALUES (?, ?, ?, ?, ?))";
        try {
            connect();
            PreparedStatement pS = conn.prepareStatement(insertSQL2);
            pS.setInt(1, IDa);
            pS.setInt(2, lerro);
            pS.setInt(3, id_produktu);
            pS.setInt(4, zenbatekoa);
            pS.setDouble(5, salneurri);
            pS.executeUpdate();
            cerrar();

        } catch (SQLException e) {
            System.out.println("ERROREA: " + e);
        }
    }

    /**
     * Eskaera gehitzeko sortzailea
     * @see #gui()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     * @param id logeatu den saltzailearen id-a jakiteko
     */
    public GehituEskaria(String direccion, String erab, String pass, int id) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        idsal = id;
        gui();
    }

}
