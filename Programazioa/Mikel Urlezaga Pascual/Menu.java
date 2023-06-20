import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    private JMenuBar jmenubar;
    private JMenu jmenu;
    private JMenuItem item;
    private TextArea txtarea;
    DB db = new DB();
    private String [] dana;

    
    public Menu(){

        dana = db.bezeroguztiak();


        jmenu=new JMenu();
        item=new JMenuItem();
        jmenubar=new JMenuBar();
        txtarea=new TextArea();

        jmenu.setText("Zereginak");
        item.setText("Eguneratu");
        
        for(int i=0; i<=(dana.length-1); i++){
            if (i==0) {
                txtarea.setText(dana[i]);
            }else{
                txtarea.setText(txtarea.getText() + '\n' + dana[i]);
            }
        }
        item.addActionListener (e -> eguneratu());
        

        jmenu.add(item);
        jmenubar.add(jmenu);
        setJMenuBar(jmenubar);
        add(txtarea);


        setTitle("Menu Nagusia");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void eguneratu(){
        dispose();
        Eguneratu e = new Eguneratu ();
        
    }
}
