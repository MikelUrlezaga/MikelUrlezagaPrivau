package Erronka;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

public class Maialen extends JFrame {

     public static void main(String[] args) {
            
            // Crear un objeto JFrame
            JFrame miFrame = new JFrame("Mi ventana");

            // Crear un objeto ImageIcon con la ruta a tu imagen
            ImageIcon icono = new ImageIcon("Erronka/amanecer-captura.jpg");

            // Crear un objeto JLabel con el ImageIcon
            JLabel etiqueta = new JLabel(icono);

            JButton miBoton = new JButton("Mensaje Oculto");
            miBoton.addActionListener(e -> {
                // Crear un JDialog
                JDialog miDialogo = new JDialog(miFrame, "Mensajito para MAIALEN");
                miDialogo.add(new JLabel("PASA BUEN DIA PERO DEJA EL PUTO MOVIL Y ESTATE ATENTA A CLASE, PUTA PAYASA xD"));
                miDialogo.pack();
                miDialogo.setLocationRelativeTo(null);
                miDialogo.setVisible(true);
            });
            miBoton.setBounds(700,175,150,50);
            miFrame.add(miBoton);

            // Agregar la etiqueta al JFrame
            miFrame.add(etiqueta);

            // Configurar algunas opciones del JFrame
            miFrame.pack();
            miFrame.setVisible(true);
            miFrame.setLocationRelativeTo(null);
            miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
