package CODE.Kontsultak;

import javax.swing.*;
import javax.swing.table.*;

import CODE.DBConexion;

import java.awt.event.*;
import java.awt.*;

/**
 * Datu basean kontsulta bat egiteko.
 * Kontsulta, Produktuen informazioa ikusteko balio du
 * @author Talde_2
 * @see DBConexion
 */
public class Produktuak extends DBConexion {
    protected JDialog ventana = new JDialog();
    protected String[] tinfo = new String[6];
    protected JTable tabla = new JTable();
    protected DefaultTableModel modelo = null;
    protected JButton bilatu = new JButton("Bilatu");
    protected JPanel bPanel = new JPanel();
    protected JTextField aux = new JTextField("");
    protected JLabel aux2 = new JLabel("Produktuaren id: ");
    protected JComboBox jcb = new JComboBox<String>();
    protected GridBagConstraints cons = null;
    
    /**
     * Eskariak ikusteko sotzailea
     * @param direccion datu baseko url-a
     * @param erab datu baseko erabiltzailea
     * @param pass datu baseko pasahitza
     * @see #xuclarRS()
     * @see #bGui()
     * @see #crearTabla()
     */
    public Produktuak(String direccion, String erab, String pass) {
        crearTabla();
        this.url = direccion;
        this.erabiltzailea = erab;
        this.pasahitza = pass;
        xuclarRS();
        bGui();
    }

    /**
     * Produktuak ikusteko pantaila sortzeko
     * @see #posicionar()
     * @see #cososDeBoton()
     * @see #kllogin()
     * @see #jcb()
     */
    protected void bGui() {
        jcb.addItem("All");
        jcb();
        posicionar();
        bilatu.addActionListener(e -> cososDeBoton());
        aux.setPreferredSize(new Dimension(250, 25));
        aux.addKeyListener(kllogin());
        ventana.add(bPanel);
        ventana.pack();
        ventana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        ventana.setTitle("Produktuak");
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    /**
     * Produktuen kategoriak JCB batean zartzeko
     * @see #connect()
     * @see #consulta()
     * @see #cerrar()
     */
    protected void jcb() {
        connect();
        this.select = "ID, IZENA";
        this.from = "KATEGORIA";
        this.where = "";
        consulta();
        try {
            while (this.rs.next()) {
                String kategorias = rs.getString("ID") + " - " + rs.getString("IZENA");
                jcb.addItem(kategorias);
            }
            cerrar();
        } catch (Exception e) {

        }
    }

    /**
     * Eskari zehatz bat bilatzeko funtzioa
     */
    protected void bilaketa() {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            Object valorCelda = modelo.getValueAt(i, 0);
            String auxid = "" + valorCelda;
            String fila = "";
            if (auxid.equals(aux.getText())) {
                fila = modelo.getColumnName(0) + ": " + modelo.getValueAt(i, 0) + " - " + modelo.getColumnName(1) + ": "
                        + modelo.getValueAt(i, 1) + " - "
                        + modelo.getColumnName(2) + ": "
                        + modelo.getValueAt(i, 2) + " - " +
                        modelo.getColumnName(3) + ": " + modelo.getValueAt(i, 3) + " - " + modelo.getColumnName(4)
                        + ": " + modelo.getValueAt(i, 4) + " - " + modelo.getColumnName(5) + ": "
                        + modelo.getValueAt(i, 5);
                JOptionPane.showMessageDialog(null, fila, auxid + "Produktua", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    /**
     * Botoiaren eginbeharrak esleitu
     * @see #bilaketa()
     * @see #crearTabla()
     * @see #xuclarRS()
     * @see #xuclarRS2()
     * @see #posicionar()
     */
    protected void cososDeBoton() {
        if (!aux.getText().equals("")) {
            bilaketa();
        } else {
            if (jcb.getSelectedItem().equals("All")) {
                crearTabla();
                bPanel.removeAll();
                posicionar();
                xuclarRS();
                recargar();
            } else {
                crearTabla();
                bPanel.removeAll();
                posicionar();
                xuclarRS2();
                recargar();
            }
        }
    }
    /**
     * pantailan agertzen den informaioa rekargatzeko
     */
    protected void recargar() {
        ventana.revalidate();
        ventana.repaint();
    }

    /**
     * Pantailan dauden objetuak ordenatzeko
     */
    protected void posicionar() {
        bPanel.setLayout(new GridBagLayout());
        //
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.gridheight = 1;
        bPanel.add(jcb, cons);
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
     * Produktuen informazioa izateko funtzioa
     * @see #connect()
     * @see #cerrar()
     * @see #consulta()
     */
    protected void xuclarRS() {
        connect();
        this.select = "P.ID, P.IZENA, K.IZENA AS KATEGORIA, P.DESKRIBAPENA,P.BALIOA , (P.SALNEURRIA-P.BALIOA) AS IRABAZI_MARJINA";
        this.from = "PRODUKTU P, KATEGORIA K";
        this.where = "P.ID_KATEGORIA=K.ID ORDER BY P.BALIOA DESC";
        consulta();
        try {
            while (this.rs.next()) {
                tinfo[0] = rs.getString("ID");
                tinfo[1] = rs.getString("IZENA");
                tinfo[2] = rs.getString("KATEGORIA");
                tinfo[3] = rs.getString("DESKRIBAPENA");
                tinfo[4] = rs.getString("BALIOA");
                tinfo[5] = rs.getString("IRABAZI_MARJINA");
                tabla.setBackground(Color.decode("#9df5b4"));
                modelo.addRow(tinfo);
                tinfo = new String[6];
            }
            cerrar();
        } catch (Exception e) {

        }
    }
    /**
     * Produktuen kategoria zeatz bateko informazioa izateko funtzioa
     * @see #connect()
     * @see #cerrar()
     * @see #consulta()
     */
    protected void xuclarRS2() {
        connect();
        String str = "" + jcb.getSelectedItem();
        int id = 0;
        char charaux;
        try {
            for (int i = 0; i < str.length(); i++) {
                charaux = str.charAt(i);
                id = Integer.parseInt(id + "" + charaux);
            }
        } catch (Exception e) {

        }

        this.select = "P.ID, P.IZENA, K.IZENA AS KATEGORIA, P.DESKRIBAPENA,P.BALIOA , (P.SALNEURRIA-P.BALIOA) AS IRABAZI_MARJINA";
        this.from = "PRODUKTU P, KATEGORIA K";
        this.where = "P.ID_KATEGORIA=K.ID AND P.ID_KATEGORIA= " + id + " ORDER BY P.BALIOA DESC";
        consulta();
        try {
            while (this.rs.next()) {
                tinfo[0] = rs.getString("ID");
                tinfo[1] = rs.getString("IZENA");
                tinfo[2] = rs.getString("KATEGORIA");
                tinfo[3] = rs.getString("DESKRIBAPENA");
                tinfo[4] = rs.getString("BALIOA");
                tinfo[5] = rs.getString("IRABAZI_MARJINA");
                tabla.setBackground(Color.decode("#9df5b4"));
                modelo.addRow(tinfo);
                tinfo = new String[6];
            }
            cerrar();
        } catch (Exception e) {

        }
    }

    /**
     * Taula zortzeko funtzioa
     */
    protected void crearTabla() {
        modelo = new DefaultTableModel(null,
                new String[] { "ID", "IZENA", "KATEGORIA", "DESKRIBAPENA", "BALIOA", "IRABAZI_MARJINA" }) {
            boolean[] columnEditables = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        };
        tabla.setModel(modelo);
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
