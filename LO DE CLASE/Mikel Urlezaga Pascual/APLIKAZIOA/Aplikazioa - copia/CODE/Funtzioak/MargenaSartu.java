package CODE.Funtzioak;

import java.sql.CallableStatement;

import javax.swing.JOptionPane;

import CODE.DBConexion;

/**
 * Datu baseko funtzio bati deitzeko.
 * Funtzioa Produktuen prezioen irabaz margina kudeatzen du
 * @author Talde_2
 * @see DBConexion
 */
public class MargenaSartu extends DBConexion {

    /**
     * Kategoria gehitzeko sortzailea
     * @see #quereseres()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     */
    public MargenaSartu(String direccion, String erab, String pass) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        quereseres();
    }

    /**
     * Funtzioari deitu
     * @see #connect()
     * @see #cerrar()
     */
    protected void quereseres() {
        try {
            connect();
            CallableStatement stmt = conn.prepareCall("{call MARGENA_SARTU}");
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Margen guztiak ondo aldatu dira", "All OK",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
