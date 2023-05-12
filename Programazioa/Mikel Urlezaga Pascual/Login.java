import javax.swing.*;
import java.awt.*;
import java.lang.Integer;

public class Login extends JDialog {
   
   private JTextField jtf1;
   private JTextField jtf2;
   private JButton button;
   private JPanel panel;
   private String [] erabiltzaileak = {"ALBA","ASIER","SERGIO","JON","IZASKUN","MIKEL","IMANOL","ERIK","XABIER","NATALIA","ANDER"};
   private int [] pasahitzak = {111,222,333,444,555,666,777,888,999,000,101};
   private String erabiltzailea;
   private int pasahitza;

   
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
      button.addActionListener(e -> Sartu());   
}

      public static void main (String[] args){
         Login l = new Login ();
      }

      public void Sartu(){
         erabiltzailea = jtf1.getText();
         pasahitza = Integer.parseInt(""+jtf2.getText());
         for (int i=0 ; i<=erabiltzaileak.length-1 ; i++){
            if (erabiltzailea.equals(erabiltzaileak[i])){
               if (pasahitza == pasahitzak [i]){
                  System.out.println("Sartu zara");
               }
               else{
                  JOptionPane.showMessageDialog(null, "PASAHITZA TXARTU SARTUTA", "Mu mal", JOptionPane.INFORMATION_MESSAGE);
               }   
            }
         }
      }
}




























