import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Ariketa17 {
   public static void main (String [] args){
      int zenbakia=0;
      Scanner sc= new Scanner (System.in);
      FileWriter f = null;
      PrintWriter pw = null;
      try{
         f = new FileWriter ("Ariketa17.txt");
         pw = new PrintWriter (f);
      } catch (Exception e){
         System.out.print("Errore bat sortu da");
      }
     for (int i=1; i<=5; i++){
      System.out.println ("Sartu zenbaki bat");
      zenbakia=sc.nextInt();
      pw.print (zbk);
      System.out.println ("Sartu zenbaki bat");
      zenbakia=sc.nextInt();
      pw.println (zbk);
      }
      pw.close ();
   }
}