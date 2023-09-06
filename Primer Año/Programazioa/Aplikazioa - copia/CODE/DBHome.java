package CODE;

import javax.swing.*;

import CODE.Aldaketak.EskariEgoera;
import CODE.Aldaketak.GehituEskaria;
import CODE.Aldaketak.GehituKategoria;
import CODE.Aldaketak.GehituProduktua;
import CODE.Aldaketak.Prezioa;
import CODE.Funtzioak.DeleteUseless;
import CODE.Funtzioak.MargenaSartu;
import CODE.Funtzioak.PPKudeatu;
import CODE.Kontsultak.Bezeroak;
import CODE.Kontsultak.Eskariak;
import CODE.Kontsultak.Produktuak;

import java.awt.event.*;
import java.net.*;

/**
 * Home horrialdea sortzeko programa non DBLogin-aren extensio bat da
 * @author Talde_2
 * @see DBLoginGui#DBLoginGui()
 */
public class DBHome extends DBLoginGui {
    protected JFrame jd = new JFrame();
    protected JPanel hasiera = new JPanel();
    protected JMenuBar jmb = new JMenuBar();
    protected JMenuItem cerrar = new JMenuItem("Exit");
    protected JMenuItem logOut = new JMenuItem("LogOut");
    // Kontsultak
    protected JMenu menukontsultak = new JMenu("Kontsultak");
    protected JMenuItem mibezeroak = new JMenuItem("Bezeroak");
    protected JMenuItem miproduktuak = new JMenuItem("Produktuak");
    protected JMenuItem mieskariak = new JMenuItem("Eskariak");
    // Aldaketas
    protected JMenu menualdaketas = new JMenu("Zereginak");
    protected JMenuItem miprezioa = new JMenuItem("Prezioa Aldatu");
    protected JMenuItem mikategoria = new JMenuItem("Kategoria Gehitu");
    protected JMenuItem mieskariegoera = new JMenuItem("Eskari Egoera Aldatu");
    protected JMenuItem miproduktugehitu = new JMenuItem("Produktua Gehitu");
    protected JMenuItem migeitueskaria = new JMenuItem("Gehitu Eskaria");
    // Funtzioak
    protected JMenu menufuntzio = new JMenu("Zeregin Orokorrak");
    protected JMenuItem mideleteuseless = new JMenuItem("Eskari Zaharrak Ezabatu");
    protected JMenuItem miprezio = new JMenuItem("Prezioa Kudeatu (katekoriarekin)");
    protected JMenuItem mimargenasartu = new JMenuItem("Prezio Margena Sartu");

    // Cosos del menu
    protected int intaux = 7;

