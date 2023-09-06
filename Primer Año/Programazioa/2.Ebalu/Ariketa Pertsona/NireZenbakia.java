public class NireZenbakia {
   int zbk;

   NireZenbakia(int z){
      zbk=z;
   }

   void bikoitza (){
      System.out.println(zbk*2);
   }

   void hirukoitza (){
      System.out.println(zbk*3);
   }

   void laukoitza (){
      System.out.println(zbk*4);
   }

   public static void main (String [] args){
      NireZenbakia nz = new NireZenbakia (8);
      nz.bikoitza();
      nz.hirukoitza();
      nz.laukoitza();
   }
}