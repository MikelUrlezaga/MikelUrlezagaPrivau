import java.util.Scanner;
//Programa nagusian balioak gordeko ditugu eta funtzioei deitu
public class Ariketa20{
   public static void main (String [] args){
   int luze;
   luze=luzera();
   int [] emaitza = new int [luze];
   emaitza=sartu(emaitza, luze);
   erakutsi(emaitza, luze);

   }
   //Funtzio honetan array-ean sartuko ditugu balioak for bat erabilita eta kontuan izanda honetan array-aren luzera
   public static int [] sartu(int [] emaitza,int luze){
      Scanner sc= new Scanner (System.in);
      for(int i=0;i<=(luze-1);i++){
         System.out.println("Sartu zenbaki bat: ");
         emaitza[i]=sc.nextInt();
      }
      return emaitza;
   }
   //Funtzio honetan array-ko zelda bakoitzeko zenbakiak erakutsiko dira alderantzisko ordenean eta zenbatuta
   public static void erakutsi(int [] emaitza,int luze){
      int [] array = new int [luze];
      array=emaitza;
      for(int i=(luze-1);i>=0;i--){
         System.out.print((i+1)+" : ");
         System.out.println(array[i]);
      }
   }
   //Funtzio honetan array-aren luzera eskatuko da
   public static int luzera(){
      int luze;
      Scanner sc= new Scanner (System.in);
      System.out.println("Sartu array-aren luzera: ");
      luze = sc.nextInt();
      return luze;
   }
}