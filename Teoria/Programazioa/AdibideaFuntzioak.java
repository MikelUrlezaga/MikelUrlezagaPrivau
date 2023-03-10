import java.util.Scanner;
public class AdibideaFuntzioak{
   public static void main (String[]args){
      int zbk1;
      Scanner sc = new Scanner (System.in);
      mezua();
      zbk1 = biderketa(sc);
      System.out.println("Biderketaren emaitza"+zbk1);
   }
   public static void mezua(){
      System.out.print ("Kaixo Mundua");
       System.out.println ("Endika");
   }
   
   public static int biderketa(Scanner sdc){
      System.out.println ("Zenbaki bat");
      int zbk1 = sdc.nextInt();
      System.out.println ("Zenbaki bi");
      int zbk2 = sdc.nextInt();
      return zbk1*zbk2;
      

   
   } 
}
