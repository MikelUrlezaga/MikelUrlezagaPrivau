import java.util.Scanner;
   public class Ariketa7{
   public static void main (String [] args){
   Scanner leer = new Scanner (System.in);
   int urtea;
   int ezaugarria;
   System.out.println("Sartu urte bat");
   urtea = leer.nextInt();
   
   if (urtea % 4 == 0){
           if (urtea % 100 == 0){
            if (urtea % 400 == 0){
                System.out.println("Urtea bisiestoa da");
                                 }
            else{
               System.out.println("Urtea ez da bisiestoa");
                }
                                }
           else{
            System.out.println("Urtea ez da bisiestoa");
               }
                       }            
   else{
      System.out.println("Urtea ez da bisiestoa");
       }
   }
}
