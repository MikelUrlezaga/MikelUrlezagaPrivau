public class Ariketa5{
   public static void main (String [] args){
   //Definitu bariableak
   double erradio = 4.52 ;
   double perimetroa;
   double pi = 3.14;
   double azalera;
   //jakinda perimetroa 2*pi"erradioa dela eta azalera pi*erradioa ber 2, eragiketak egin kontuan izanda cast, ez badago ondo errorea ematen duelako
   perimetroa =(double)(2*pi*erradio);
   azalera =(double)(pi*erradio*erradio);
   //dena printeatu
   System.out.println ("Zirkunferentziaren perimetroa hau da =");
   System.out.println (perimetroa);
   System.out.println ("Eta azalera beste hau =");
   System.out.println (azalera);
   }
}   
