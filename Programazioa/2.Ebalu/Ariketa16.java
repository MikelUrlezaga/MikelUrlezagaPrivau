import java.io.File;
import java.util.Scanner;

//Java dokumentu bat irekitzen du eta errorea badago, catch-era sartzen da
public class Ariketa16 {
   public static void main (String [] args){
   try {
      
      File ariketaa = new File("PROBA.java");
      Scanner ariketa = new Scanner(ariketaa);
      while(ariketa.hasNext()){
      
         System.out.println(ariketa.nextLine());
      
      }
      
      ariketa.close();
      
   } catch (Exception e){
      
      System.out.println("Ez du .java-rik aurkitu");
      
      }
   }
}
