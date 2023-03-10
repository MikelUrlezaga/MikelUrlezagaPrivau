/*
Izena:Sergio
Data:19/01/2023
Ariketa 33
Deskribapena: Sortu ezazu klase bat itsas milien eta kilometroen arteko bihurketak egiteko, eta bi metodoizango dituena. 
Metodoek milia edo kilometro kopuruak parametro bidez jasoko dituzte, eta haien izenak hauek izango dira:
      miliakKilometrotara()
      kilometroakMiliatara()
      Oharra: Itsas milia = 1.852 metro.
*/

public class distantzia{
   private double kilometro;
   private double miliak;
   private final int itsasmilia = 1852;

   public static void  main(String[] args){
      distantzia dis = new distantzia ();
      dis.miliakKilometrotara(56.6);
      System.out.println(dis.getKiloMetro()+" metro");
      dis.kilometroakMiliatara(3400.2);
      System.out.println(dis.getMiliak()+" milia");
   }
   
   public distantzia (){
      this.kilometro = 0;
      this.miliak = 0;
   }
   
   public double getKiloMetro(){
      return this.kilometro;
   }
   public double getMiliak(){
      return this.miliak;
   }
   
   public void setMetro(double kilometro){
      this.kilometro = kilometro;
   }
   
   public void setMiliak(double miliak){
      this.miliak = miliak;
   }
   
   public void miliakKilometrotara(double miliak){
      this.kilometro = miliak*itsasmilia;
   }
   public void kilometroakMiliatara(double kilometro){
      this.miliak = kilometro/itsasmilia;
   }

}
