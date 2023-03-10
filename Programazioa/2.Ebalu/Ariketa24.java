import java.util.Scanner;

public class Ariketa24 {
   public static void main (String [] args) {

      Scanner sc = new Scanner (System.in);
      int [] loteria  = new int [6];
      int bai;

      System.out.println("Sartu loteriaren emaitza");
      for(int i=0;i<6;i++){
                  loteria[i]=sc.nextInt();
      }

      bai=loteriaaa(loteria);
      System.out.println("Asmatutako zenbaki kantitatea hau da:  "+bai);

  }
      public static int loteriaaa (int [] loteria){

         Scanner sc = new Scanner (System.in);
         int [] zenbakiak = new int [6];
         int bai=0;
         System.out.println("Sartu zure zenbakia");
         for(int i=0;i<6;i++){
                  zenbakiak[i]=sc.nextInt();
         }

         for(int j=0;j<6;j++){
            for (int z=0;z<6;z++){
               if(loteria[j]==zenbakiak[z]){
                  bai++;
               }
            }
         }

         return bai;


      }
}