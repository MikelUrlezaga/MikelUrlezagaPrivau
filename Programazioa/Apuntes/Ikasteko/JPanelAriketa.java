
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;


public class JPanelAriketa {
    public static void main(String[] args) {
        // Sortu botoiak
        JButton button1 = new JButton("Botoi 1");
        button1.addActionListener(e -> System.out.println("Kaixo"));
        JButton button2 = new JButton("Botoi 2");
        button2.addActionListener(e -> System.out.println("Egun On"));
        JButton button3 = new JButton("Botoi 3");
        button3.addActionListener(e -> System.out.println("Gabon"));

        // Sortu panela eta gehitu botoiak
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Sortu JFrame bat eta gehitu panela
        JFrame frame = new JFrame("JPanel adibidea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setBounds(200,200,200,200);
        frame.setVisible(true);
    }
}
