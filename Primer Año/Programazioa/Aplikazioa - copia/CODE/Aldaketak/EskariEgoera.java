package CODE.Aldaketak;
import javax.swing.*;

import CODE.DBConexion;

import java.awt.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Eskari egoera aldatzeko
 * @author Talde_2
 * @see DBConexion
 */
public class EskariEgoera extends DBConexion {

    protected JLabel jLabel1 = new JLabel("   ESKARI ID");
    protected JLabel jLabel2 = new JLabel("   EGOERA");
    protected JTextField jtf1 = new JTextField ("");
    protected JComboBox jcb = new JComboBox<>();
    protected JButton Comit = new JButton("COMIT");
    protected JMenuBar menuBar = new JMenuBar();
    protected JDialog jd = new JDialog();

    /**
     * Eskari egoera aldatzeko interfazea sortzeko
     * @see #aldaketa()
     */
    public void gui (){

        jLabel1.setBounds(200,150,200,50);
        jd.setLayout(null);
        Font fontActual1 = jLabel1.getFont();
        Font fontNueva1 = fontActual1.deriveFont(fontActual1.getSize()+10f);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.WHITE);
        jLabel1.setFont(fontNueva1);
        jd.add(jLabel1);

        jLabel2.setBounds(200,300,200,50);
        jd.setLayout(null);
        Font fontActual2 = jLabel2.getFont();
        Font fontNueva2 = fontActual2.deriveFont(fontActual2.getSize()+10f);
        jLabel2.setOpaque(true);
        jLabel2.setBackground(Color.WHITE);
        jLabel2.setFont(fontNueva2);
        jd.add(jLabel2);

        jcb.addItem("Pending");
        jcb.addItem("Canceled");
        jcb.addItem("Shipped");
        jcb.setSelectedIndex(-1);
        jcb.setBounds(400, 300, 150, 50);
        jd.getContentPane().add(jcb);

        jtf1.setBounds(400,150,150,50);
        jd.add(jtf1);


        Comit.setBounds(700,175,150,50);
        Comit.addActionListener(e -> aldaketa());
        jd.add(Comit);


        jd.setJMenuBar(menuBar);


        jd.setTitle("ESKARI EGOERA ALDATU");
        jd.setSize(1000, 500);
        jd.getContentPane().setBackground(Color.PINK);
        jd.setLocationRelativeTo(null);
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setVisible(true);
    }

    /**
     * Aldaketa egiteko
     * @see #connect()
     * @see #cerrar()
     */
    public void aldaketa () {
        
        int IDa = Integer.parseInt(jtf1.getText());

        String JEgoera = (String) jcb.getSelectedItem();
        int Egoera=1;
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

        String updateSQL = "UPDATE ESKARI SET ID_EGOERA = ? WHERE ID = ?";
        try{
            connect();
            PreparedStatement pS = conn.prepareStatement(updateSQL);
            pS.setInt(1,Egoera);
            pS.setInt(2,IDa);
            pS.executeUpdate();
            cerrar();
                                                                                                     
        }catch(SQLException e){
            System.out.println("ERROREA: " +e);
        }   


    }

    /**
     * Eskaria aldatzeko sortzailea
     * @param direccion datu basearen url-a
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     * @see #gui()
     */
    public EskariEgoera(String direccion, String erab, String pass) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        gui();
    }
}

