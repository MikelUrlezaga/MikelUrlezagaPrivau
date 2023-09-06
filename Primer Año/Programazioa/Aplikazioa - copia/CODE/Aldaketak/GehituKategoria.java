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

public class GehituKategoria extends DBConexion {

    protected JDialog jd = new JDialog();
    protected JLabel jLabel = new JLabel("   IZENA");
    protected JTextField jtf = new JTextField ("    SARTU KATEGORIA");
    protected JButton Comit = new JButton("COMIT");
    protected JMenuBar menuBar = new JMenuBar();
   /**
     * Eskari gehitzeko interfazea sortzeko
     * @see #createKate()
     */
    public void gui (){



        jd.setTitle("Gehitu Kategoria");

        jLabel.setBounds(200,175,100,50);
        jd.setLayout(null);
        Font fontActual = jLabel.getFont();
        Font fontNueva = fontActual.deriveFont(fontActual.getSize()+10f);
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.WHITE);
        jLabel.setFont(fontNueva);
        jd.add(jLabel);

        jtf.setBounds(400,175,150,50);
        jd.add(jtf);

        Comit.setBounds(700,175,150,50);
        Comit.addActionListener(e -> createKate());
        jd.add(Comit);


        jd.setJMenuBar(menuBar);


        jd.setTitle("GEHITU KATEGORIA");
        jd.setBounds(500, 500, 1000, 500);
        jd.getContentPane().setBackground(Color.PINK);
        jd.setLocationRelativeTo(null);
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setVisible(true);
    }

    /**
     * Kategoria berria datu basean txertatzeko
     * @see #cerrar()
     * @see #connect()
     */
    public void createKate() {


        int IDa=0;
        String IzenaK = jtf.getText();

        try{
            connect();
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT MAX(ID) AS MAXIMOA FROM KATEGORIA");
            while (rs.next()) {
                IDa=rs.getInt("MAXIMOA");
                IDa++;
            }
            conn.close();
            statement.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("ERROREA: " +e);
        } 



        String insertSQL = "INSERT INTO KATEGORIA(ID, IZENA) VALUES (?, ?)";
        try{
            connect();
            PreparedStatement pS = conn.prepareStatement(insertSQL);
            pS.setInt(1,IDa);
            pS.setString(2,IzenaK);
            pS.executeUpdate();
            cerrar();
                                                                                                     
         }catch(SQLException e){
            System.out.println("ERROREA: " +e);
         }   
    }

    /**
     * Kategoria gehitzeko sortzailea
     * @see #gui()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     */
    public GehituKategoria(String direccion, String erab, String pass) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        gui();
    }
}
