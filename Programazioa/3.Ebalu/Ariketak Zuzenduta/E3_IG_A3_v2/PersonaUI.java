import javax.swing.*;
import java.util.Scanner;
import java.io.File;


public class PersonaUI extends JFrame{

   private PersonaDB pDB = new PersonaDB ();
   
   public PersonaUI (){
      
      //sortu textArea
      JComboBox <String> jcbPertsonak = new JComboBox<> ();
      datuakIrakurri(jcbPertsonak);

      //sortu panela
      JPanel p = new JPanel();
      p.add(jcbPertsonak);
      
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
      PersonaUI pUI = new PersonaUI ();     
   }
   
   public void datuakIrakurri(JComboBox jcbPertsonak){
      
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
            pDB.addPersona(p);
         }
      }catch(Exception e){
         System.out.println("Errorea ");
      }
   }
}