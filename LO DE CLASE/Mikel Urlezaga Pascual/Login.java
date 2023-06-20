import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
   
   private JTextField jtf1;
   private JTextField jtf2;
   private JButton button;
   private JPanel panel;
   private String [] erabiltzaileak = {"ALBA","ASIER","SERGIO","JON","IZASKUN","MIKEL","IMANOL","ERIK","XABIER","NATALIA","ANDER"};
   private int [] pasahitzak = {111,222,333,444,555,666,777,888,999,000,101};
   private String erabiltzailea;
   private String pasahitza;

   
   public Login () {
      
      setTitle("Login");
      jtf1 = new JTextField("erabiltzailea");
      jtf2 = new JTextField("pasahitza");
      button = new JButton("Sartu");
      panel = new JPanel();
      
      
      panel.add(jtf1);
      panel.add(jtf2);
      panel.add(button);
      getContentPane().add(panel);
      
      setSize(200,100);
      setLocationRelativeTo(null);
      setVisible(true);
      
      erabiltzailea = jtf1.getText();
      pasahitza = jtf2.getText();
      button.addActionListener(e -> Sartu(erabiltzailea, pasahitza, erabiltzaileak, pasahitzak));     
}

      public static void main (String[] args){
         Login l = new Login ();
      }
      
      public void Sartu (String erabiltzailea, String pasahitza, erabiltzaileak, pasahitzak) {
         
         int zein;
         
         for (int i=0; i<11;i++){
            if (erabiltzaileak [i]=erabiltzailea){
               zein = i;
            }
            else{
            
            }
         }
         if (erabiltzailea[zein]=pasahitzak[zein]){
         
         }
         else{
         
         }
      }
}




























