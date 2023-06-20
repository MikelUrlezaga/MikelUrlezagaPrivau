package CODE.Aldaketak;

import java.awt.Dimension;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CODE.DBConexion;

/**
 * Produktuen prezioak kudeatzeko
 * @author Talde_2
 * @see DBConexion
 */
public class Prezioa extends DBConexion {
    protected JDialog ventana = new JDialog();
    protected JPanel panel = new JPanel();
    protected JLabel idjl = new JLabel("Produktuaren ID-a: ");
    protected JTextField idjtf = new JTextField("");
    protected JLabel balioajl = new JLabel("New Balioa: ");
    protected JTextField balioajtf = new JTextField("");
    protected JLabel salneurriajl = new JLabel("New Salneurria: ");
    protected JTextField salneurriajtf = new JTextField("");
    protected JButton bt = new JButton("UPDATE");

    /**
     * Kategoria gehitzeko sortzailea
     * @see #gui()
     * @param direccion konektatzen garen datu basearen esteka
     * @param erab datu basearen erabiltzailea
     * @param pass datu basearen pasahitza
     */
    public Prezioa(String direccion, String erab, String pass) {
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        gui();
    }

    /**
     * Eskari egoera aldatzeko interfazea sortzeko
     * @see #update()
     */
    protected void gui() {
        // Caracteristicas
        idjtf.setPreferredSize(new Dimension(50, 25));
        salneurriajtf.setPreferredSize(new Dimension(50, 25));
        balioajtf.setPreferredSize(new Dimension(50, 25));
        bt.addActionListener(e -> update());
        // Cosos del panel
        panel.add(idjl);
        panel.add(idjtf);
        panel.add(salneurriajl);
        panel.add(salneurriajtf);
        panel.add(balioajl);
        panel.add(balioajtf);
        panel.add(bt);
        // Cosos de la ventana
        ventana.add(panel);
        ventana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        ventana.pack();
        ventana.setTitle("Prezioa Aldatu");
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    /**
     * Datu baseko produktuen prezioa aldatzeko
     * @see #connect()
     * @see #clone()
     */
    protected void update() {
        try {
            String sql = "UPDATE PRODUKTU SET BALIOA = ?, SALNEURRIA = ? WHERE ID =?";
            connect();
            PreparedStatement statement;
            if (balioajtf.getText().equals("")) {
                sql = "UPDATE PRODUKTU SET BALIOA = BALIOA, SALNEURRIA = ? WHERE ID =?";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(salneurriajtf.getText()));
                statement.setInt(2, Integer.parseInt(idjtf.getText()));
                statement.executeUpdate();
                statement.close();
            }
            if (salneurriajtf.getText().equals("")) {
                sql = "UPDATE PRODUKTU SET BALIOA = ?, SALNEURRIA = SALNEURRIA WHERE ID =?";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(balioajtf.getText()));
                statement.setInt(2, Integer.parseInt(idjtf.getText()));
                statement.executeUpdate();
                statement.close();
            }
            if (!salneurriajtf.getText().equals("") && !balioajtf.getText().equals("")) {
                statement = conn.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(balioajtf.getText()));
                statement.setInt(2, Integer.parseInt(salneurriajtf.getText()));
                statement.setInt(3, Integer.parseInt(idjtf.getText()));
                statement.executeUpdate();
                statement.close();
            }
            cerrar();
            JOptionPane.showMessageDialog(null, "Values correctamente Actualizados", "All OK",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println(e);
            String a = "java.lang.NumberFormatException: For input string: \"" + balioajtf.getText() + "\"";
            String b = "java.lang.NumberFormatException: For input string: \"" + salneurriajtf.getText() + "\"";
            String c = "java.lang.NumberFormatException: For input string: \"" + idjtf.getText() + "\"";
            String error = "" + e;
            if (error.equals(c) || error.equals(b) || error.equals(a)) {
                JOptionPane.showMessageDialog(null, "Todos los datos deben de ser numeros :D", "...",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}