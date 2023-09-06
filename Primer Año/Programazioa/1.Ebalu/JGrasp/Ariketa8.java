import java.util.Scanner;
//Scanner funtzioa sartu javara
public class Ariketa8{
   public static void main (String [] args){
   Scanner leer = new Scanner (System.in);
   //Definitu Scanner funtzioa
   double zenb1,zenb2;
   String eragiketa,errepikapena;
   //Definitu bariable desberdinak
   System.out.println("Sartu zenbaki bat");
   zenb1 = leer.nextDouble();
   //Bariableei baloreak eman Scanner funtzioa erabilita
   System.out.println("Sartu beste zenbaki bat");
   zenb2 = leer.nextDouble();
 do {
 //do while bat erabili berriro eragiketa bat egin nahi baden jakitzeko
   System.out.println("Sartu egin nahi duzun eragiketa: +,-,*,mod,balio absolutua,/,erroa");
   eragiketa = leer.next();
   
   switch (eragiketa){
   //switch erabili eragiketa desberdinak zer egingo duten jartzeko
      case "+":
      System.out.println("Eragiketaren erantzuna hau da =  " + (zenb1+zenb2));
      ;
      break;
      case "-":
      System.out.println("Eragiketaren erantzuna hau da =  "+(zenb1-zenb2));
      ;
      break;
      case "*":
      System.out.println("Eragiketaren erantzuna hau da =  "+(zenb1*zenb2));
      ;
      break;
      case "mod":
      System.out.println("Zatiketaren hondarra hau da =  "+(zenb1 % zenb2));
      ;
      break;
      case "balio absolutua":
      System.out.println(Math.abs(zenb1) + " " + Math.abs(zenb2));
      ;
      break;
      case "/":
      System.out.println("Eragiketaren erantzuna hau da =  "+(zenb1/zenb2));
      ;
      break;
      case "erroa":
      System.out.println(Math.sqrt(zenb1) + " " + Math.sqrt(zenb2));
      ;
      break;
      default:
      System.out.println("Ez duzu ondo sartu eragiketa");
      ;
         }
         System.out.println("Beste eragiketa bat egin nahi duzu?");
         errepikapena=leer.next();
         }
         while(errepikapena.equals("bai"));
   }
}   
