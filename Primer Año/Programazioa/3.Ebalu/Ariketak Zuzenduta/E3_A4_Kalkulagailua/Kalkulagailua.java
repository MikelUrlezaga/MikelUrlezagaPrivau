import javax.swing.*;
import java.awt.*;

public class Kalkulagailua extends JFrame {
   
   private JTextField jtf;
   private int zbk1=-1, zbk2=-1;
   private double emaitza=0;
   private String eragiketa=null,zb1=null,zb2=null;
   
   public Kalkulagailua () {
      //elementuak jarri
      jtf = new JTextField();
      this.add(jtf);
      
      //panela sortu gehitzeko botoiak
      JPanel jp = new JPanel();
      jp.setLayout(new GridLayout(4,4));
      this.getContentPane().add(jp);
      
      //botoiak sortu eta kargatu
      JButton jb9 = new JButton("9");
      JButton jb8 = new JButton("8");
      JButton jb7 = new JButton("7");
      JButton jbPlus = new JButton("+");
      JButton jb6 = new JButton("6");
      JButton jb5 = new JButton("5");
      JButton jb4 = new JButton("4");
      JButton jbMinus = new JButton("-");
      JButton jb3 = new JButton("3");
      JButton jb2 = new JButton("2");
      JButton jb1 = new JButton("1");
      JButton jbX = new JButton("X");
      JButton jbDiv = new JButton("/");
      JButton jb0 = new JButton("0");
      JButton jbBerdin = new JButton("=");
      JButton jbReset = new JButton("C");
      
      jp.add(jb9);
      jp.add(jb8);
      jp.add(jb7);
      jp.add(jbPlus);
      jp.add(jb6);
      jp.add(jb5);
      jp.add(jb4);
      jp.add(jbMinus);
      jp.add(jb3);
      jp.add(jb2);
      jp.add(jb1);
      jp.add(jbX);
      jp.add(jbReset);
      jp.add(jb0);
      jp.add(jbBerdin);
      jp.add(jbDiv);
      
      //funtzionalitatea programatu
      jb9.addActionListener(e->kalkuluakEgin(jb9));
      jb8.addActionListener(e->kalkuluakEgin(jb8));
      jb7.addActionListener(e->kalkuluakEgin(jb7));
      jb6.addActionListener(e->kalkuluakEgin(jb6));
      jb5.addActionListener(e->kalkuluakEgin(jb5));
      jb4.addActionListener(e->kalkuluakEgin(jb4));
      jb3.addActionListener(e->kalkuluakEgin(jb3));
      jb2.addActionListener(e->kalkuluakEgin(jb2));
      jb1.addActionListener(e->kalkuluakEgin(jb1));
      jb0.addActionListener(e->kalkuluakEgin(jb0));
      jbBerdin.addActionListener(e->kalkuluakEgin(jbBerdin));
      jbPlus.addActionListener(e->kalkuluakEgin(jbPlus));
      jbX.addActionListener(e->kalkuluakEgin(jbX));
      jbDiv.addActionListener(e->kalkuluakEgin(jbDiv));
      jbReset.addActionListener(e->kalkuluakEgin(jbReset));
      
      
      //JFrame konfiguratu
      this.setLayout (new GridLayout (2,1));
      this.setSize(200,300);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);   
   }
   
   public void kalkuluakEgin(JButton jb){
      if (jb.getText().equals("0")){
         jtf.setText("0");
         eguneratuAldagaiak("0");
      }else if (jb.getText().equals("1")){
         jtf.setText("1");
         eguneratuAldagaiak("1");
      }else if (jb.getText().equals("2")){
         jtf.setText("2");
         eguneratuAldagaiak("2");
      }else if (jb.getText().equals("3")){
         eguneratuAldagaiak("3");
         jtf.setText("3");
      }else if (jb.getText().equals("4")){
         eguneratuAldagaiak("4");
         jtf.setText("4");
      }else if (jb.getText().equals("5")){
         eguneratuAldagaiak("5");
         jtf.setText("5");
      }else if (jb.getText().equals("6")){
         eguneratuAldagaiak("6");
         jtf.setText("6");
      }else if (jb.getText().equals("7")){
         eguneratuAldagaiak("7");
         jtf.setText("7");
      }else if (jb.getText().equals("8")){
         eguneratuAldagaiak("8");
         jtf.setText("8");
      }else if (jb.getText().equals("9")){
         eguneratuAldagaiak("9");
         jtf.setText("9");
      }else if (jb.getText().equals("+")){
         eragiketa="+";
      }else if (jb.getText().equals("-")){
         eragiketa="-";
      }else if (jb.getText().equals("X")){
         eragiketa="X";
      }else if (jb.getText().equals("/")){
         eragiketa="/";
      }else if (jb.getText().equals("C")){
         zb1=null;
         zb2=null;
         eragiketa=null;  
         jtf.setText("");    
      }else if (jb.getText().equals("=")){
         if (zb1!=null && zb2!=null && eragiketa!=null) {
            zbk1= Integer.parseInt(zb1);
            zbk2=Integer.parseInt(zb2);
            if (eragiketa.equals("X")){
               jtf.setText(""+(zbk1*zbk2));
            } else if (eragiketa.equals("+")) {
               jtf.setText(""+(zbk1+zbk2));
            } else if (eragiketa.equals("-")) {
               jtf.setText(""+(zbk1-zbk2));
            } else if (eragiketa.equals("/")){
               jtf.setText(""+(zbk1/zbk2));
            }
         }
      }
   }  
   
   public void eguneratuAldagaiak (String zenbakia){
      if (eragiketa==null){
         if (zb1==null){
            zb1=zenbakia;
         }else{
            zb1=zb1+zenbakia;
         }
      } else {
         if (zb2==null){
            zb2=zenbakia;
         }else{
            zb2+=zenbakia;
         }
      }
   }
   
   public static void main (String [] args){
      Kalkulagailua k = new Kalkulagailua();
   }
}