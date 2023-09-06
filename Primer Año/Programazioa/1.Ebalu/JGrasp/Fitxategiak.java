import java.io.File;
import java.util.Scanner;

public class Fitxategiak
{
   public static void main (String [] args) throws Exception
   {
      
   String tIzena = "BrooklynNets",auxTIzena;
   int idTalde = -1,auxIdTalde;
   
   File fTeams= new File ("AriketaFile\\Teams.txt");
   
   Scanner sc = new Scanner (fTeams);
   
   sc.nextLine();
   
   while (sc.hasNext())
   {
      auxIdTalde = sc.nextInt();
      auxTIzena = sc.next();
      
      if (tIzena.equals(auxTIzena))
      {
         idTalde=auxIdTalde;  
      }
      sc.next();
      sc.next();      
   }
   sc.close();
   System.out.println("Taldearen ID: "+idTalde );
   
   } 
}  