import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameJPanelAriketa extends JFrame {
    
    private JButton boton;
    private JPanel panel;
    
    public JFrameJPanelAriketa() {
        setTitle("Leiho Pertsonalizatua");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        boton = new JButton("Klikatu hemen");
        panel = new JPanel();
        panel.add(boton);
        
        add(panel);
    }
    
    public static void main(String[] args) {
        JFrameJPanelAriketa lp= new JFrameJPanelAriketa ();
        lp.setVisible(true);
    }
}
