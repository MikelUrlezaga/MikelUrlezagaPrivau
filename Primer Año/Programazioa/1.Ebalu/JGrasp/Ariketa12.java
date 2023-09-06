import java.util.Scanner;
public class Ariketa12
{
   public static void main (String [] args)
   {
   //Scanner funtzioa definituko dugu
   Scanner leer = new Scanner (System.in);
      //Bariableak definituko ditugu
      int  zenbk;
      zenbk = 0;
      int  batura;
      batura = 0;
      int zenb;
      //While bat erabiliko da bi limiteak kontuan izateko
      while (zenbk != 10 && batura <= 100)
      {
      System.out.println("Sartu zenbaki bat");
      zenb = leer.nextInt();
      //Limiteak kontuan izango dituzten parametroak
      zenbk++;
      
      batura = batura + zenb;
      }
   //Erakutzi limiteen baloreak
   System.out.println("Sartu dituzun zenbaki kantitatea hau da = "+ (zenbk));
   System.out.println("Sartu dituzun zenbakien batura totala hau da = "+(batura));      
   }
}