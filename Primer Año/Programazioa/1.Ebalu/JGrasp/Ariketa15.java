import java.util.Scanner;
public class Ariketa15
{
//main-a sortu eta Scanner funtzioa sartu
	public static void main (String [] args)
   {
      int zbk1;
      int zbk2;
      //bariableak definitu eta new Scanner funtzioa
      Scanner leer = new Scanner (System.in);
     
         System.out.println("Sartu zenbaki bat");
         zbk1= leer.nextInt();
      
         System.out.println("Sartu beste zenbaki bat");
         zbk2= leer.nextInt();
      //baloreak sartu eta funtzioa sortu
      handiena(zbk1,zbk2);
   }   
   
   public static void handiena(int zbk1,int zbk2)
   {
      int max;
      int min;
      //bariableak definitu eta hauek konparatu
      if(zbk1>zbk2)
      {
         max = zbk1;
         min = zbk2;
      }
      else
      {
         max = zbk2;
         min = zbk1;
      }      
         //emaitza printeatu
         System.out.println("Zenbaki handiena hau da = "+(max));
         System.out.println("Zenbaki txikiena hau da = "+(min));
   } 
}       
      


