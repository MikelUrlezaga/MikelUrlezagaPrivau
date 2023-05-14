import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    private JMenuBar jmenubar;
    private JMenu jmenu;
    private JMenuItem item;
    
    public Menu(){

        jmenu=new JMenu();
        item=new JMenuItem();
        jmenubar=new JMenuBar();

        jmenu.setText("Zereginak");
        item.setText("Eguneratu");

        jmenu.add(item);
        jmenubar.add(jmenu);
        setJMenuBar(jmenubar);


        setTitle("Menu Nagusia");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);    
    }
}
