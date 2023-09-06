package CODE;

import java.sql.*;

import javax.swing.JOptionPane;
/**
 * Konexioa kudeatzeko programaren atala
 * @author Talde_2
 */
public class DBConexion {
    protected String url;
    protected String erabiltzailea;
    protected String pasahitza;
    protected String select = null;
    protected String from = null;
    protected Connection conn = null;
    protected Statement statement = null;
    protected String where = "";
    protected ResultSet rs = null;
    /**
     * Datu basea kudeatzeko atala hutsik dagoen sortzailea 
     */
    public DBConexion() {
    }
    /**
     * Datu basea kudeatzeko atalaren sortzailea
     * @param url ze datu barasera conectatuko garen jakiteko
     * @param erabiltzailea datu basearen erabiltzailea
     * @param pasahitza datu basearen pasahitza
     * @see #connect() para conectarse a la base de datos
     */
    public DBConexion(String url, String erabiltzailea, String pasahitza) {
        this.url = url;
        this.erabiltzailea = erabiltzailea;
        this.pasahitza = pasahitza;
        connect();
    }
    /**
     * Datu basea kudeatzeko
     */
    protected void connect() {
        try {
            conn = DriverManager.getConnection(url, erabiltzailea, pasahitza);
            statement = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la Base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Datu base barruan consuta sinple bat egiteko
     */
    protected void consulta() {
        String consulta = "";
        if (!where.equals("")) {
            consulta = "SELECT " + select + " FROM " + from + " WHERE " + where;
        } else {
            consulta = "SELECT " + select + " FROM " + from;
        }
        try {
            rs = statement.executeQuery(consulta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La consulta no se creo correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Datu basean erabiltzen ditugun objetuak ixteko
     */
    protected void cerrar() {
        try {
            if (!(rs == null)) {
                rs.close();
            }
            if (!(statement == null)) {
                statement.close();
            }
            if (!(conn == null)) {
                conn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La base de datos no se pudo cerrar correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
