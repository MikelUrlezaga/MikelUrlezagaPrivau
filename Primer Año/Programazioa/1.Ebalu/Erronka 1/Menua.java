import java.util.Scanner;
public class Menua
{
	public static void main (String [] args)
   {
     menu1();
   
   }
   
   public static void hasiera()
   {
       
        System.out.println("1) Kontsultatu langile baten informazioa");
        System.out.println("2) Nagusi baten langileen zerrenda erakutsi");
        System.out.println("3) Atzera joan");
       
   }
      
   public static void menu()
   {
      Scanner leer = new Scanner (System.in);

      int aukera;
 
      do
      {     
         System.out.println("Sartu zenbaki bat");
         aukera = leer.nextInt();

         switch(aukera)
         {
         
            case 1:
            
               System.out.println("PATATA");
            
            break;
            
            case 2:
            
               System.out.println("TXORIZO");
            
            break;
            
            case 3:
            
               
            
            break;
            default:
               System.out.println("Hau ez da aukera bat. Saiatu berriro.");
         
         }
        }
        while(aukera<1 || aukera>3);
                      
   }
   
   
   public static void saioItxi()
   {
      Scanner leer = new Scanner (System.in);

      System.out.println("Saioa Amaitu nahi duzu? (b/e)");
      String saioa;
      saioa = leer.next();
      if (saioa.equals("b"))
      {
      
     
      
      }
      else
      {
      
       menu();
      
      }
      
   }
   
   public static void menu1()
   {
   
   Scanner leer = new Scanner (System.in);

   
   System.out.println("1) Langileak");
   System.out.println("2) Bezeroak");
   System.out.println("3) Saioa itxi");
   
   int aukeratua;
   String saioItx = "" ;
  
   do
   {
      do
      {     
         System.out.println("Sartu zenbakia (1/2/3)");
         aukeratua = leer.nextInt();

         switch(aukeratua)
         {
         
            case 1:
            
               System.out.println("PATATA");
            
            break;
            
            case 2:
            
               System.out.println("TXORIZO");
            
            break;
            
            case 3:
            
               System.out.println("Saioa itxi nahi duzu? (b/e)");
               saioItx = leer.next();
            
            break;
            default:
               System.out.println("Hau ez da aukera bat. Saiatu berriro.");
               menu1();
         
         }
         
       } while(aukeratua != 1 && aukeratua != 2 && aukeratua != 3);
        
   } while(saioItx.equals("e"));   

   }

}
