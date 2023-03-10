import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Ariketa23 {
   public static void main(String [] args){
      int [] zenbakiak  = balioakEskatu();
   }
   
   
   public static int [] balioakEskatu (){
      Scanner sc = new Scanner (System.in);
      int [] zenbakiak = new int [10];
      for(int i=0;i<10;i++){
         zenbakiak[i]=sc.nextInt();
      }
      return zenbakiak;
   }
}
