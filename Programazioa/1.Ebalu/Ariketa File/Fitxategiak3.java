import java.io.File;
import java.util.Scanner;
//Sartu File eta Scanner funtzioak
public class Fitxategiak3
{
   public static void main (String [] args) throws Exception
   {
   //Bariableak definitu 
   double TwoP = 0 ,auxTwoP, btb = 0;
   
   File fStats= new File ("AriketaFile\\Team_Stats.txt");
   //File funtzioa definitu eta izendatu
   Scanner sc = new Scanner (fStats);
   //berdin Scanner funtzioarekin
   sc.nextLine();  
   //Saltatu lehenengo errenkada ez delako garrantzitsua
   while (sc.hasNext())
   {
   //Aurkitu behar den zutabeko informazioa eta errepikatu hauen gehiketa datu gabe geratu arte
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();
      sc.nextDouble();

      TwoP = sc.nextDouble();
      btb = btb + TwoP;
      sc.nextLine();         
   }
   sc.close();
   System.out.println("Bi puntuen btb: "+(btb/30) );
   
   } 
}  