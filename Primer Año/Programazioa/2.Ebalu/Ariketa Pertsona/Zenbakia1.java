public class Zenbakia1 {
   private int balioa;
   
   public Zenbakia1(){
      balioa = 0;
   }
   public Zenbakia1(int j){
      balioa = j;
   }
   
   public int getBalioa(){
      return balioa;
   }
   
   public void setBalioa(int b){
      balioa = b;
   }
   
   public void batu (int b){
      balioa+=b;
   }
   public void kendu (int b){
      balioa-=b;
   }
   public int setBikoitza(){
      return balioa*2;
   }
   public int setHirukoitza(){
      return balioa*3;
   }


}