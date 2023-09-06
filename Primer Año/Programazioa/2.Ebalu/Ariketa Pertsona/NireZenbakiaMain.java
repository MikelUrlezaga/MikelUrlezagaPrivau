import java.util.Scanner;
public class NireZenbakiaMain {
   public static void main (String [] args){
      Zenbakia1 z1 = new Zenbakia1();
      Zenbakia1 z2 = new Zenbakia1(5);
      z2.batu(3);
      z2.kendu(2);
      System.out.println(z2.getBikoitza());
      System.out.println(z2.getHirukoitza());
   }
}