    /**
     * Home sortzeko sortzailea non bi funtzioei deitzen dio
     * @see #liseners()
     * @see #menu()
     */
    public DBHome() {
        liseners();
        menu();
    }
    /**
     * Klase honetan homen dagoen menuari erabiliko ditugun item eta listener-ak satzenko da
     * @see DBConexion#cerrar()
     * @see #mespacio()
     * @see DBConexion#cerrar()
     * @see #logOut()
     * @see CODE.Aldaketak.EskariEgoera#EskariEgoera(String, String, String)
     * @see CODE.Aldaketak.GehituEskaria#GehituEskaria(String, String, String, int)
     * @see CODE.Aldaketak.GehituKategoria#GehituKategoria(String, String, String)
     * @see CODE.Aldaketak.GehituProduktua#GehituProduktua(String, String, String)
     * @see CODE.Aldaketak.Prezioa#Prezioa(String, String, String)
     * @see CODE.Funtzioak.PPKudeatu#PPKudeatu(String, String, String)
     * @see CODE.Funtzioak.DeleteUseless#DeleteUseless(String, String, String)
     * @see CODE.Funtzioak.MargenaSartu#MargenaSartu(String, String, String)
     * @see CODE.Kontsultak.Bezeroak#Bezeroak(String, String, String)
     * @see CODE.Kontsultak.Eskariak#Eskariak(String, String, String)
     * @see CODE.Kontsultak.Produktuak#Produktuak(String, String, String)
     */
    protected void menu() {
        // ! Liseners
        cerrar.addActionListener(e -> cerrar());
        logOut.addActionListener(e -> logOut());
        mibezeroak.addActionListener(e -> new Bezeroak(this.url, this.erabiltzailea, this.pasahitza));
        miproduktuak.addActionListener(e -> new Produktuak(this.url, this.erabiltzailea, this.pasahitza));
        mieskariak.addActionListener(e -> new Eskariak(this.url, this.erabiltzailea, this.pasahitza));
        miprezioa.addActionListener(e -> new Prezioa(this.url, this.erabiltzailea, this.pasahitza));
        mikategoria.addActionListener(e -> new GehituKategoria(this.url, this.erabiltzailea, this.pasahitza));
        mieskariegoera.addActionListener(e -> new EskariEgoera(this.url, this.erabiltzailea, this.pasahitza));
        miproduktugehitu.addActionListener(e -> new GehituProduktua(this.url, this.erabiltzailea, this.pasahitza));
        mideleteuseless.addActionListener(e -> new DeleteUseless(this.url, this.erabiltzailea, this.pasahitza));
        migeitueskaria.addActionListener(
                e -> new GehituEskaria(this.url, this.erabiltzailea, this.pasahitza, this.ideluserlogeado));
        miprezio.addActionListener(e -> new PPKudeatu(this.url, this.erabiltzailea, this.pasahitza));
        mimargenasartu.addActionListener(e -> new MargenaSartu(this.url, this.erabiltzailea, this.pasahitza));
        // ! Colores
        jmb.setBackground(green);
        logOut.setBackground(blue);
        cerrar.setBackground(red);
        menukontsultak.setBackground(green);
        menualdaketas.setBackground(green);
        menufuntzio.setBackground(green);
        mibezeroak.setBackground(blue);
        miproduktuak.setBackground(blue);
        mieskariak.setBackground(blue);
        miprezioa.setBackground(blue);
        mikategoria.setBackground(blue);
        mieskariegoera.setBackground(blue);
        miproduktugehitu.setBackground(blue);
        mideleteuseless.setBackground(blue);
        migeitueskaria.setBackground(blue);
        miprezio.setBackground(blue);
        mimargenasartu.setBackground(blue);
        // ! Añadir
        jmb.add(menukontsultak);
        menukontsultak.add(mibezeroak);
        menukontsultak.add(miproduktuak);
        menukontsultak.add(mieskariak);
        menualdaketas.add(miprezioa);
        menualdaketas.add(mikategoria);
        menualdaketas.add(mieskariegoera);
        menualdaketas.add(miproduktugehitu);
        menufuntzio.add(mideleteuseless);
        menualdaketas.add(migeitueskaria);
        menufuntzio.add(miprezio);
        menufuntzio.add(mimargenasartu);
        jmb.add(menualdaketas);
        jmb.add(menufuntzio);
        mespacio();
        jmb.add(logOut);
        jmb.add(cerrar);
        jd.setJMenuBar(jmb);
        //
    }
    /**
     * Klase honek home horriadeko itxura kudeatzen du
     */
    public void gui2() {
        try {
            URL url = new URL(
                    "https://www.buyandhold.es/wp-content/uploads/2021/01/1611763861_795993_1611763932_noticia_normal.jpg");
            JLabel gifLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon(url);
            gifLabel.setIcon(imageIcon);
            hasiera.add(gifLabel);
        } catch (Exception e) {

        }
        //
        hasiera.setBackground(pink);
        //
        jd.add(hasiera);
        ;
        jd.setUndecorated(true);
        // jd.setAlwaysOnTop(true);
        // jd.setSize(550, 350);
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }

    /**
     * Funtzio hau DBLoginen objektuei erabilgarritasuna emateko eta "gainerako klaseekin konektatzeko" da.
     * @see #log()
     * @see #kllogin()
     */
    protected void liseners() {
        jblogin.addActionListener(e -> log());
        erab.addKeyListener(kllogin());
        pass.addKeyListener(kllogin());
    }

    /**
     * Login-a egokia bada hasierako pantaila ateratzeko
     * @see #login()
     * @see #gui2()
     */
    protected void log() {
        login();
        if (boologin) {
            gui2();
            jf.setVisible(false);
        }
    }
    /**
     * Login eta Home interfazea ixteko
     */
    protected void cerrar() {
        jd.dispose();
        jf.dispose();
    }

    /**
     * Menuan eginten de txapuza bat :D
     */
    protected void mespacio() {
        for (int index = 0; index < intaux; index++) {
            JMenuItem espacio = new JMenuItem("");
            espacio.setBackground(green);
            jmb.add(espacio);
        }

    }

    /**
     * Deslogeatu ahal izateko
     */
    protected void logOut() {
        jd.dispose();
        hasiera.removeAll();
        jf.setVisible(true);
    }

    /**
     * KeyListener-a sortzeko
     * @return el objeto del KeyListener
     * @see #log()
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
                    log();
                }
            }

            public void keyReleased(KeyEvent e) {
                // Este método se llama cuando se libera una tecla
            }
        };
        return kl;
    }

}
