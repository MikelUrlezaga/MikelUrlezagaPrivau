import javax.swing.*;

public class JTextFieldAdib {
   public static void main (String [] args){
   //zuek egiteko adibidea
   //gehitu ariketari jpanel bat
   //jpanel-ari gehitu botoi bat eta jtextfield
   //botoia sakatzen duzuenean kontsolatik atera
   //metodo bat erabilita. jtextfield-ean idatzitakoa
   //atera
      JFrame jf = new JFrame ("JTextFieldAdib");
      JTextField jtf = new JTextField ("Idatzi zeozer");
      JButton jb = new JButton ("Klikatu");
      //sortu panela eta gehitu elementuak
      JPanel jp = new JPanel ();
      jp.add(jb);
      jp.add(jtf);
      //programatu botoiaren funtzionalitatea
      jb.addActionListener(e -> ateraPantailatik(jtf.getText()));
      //gehitu panela frame-era
      jf.getContentPane().add(jp);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(100,100);
      jf.setVisible(true);
   }
   
   public static void ateraPantailatik(String s){
      System.out.println("Testua da: "+s);
   }
}