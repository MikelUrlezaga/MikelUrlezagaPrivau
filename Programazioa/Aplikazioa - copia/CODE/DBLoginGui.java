package CODE;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
/**
 * Login horrialdea
 * @author Talde_2
 * @see DBConexion
 */
public class DBLoginGui extends DBConexion {

    protected JFrame jf = new JFrame("Establecer conexion :D");
    protected JPanel login = new JPanel();
    protected JTextField erab = new JTextField("");
    protected JLabel jlerab = new JLabel("USER");
    protected JPasswordField pass = new JPasswordField();
    protected JLabel jlpass = new JLabel("PASSWORD");
    protected JTextField info = new JTextField();
    protected JLabel jlinfo = new JLabel("info");
    protected JTextField taula = new JTextField();
    protected JLabel jltaula = new JLabel("taula");
    protected JButton jblogin = new JButton("Send");
    protected JButton jbexit = new JButton("X");
    protected GridBagConstraints constraints = null;
    protected JLabel error = new JLabel();
    protected JLabel error2 = new JLabel();
    protected boolean boologin = false;
    protected Color green = Color.decode("#9df5b4");
    protected Color purple = Color.decode("#c29df5");
    protected Color blue = Color.decode("#9ddbf5");
    protected Color yellow = Color.decode("#f5f49d");
    protected Color red = Color.decode("#f59d9d");
    protected Color black = Color.decode("#171717");
    protected Color pink = Color.decode("#f59df2");
    protected int incorrectCont = 0;
    protected JCheckBox checkBox = new JCheckBox();
    String[] iduser = new String[0];
    int ideluserlogeado = 0;
    String[] usuarios = new String[0];
    String[] contras = new String[0];

    /**
     * Login-aren sortzailea
     * @see #datuaKarg()
     * @see #gui()
     */
    public DBLoginGui() {
        this.url = "jdbc:oracle:thin:@//192.168.102.123:1521/xepdb1";
        this.erabiltzailea = "E2";
        this.pasahitza = this.erabiltzailea;
        datuaKarg();
        gui();
    }

    /**
     * Login atalari itxura emateko
     * @see #ordenar()
     */
    private void gui() {
        jbexit.addActionListener(e -> jf.dispose());
        jlerab.setPreferredSize(new Dimension(110, 25));
        jlpass.setPreferredSize(new Dimension(110, 25));
        erab.setPreferredSize(new Dimension(232, 25));
        pass.setPreferredSize(new Dimension(232, 25));
        jblogin.setPreferredSize(new Dimension(50, 25));
        jbexit.setPreferredSize(new Dimension(50, 25));
        pass.setEchoChar('+');
        checkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    pass.setEchoChar((char) 0);
                } else {
                    pass.setEchoChar('+');
                }
            }
        });
        checkBox.setBackground(pink);
        erab.setForeground(black);
        pass.setForeground(black);
        jlerab.setForeground(black);
        jlpass.setForeground(black);
        error.setForeground(yellow);
        error2.setForeground(yellow);
        jblogin.setBackground(blue);
        jbexit.setBackground(red);
        erab.setBackground(green);
        pass.setBackground(green);
        erab.setBorder(BorderFactory.createLineBorder(purple));
        pass.setBorder(BorderFactory.createLineBorder(purple));
        jblogin.setBorder(BorderFactory.createLineBorder(purple));
        jbexit.setBorder(BorderFactory.createLineBorder(red));
        ordenar();
        login.setBackground(pink);
        jf.add(login);
        //
        jf.setLocation(700, 350);
        // jf.setAlwaysOnTop(true);
        jf.setSize(450, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setUndecorated(true);
        jf.setVisible(true);
    }

    /**
     * Login dauden objetuak pantailan ondo kokatzeko
     */
    private void ordenar() {
        login.setLayout(new GridBagLayout());
        ///
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(jlerab, constraints);
        //
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(erab, constraints);
        ///
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(jlpass, constraints);
        //
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(pass, constraints);
        ///
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(jblogin, constraints);
        //
        constraints = new GridBagConstraints();
        constraints.gridx = 4;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(jbexit, constraints);
        ///
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(error, constraints);
        //
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(error2, constraints);
        //
        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        login.add(checkBox, constraints);
    }

    /**
     * Loginean beharrezkoa den informzaioa edukitzeko
     * @see #connect()
     * @see #consulta()
     * @see #cerrar()
     */
    protected void datuaKarg() {
        this.select = "*";
        this.from = "SALTZAILE";
        connect();
        consulta();
        int c = 0;
        try {
            while (this.rs.next()) {
                iduser = Arrays.copyOf(usuarios, usuarios.length + 1);
                usuarios = Arrays.copyOf(usuarios, usuarios.length + 1);
                contras = Arrays.copyOf(usuarios, usuarios.length + 1);
                iduser[c] = rs.getString("ID");
                usuarios[c] = rs.getString("ERABILTZAILEA");
                contras[c] = rs.getString("PASAHITZA");
                c++;
            }
            cerrar();
        } catch (Exception e) {
            
        }
    }

    /**
     * Logueatzeko erabilzen den prozezuaren funtzioa
     */
    protected void login() {
        if (incorrectCont == 2) {
            jf.dispose();
        } else {
            boolean correctUser = false;
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i].equals(erab.getText()) && contras[i].equals(pass.getText())) {
                    correctUser = true;
                    try {
                        ideluserlogeado = Integer.parseInt(iduser[i]);
                    } catch (Exception e) {

                    }
                    break;
                } else {
                    correctUser = false;
                }
            }

            if (!correctUser) {
                incorrectCont++;
                int aux = 3 - incorrectCont;
                error.setText("Incorrect Connection/User/Password Ô_ô");
                error2.setText("Remaining attempts: " + aux);
                boologin = false;
            } else {
                boologin = true;
                incorrectCont = 0;
            }
        }

    }

}