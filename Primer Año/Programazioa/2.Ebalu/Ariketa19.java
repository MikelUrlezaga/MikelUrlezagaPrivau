import java.lang.Math;

public class Ariketa19{
   public static void main (String [] args){
      int [] zbks = new int [100];
      zbks=metodoa();
      for(int i=0;i<=99;i++){
         System.out.print(i+1 +" : ");
         System.out.println(zbks[i]);
      }
   }

   public static int [] metodoa(){
   int [] array = new int [100];
   for (int i=0;i<=99;i++){
      array[i]=(int) (Math.random()*100+1);
   }
   return array;
   } 
}