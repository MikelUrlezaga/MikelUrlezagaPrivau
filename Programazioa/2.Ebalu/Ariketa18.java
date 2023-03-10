import java.io.PrintWriter;
import java.io.FileWriter;

public class Ariketa18 {
   public static void main (String [] args){
      FileWriter f = null;
      PrintWriter pw = null;
      String esaldi1 = "Zure ideiak errealitate bihur ezazu";
      String esaldi2 = "Zure proiektua eraikitzen hasi";
      try{
        f = new FileWriter ("Ariketa18.txt");
        pw = new PrintWriter (f);
      } catch (Exception e){
         System.out.print("Errorea");
      }
      for (int i=0; i<esaldi1.length(); i++){
         pw.print(esaldi1.charAt(i));
      }
      pw.println("");
      pw.println(esaldi2);
      //IMPORTANTE CERRAR
      pw.close();
      f.close();
   }
}