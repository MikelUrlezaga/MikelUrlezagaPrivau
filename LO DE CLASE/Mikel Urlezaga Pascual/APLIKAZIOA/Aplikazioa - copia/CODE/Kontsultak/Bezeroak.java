package CODE.Kontsultak;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import CODE.DBConexion;

import java.awt.*;
import java.awt.event.*;

/**
 * Datu basean kontsulta bat egiteko.
 * Kontsulta, bezeroen informazioa ikusteko balio du
 * @author Talde_2
 * @see DBConexion
 */
public class Bezeroak extends DBConexion {
    protected JDialog ventana = new JDialog();
    protected String[] tinfo = new String[6];
    protected JTable tabla = new JTable();
    protected DefaultTableModel modelo = null;
    protected JButton bilatu = new JButton("Bilatu");
    protected JPanel bPanel = new JPanel();
    protected JTextField aux = new JTextField("");
    protected JLabel aux2 = new JLabel("Bezeroaren id: ");
    protected GridBagConstraints cons = null;

    /**
     * Bezeroak ikusteko sotzailea
     * @param direccion datu baseko url-a
     * @param erab datu baseko erabiltzailea
     * @param pass datu baseko pasahitza
     * @see #xuclarRS()
     * @see #bGui()
     * @see #crearTabla()
     */
    public Bezeroak(String direccion, String erab , String pass) {
        crearTabla();
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        xuclarRS();
        bGui();
    }

    /**
     * Bezeroak ikusteko pantaila sortzeko
     * @see #posicionar()
     * @see #bilaketa()
     * @see #kllogin()
     */
    protected void bGui() {
        posicionar();
        bilatu.addActionListener(e -> bilaketa());
        tabla.setModel(modelo);
        aux.setPreferredSize(new Dimension(250, 25));
        aux.addKeyListener(kllogin());
        ventana.add(bPanel);
        ventana.pack();
        ventana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        ventana.setTitle("Bezeroak");
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    /**
     * Bezero zehatz bat bilatzeko funtzioa
     */
    protected void bilaketa() {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            Object valorCelda = modelo.getValueAt(i, 0);
            String auxid = "" + valorCelda;
            String fila = "";
            if (auxid.equals(aux.getText())) {
                fila = modelo.getColumnName(0) + ": " + modelo.getValueAt(i, 0) + " - " + modelo.getColumnName(1) + ": " + modelo.getValueAt(i, 1) + " - "
                        + modelo.getColumnName(2) + ": "
                        + modelo.getValueAt(i, 2) + " - " +
                        modelo.getColumnName(3) + ": " + modelo.getValueAt(i, 3) + " - " + modelo.getColumnName(4) + ": " + modelo.getValueAt(i, 4) + " - " + modelo.getColumnName(5) + ": " + modelo.getValueAt(i, 5);
                JOptionPane.showMessageDialog(null, fila, auxid + " Bezeroa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    /**
     * Pantailan dauden objetuak ordenatzeko
     */
    protected void posicionar() {
        bPanel.setLayout(new GridBagLayout());
        //
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        bPanel.add(aux2, cons);
        //
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        bPanel.add(aux, cons);
        //
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        bPanel.add(bilatu, cons);
        //
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 3;
        cons.gridheight = 3;
        bPanel.add(new JScrollPane(tabla), cons);
    }

    /**
     * Bezeroen informazioa izateko funtzioa
     * @see #connect()
     * @see #cerrar()
     * @see #consulta()
     */
    protected void xuclarRS() {
        this.select = "B.ID, B.IZENA, B.ABIZENA, B.HELBIDEA, B.EMAILA, BT.ZENBAKIA";
        this.from = "BEZERO B, BEZERO_TELEFONO BT";
        this.where = "B.ID = BT.ID_BEZERO";
        connect();
        consulta();
        try {
            while (this.rs.next()) {
                tinfo[0] = rs.getString("ID");
                tinfo[1] = rs.getString("IZENA");
                tinfo[2] = rs.getString("ABIZENA");
                tinfo[3] = rs.getString("HELBIDEA");
                tinfo[4] = rs.getString("EMAILA");
                tinfo[5] = rs.getString("ZENBAKIA");
                tabla.setBackground(Color.decode("#9df5b4"));
                modelo.addRow(tinfo);
                tinfo = new String[6];
            }
            cerrar();
        } catch (Exception e) {

        }
    }

    /**
     * Taula sortzeko
     */
    protected void crearTabla() {
        modelo = new DefaultTableModel(null,
                new String[] { "ID", "IZENA", "ABIZENA", "HELBIDEA", "EMAILA", "ZENBAKIA" }) {
            boolean[] columnEditables = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        };
    }

    /**
     * KeyListener-a sortzeko
     * @return KeyListener 
     * @see #bilaketa()
     */
    protected KeyListener kllogin() {
        KeyListener kl = new KeyListener() {
            public void keyTyped(KeyEvent e) {
                // Este método se llama cuando el usuario ha ingresado texto
            }

            public void keyPressed(KeyEvent e) {
                // Este método se llama cuando se presiona una tecla
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Aquí colocas el código que deseas ejecutar al presionar Enter
                    bilaketa();
                }
            }

            public void keyReleased(KeyEvent e) {
                // Este método se llama cuando se libera una tecla
            }
        };
        return kl;
    }

}
