package CODE.Funtzioak;

import java.sql.CallableStatement;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CODE.DBConexion;

/**
 * Datu baseko funtzio bati deitzeko.
 * Funtzioa, produktuen prezioa aldatzeko
 * @author Talde_2 
 * @see DBConexion
 */
public class PPKudeatu extends DBConexion {
    protected JDialog jd = new JDialog();
    protected JPanel jp = new JPanel();
    protected JComboBox jcb = new JComboBox<>();
    protected JCheckBox checkBox = new JCheckBox("%");
    protected JLabel jl = new JLabel("");
    protected JTextField jtf = new JTextField("");
    protected JButton jb = new JButton("Done");
    protected int zein = 0;

    /**
     * Kategoria gehitzeko sortzailea
     * @see #gui()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     */
    public PPKudeatu(String direccion, String erab, String pass) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        gui();
    }

    /**
     * Produktuen Prezioa aldatzeko interfazea sortzeko
     * @see #quereseres()
     */
    protected void gui() {
        checkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    zein = 1;
                } else {
                    zein = 0;
                }
            }
        });
        jcb();
        jd.setTitle("Prezioa Kudeatu (katekoriarekin)");
        jl.setText("Zenbat igo: ");
        jb.addActionListener(e -> quereseres());
        jtf.setPreferredSize(new Dimension(50, 25));
        jp.add(jl);
        jp.add(jtf);
        jp.add(jcb);
        jp.add(checkBox);
        jp.add(jb);

        // Configurar el diálogo y mostrarlo
        jd.setContentPane(jp);
        jd.setModal(true);
        jd.pack();
        jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }

    /**
     * Funtzioari deitu
     * @see #connect()
     * @see #cerrar()
     */
    protected void quereseres() {
        String kate = "" + jcb.getSelectedItem();
        try {
            connect();
            CallableStatement cs = conn.prepareCall("{ call ProduktuenPrezioaKudeatu(?, ?, ?) }");
            cs.setString(1, kate);
            cs.setDouble(2, Integer.parseInt(jtf.getText()));
            cs.setInt(3, zein);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Funcion termindada correctamente", "Done", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * JComboBox-ean item-ak zartzeko
     * @see #cerrar()
     * @see #connect()
     * @see #consulta()
     */
    protected void jcb() {
        connect();
        this.select = "ID, IZENA";
        this.from = "KATEGORIA";
        this.where = "";
        consulta();
        try {
            while (this.rs.next()) {
                String kategorias = rs.getString("IZENA");
                jcb.addItem(kategorias);
            }
            cerrar();
        } catch (Exception e) {

        }
    }
}
