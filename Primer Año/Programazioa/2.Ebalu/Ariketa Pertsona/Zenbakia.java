public class Zenbakia {
   int zbk;

   Zenbakia(int z){
      zbk=z;
   }

   void batu (){
      zbk = zbk + 5;
      System.out.println(zbk);
   }

   void kendu (){
      zbk = zbk - 5;
      System.out.println(zbk);
   }

   int getBalio (){
      return zbk;
   }
   int getBikoitza (){
      return zbk*2;
   }
   int getHirukoitza (){
      return zbk*3;
   }
   void erakutzi (){
      System.out.println(zbk);
   }



   public static void main (String [] args){
      Zenbakia nz = new Zenbakia (0);
      nz.batu();
      nz.kendu();
      nz.getBalio();
      nz.getBikoitza();
      nz.erakutzi();
      nz.getHirukoitza();
      nz.erakutzi();
   }
}