import java.io.File;
import java.util.Scanner;

public class Fitxategiak1
{
   public static void main (String [] args) throws Exception
   {
      
   String tIzena = "UtahJazz",auxTIzena;
   String abbrTalde = "",auxAbbrTalde;
   
   File fTeams= new File ("AriketaFile\\Teams.txt");
   
   Scanner sc = new Scanner (fTeams);
   
   sc.nextLine();  
   
   while (sc.hasNext())
   {
      sc.nextInt();
      auxTIzena = sc.next();
      auxAbbrTalde = sc.next();
      if (tIzena.equals(auxTIzena))
      {
         abbrTalde=auxAbbrTalde;  
      }
      sc.next();
            
   }
   sc.close();
   System.out.println("Taldearen Abbr: "+abbrTalde );
   
   } 
}  