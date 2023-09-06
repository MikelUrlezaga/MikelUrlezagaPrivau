import java.io.PrintWriter;
import java.io.FileWriter;

public class PrintWriterAdib {
   public static void main (String [] args){
      FileWriter f = null;
      PrintWriter pw = null;
      try{
      //true amaieran editatzeko
         f = new FileWriter ("PWAdib.txt");
         pw = new PrintWriter (f);
      } catch(Exception e){
         System.out.println("Errorea");
      }   
      pw.print ("Adibide 1 lerro salto gabe ");
      pw.println ("Lerro saltoarekin ");
      pw.printf ("%d . adibide bat formatoarekin" , 3);
      pw.close();
   }


}
