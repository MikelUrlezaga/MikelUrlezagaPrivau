import javax.swing.*;

public class JCBAdib {
   public static void main (String [] args){
      String [] elementuak = {"E1","E2","E3","E4"};
      JFrame jf = new JFrame("Adib JCB");
      //sortu jcombobox objektua eta gehitu elementua arraya
      JComboBox <String> jcb = new JComboBox<>(elementuak);
      jcb.addActionListener (e -> System.out.println(jcb.getSelectedItem()));
      jf.add(jcb);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(200,100);
      jf.setVisible(true);
 
   }
}