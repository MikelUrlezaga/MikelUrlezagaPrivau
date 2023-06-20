import javax.swing.*;
import java.awt.*;


public class Insert extends JDialog {

   private JTextField jtf1;
   private JTextField jtf2;
   private JTextField jtf3;
   private JTextField jtf4;
   private JTextField jtf5;
   private JTextField jtf6;
   private JTextField jtf7;
   private JTextField jtf8;
   private JTextField jtf9;
   private JTextField jtf10;
   private JTextField jtf11;
   private JTextField jtf12;
   private JTextField jtf13;
   private JTextField jtf14;
   private JButton gordeb;
   private JPanel panel2;
   
   public Insert(){
      
   gordeb = new JButton("Gorde");
   jtf1 = new JTextField("id");
   jtf2 = new JTextField("Bezero izena"); 
   jtf3 = new JTextField("Kontaktu izena"); 
   jtf4 = new JTextField("Kontaktu abizena"); 
   jtf5 = new JTextField("Telefonoa"); 
   jtf6 = new JTextField("Fax"); 
   jtf7 = new JTextField("Helbide lerroa 1"); 
   jtf8 = new JTextField("Helbide lerroa 2"); 
   jtf9 = new JTextField("Herria"); 
   jtf10 = new JTextField("Eskualde"); 
   jtf11 = new JTextField("Herrialdea"); 
   jtf12 = new JTextField("Posta Kodea"); 
   jtf13 = new JTextField("Salerosketa Langile Kodea"); 
   jtf14 = new JTextField("Kreditu muga");
   panel2 = new JPanel();
   
   panel2.add(jtf1);
   panel2.add(jtf2);
   panel2.add(jtf3);
   panel2.add(jtf4);
   panel2.add(jtf5);
   panel2.add(jtf6);
   panel2.add(jtf7);
   panel2.add(jtf8);
   panel2.add(jtf9);
   panel2.add(jtf10);
   panel2.add(jtf11);
   panel2.add(jtf12);
   panel2.add(jtf13);
   panel2.add(jtf14);
   
   gordeb.addActionListener(e -> gorde());
   
   panel2.add(gordeb);
   
   getContentPane().add(panel2);
    
   
   setTitle("Bezero zerrenda");
   setSize(250,250);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
   setVisible(true);
   
   }
   
   public void gorde (){
      dispose();
      Harrera h = new Harrera();
   }

}