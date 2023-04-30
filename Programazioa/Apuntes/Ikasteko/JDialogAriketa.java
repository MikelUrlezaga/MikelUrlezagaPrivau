import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JDialogAriketa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana Principal");

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Haz clic aquí");
        panel.add(label);

        JDialog dialog = new JDialog(frame, "Diálogo", true);
        dialog.setBounds(200, 100, 200,500);
        

        JLabel message = new JLabel("¡Hola desde el Diálogo!");
        dialog.add(message);

        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dialog.setVisible(true);
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
