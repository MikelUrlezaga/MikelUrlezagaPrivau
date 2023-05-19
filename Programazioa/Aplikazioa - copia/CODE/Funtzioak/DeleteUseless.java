package CODE.Funtzioak;

import java.sql.CallableStatement;
import java.sql.Types;

import javax.swing.JOptionPane;

import CODE.DBConexion;

/**
 * Datu baseko funtzio bati deitzeko.
 * Funtzioa Behar ez ditugun eskariak ezabatzen ditu
 * @author Talde_2
 * @see DBConexion
 */
public class DeleteUseless extends DBConexion {

    /**
     * Kategoria gehitzeko sortzailea
     * @see #quereseres()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     */
    public DeleteUseless(String direccion, String erab, String pass) {
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
            String sql = "{ CALL DELETE_USELESS(?) }";
            CallableStatement stmt = conn.prepareCall(sql);
            stmt.registerOutParameter(1, Types.INTEGER);
            stmt.execute();
            int cantidadBorrada = stmt.getInt(1);
            JOptionPane.showMessageDialog(null, "Behar ez ditugun eskari guztiak ezabatu dira, Kop: " + cantidadBorrada, "All OK",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
