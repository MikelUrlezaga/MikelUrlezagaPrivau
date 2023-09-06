import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameJDialogAriketa extends JFrame {
    
    private JButton boton;
    private JPanel panel;
    
    public JFrameJDialogAriketa() {
        setTitle("Leiho Pertsonalizatua");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        boton = new JButton("Klikat hemen");
        panel = new JPanel();
        panel.add(boton);
        
        add(panel);
    }
    
    public static void main(String[] args) {
        JFrameJDialogAriketa lp= new JFrameJDialogAriketa ();
        lp.setVisible(true);
    }
}
