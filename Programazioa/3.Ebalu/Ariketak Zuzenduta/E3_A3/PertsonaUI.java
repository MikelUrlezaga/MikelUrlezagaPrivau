import javax.swing.*;
import java.util.Scanner;
import java.io.File;


public class PertsonaUI extends JFrame{

   private PersonaDB pDB = new PersonaDB ();
   private JComboBox <String> jcbPertsonak = new JComboBox <> ();
   
   public PertsonaUI (){
   
      //menu barra sortu
      JMenuBar jmb = new JMenuBar ();
      
      JMenu jm = new JMenu ("Fitxategia");
      JMenuItem jmi = new JMenuItem ("Gehitu");
      jmi.addActionListener (e -> irekiGehitu ());
      jm.add(jmi);
      jmb.add(jm);
      
      //gehitu jframe
      setJMenuBar(jmb);

               
      //sortu textfield
      JTextField jtf = new JTextField(10);
      //jtf.setSize(10,200);

      
      //sortu textArea
      //jcbPertsonak = new JComboBox<> ();
      datuakIrakurri();
      jcbPertsonak.addActionListener (e -> datuakAtera(jcbPertsonak.getSelectedIndex(),jtf));
      
      //sartu scrollPane batean
      //JScrollPane jsp = new JScrollPane(jtaPertsonak);

      //sortu panela
      JPanel p = new JPanel();
      p.add(jcbPertsonak);
      p.add(jtf);

      
      //sortu JFrame
      setTitle("Jokalariak");
      setSize (500,200);
      getContentPane().add(p);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      //pack();
      setLocationRelativeTo(null);
      setVisible(true);     
   }
   
   public static void main (String [] args){
      PertsonaUI pUI = new PertsonaUI ();     
   }
   
   public void irekiGehitu () {
      PertsonaGehituGUI pG = new PertsonaGehituGUI(this);
   }
   
   public void datuakIrakurri(){
   
      jcbPertsonak.removeAllItems();
      
      try{
         Persona p = new Persona ();
         File f = new File ("E3_Ariketa_3_Pertsonak.txt");
         Scanner sc = new Scanner (f);
         sc.nextLine();
         while (sc.hasNext()){
            p.setId(sc.next());
            p.setTeam(sc.next());
            p.setCountry(sc.next());
            p.setNameF(sc.next());
            p.setNameL(sc.next());
            jcbPertsonak.addItem(p.toString());
            System.out.println(p.toString());
            pDB.addPersona(p);
         }
               for (int i =0;i<pDB.length();i++){
         System.out.println(pDB.getPertsona(i));
      }
      }catch(Exception e){
         System.out.println("Errorea ");
      }
   }
   
   public void datuakAtera (int index, JTextField jtf){
      Persona p=pDB.getPertsona(index);
      jtf.setText(p.toString());

      
   }
}