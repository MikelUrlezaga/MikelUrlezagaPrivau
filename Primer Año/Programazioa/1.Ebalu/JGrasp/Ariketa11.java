import java.util.Scanner;
public class Ariketa11{
   public static void main (String [] args){
       Scanner leer = new Scanner (System.in);
       //Definitu Scanner funtzioa zenbakiak hartzeko teklatuarekkin eta bariableak kodigoan erabiltzeko
       int gehiketa=0;
       int bates=0;
       int max=0;
       int zenb;
       int min=5;
      //for bat 10 aldiz zenbakiak hartzeko
      for (int i=1; i<=10; i++)
      {
      System.out.println("Sartu zenbaki bat");
      zenb = leer.nextInt();  
      
      gehiketa = gehiketa + zenb;
      
      bates = gehiketa;
      //konparaketa max zenbakiarekin jakitzeko zein den handiena
      if(max >= zenb)
      {
      }
      else
      {
      max = zenb;
      }
      //konparaketa min zenbakiarekin jakitzeko zein den txikiena 
      if(min >= zenb)
      {
      min = zenb;
      }
      else
      {
      }
         
         }
         
         System.out.println("Zenbaki guztien batuketa hau da = " + (gehiketa)); 
         System.out.println("Zenbaki guztien bates-bestekoa hau da = " + (bates/10));
         System.out.println(max);  
         System.out.println(min); 
   }  
} 