/*
Izena:Sergio
Data:17/01/2023
Ariketa 31
Deskribapena:Sortu ezazu Zenbakia izeneko klase bat. Klaseak zenbaki oso bat gordeko du, eta metodo hauek ditu:
      Sortzaile lehenetsia. Zenbakia 0 zenbakiarekin abiaraziko da.
      Zenbakia abiaraziko duen sortzailea.
      batu izeneko metodoa. Metodo honek barne zenbakiari beste zenbaki bat batuko dio.
      kendu izeneko metodoa. Metodo honek barne zenbakiari beste zenbaki bat kenduko dio.
      getBalioa: Barne zenbakia itzultzen du.
      getBikoitza: Barne zenbakiaren bikoitza itzultzen du.
      getHirukoitza: Barne zenbakiaren hirukoitza itzultzen du.
      setBalioa: Barne zenbakiaren balioa aldatzen du.
*/


public class Zenbakia{
   private int znb;

   public static void  main(String[] args){
      Zenbakia z1 =  new Zenbakia();
      System.out.println(z1.getBalioa());
      Zenbakia z2 = new Zenbakia(2);
      z2.batu(6);
      z2.kendu(4);
      System.out.println(z2.getBikoitza());
      System.out.println(z2.getHirukoitza());
      z1.setBalioa(4);
      System.out.println(z1.getBalioa());
   }
   
   public Zenbakia (){
      znb = 0;
   }

   public Zenbakia (int i){
      znb = i;
   }
   
   public void batu (int x){
      znb = znb+x;
   }
   
   public void kendu (int x){
      znb = znb-x;
   }
   
   public int getBalioa (){
      return znb;
   }
   
   public int getBikoitza (){
      return znb*2;
   }
   
   public int getHirukoitza (){
      return znb*3;
   }
  
   public void setBalioa (int i){
      znb = i;
   }
  

}