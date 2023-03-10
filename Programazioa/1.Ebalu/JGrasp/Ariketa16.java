import java.util.Scanner;
public class Ariketa16
{
	public static void main (String [] args)
   {
   
   String letra;
   
   Scanner leer = new Scanner (System.in);
   
   System.out.println("Sartu zenbaki bat");
   letra= leer.next();
   
   zein(letra);
   
   }
   
   public static void zein(String letra)
   {
      if(letra = "a" | letra = "e" | letra = "i" | letra = "o" | letra = "u")
      {
         System.out.println("Bokal bat da");
      }
      else
      {
         System.out.println("Ez da bokal bat");
      }
   }
}             


