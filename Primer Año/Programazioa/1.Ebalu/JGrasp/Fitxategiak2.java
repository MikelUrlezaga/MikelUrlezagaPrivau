import java.io.File;
import java.util.Scanner;
//Sartu File eta Scanner funtzioak
public class Fitxategiak2
{
   public static void main (String [] args) throws Exception
   {
   //Bariableak definitu 
   double ThreeP = 0 ,auxThreeP, btb = 0;
   
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
      ThreeP = sc.nextDouble();
      btb = btb + ThreeP;
      sc.nextLine();         
   }
   sc.close();
   System.out.println("Hiruko puntuen btb: "+(btb/30) );
   
   } 
}  