import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Ariketa1 {
    public static void main(String[] args) {
        // Sortu botoiak
        JButton button1 = new JButton("Botoi 1");
        button1.addActionListener(e -> System.out.println("Goian"));
        JButton button2 = new JButton("Botoi 2");
        button2.addActionListener(e -> System.out.println("Erdian"));
        JButton button3 = new JButton("Botoi 3");
        button3.addActionListener(e -> System.out.println("Behean"));
        button3.setPreferredSize(new Dimension(80,80));

        // Sortu panela eta gehitu botoiak
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Sortu JFrame bat eta gehitu panela
        JFrame frame = new JFrame("JPanel adibidea");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        //frame.pack();
        frame.setVisible(true);
    }
}
