import javax.swing.*;
import java.awt.*;

public class JMenuBarAriketa {

  public static void main(String[] args) {

    JFrame frame = new JFrame("Ejemplo JMenuBar");


    JMenuBar barraMenu = new JMenuBar();
    JMenu menuArchivo = new JMenu("Archivo");
    JMenuItem itemNuevo = new JMenuItem("Nuevo");
    JMenuItem itemAbrir = new JMenuItem("Abrir");
    JMenuItem itemGuardar = new JMenuItem("Guardar");
    JMenuItem itemSalir = new JMenuItem("Salir");


    itemNuevo.addActionListener(e -> System.out.println("Has seleccionado Nuevo"));
    itemAbrir.addActionListener(e -> System.out.println("Has seleccionado Abrir"));
    itemGuardar.addActionListener(e -> System.out.println("Has seleccionado Guardar"));
    itemSalir.addActionListener(e -> System.exit(0)); 


    menuArchivo.add(itemNuevo);
    menuArchivo.add(itemAbrir);
    menuArchivo.add(itemGuardar);
    menuArchivo.addSeparator(); 
    menuArchivo.add(itemSalir);


    barraMenu.add(menuArchivo);

    
    frame.setJMenuBar(barraMenu);


    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    frame.setVisible(true);
  }
}
