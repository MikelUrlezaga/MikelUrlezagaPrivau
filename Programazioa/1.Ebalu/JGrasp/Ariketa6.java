//Scanner funtzionaltasuna sartu behar dugu
import java.util.Scanner;
public class Ariketa6{
   public static void main (String [] args){
   //Funtzionaltasuna izendatu
   Scanner leer = new Scanner (System.in);
   int zenbakia1;
   int zenbakia2;
   //Zenbakiak eskatu eta definitu
   
   System.out.println("Sartu zenbaki bat");
   zenbakia1 = leer.nextInt();
  
   System.out.println("Sartu beste zenbaki bat");
   zenbakia2 = leer.nextInt();
   //Eragiketak egin
   System.out.println("Batuketaren emaitza =  "+(zenbakia1+zenbakia2)+ "  da");
   System.out.println("Kenketaren emaitza =  "+(zenbakia1-zenbakia2)+ "  da");
   System.out.println("Biderketaren emaitza = "+(zenbakia1*zenbakia2)+ "  da");
   //If bat erabili kasu berezirako zatitzailea = 0 denean
   if (zenbakia2 == 0)
    {
      System.out.println("Zatiketaren emaitza = infinito  da");
    }
    else
    {
    System.out.println("Zatiketaren emaitza ="+(zenbakia1/zenbakia2)+"  da");
         }
   }
}   
