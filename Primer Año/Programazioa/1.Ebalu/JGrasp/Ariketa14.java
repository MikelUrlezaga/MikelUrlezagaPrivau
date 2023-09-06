import java.util.Scanner;
public class Ariketa14
{
	public static void main (String [] args)
   {
   //Eskatu behar da Scanner funtzioarekin zenbat bider nahi den hitza printeatzea
   int zbk;
   Scanner leer = new Scanner (System.in);
   System.out.println("Sartu zenbat bider nahi duzun eco hitza agertzea");
   zbk= leer.nextInt();
   eco(zbk);
   }
 //Funtzioa sortu errepikapen bat izanda emandako zenbakiaren bidez egiten duena  
      public static void eco(int zbk)
      {
         for(int i=1; i<=zbk; i++)
         {
            System.out.println("Eco");
         }
      }

}