/*
Izena:Sergio
Data:19/01/2023
Ariketa 34
Deskribapena:Jaso produktu baten jatorrizko prezioa eta beherapena egin ondorengo prezioa, eta idatzi ezazu zer portzentaje deskontatu den itzuliko duen metodo bat.
*/

public class produktua{
   private double jatorprezioa;
   private double prezioa;

   public static void  main(String[] args){
      produktua prod = new produktua(57);
      prod.beherapena(22);
      System.out.println(prod.getPrezioa()+"€ da prezioa beherapenarekin");
      System.out.println(prod.aplikatutakoBeherapena()+"% beherapena izan du produktua");
   }
   
   public produktua(double jatorprezioa){
      this.jatorprezioa = jatorprezioa;
   }
   
   public double getJatorprezioa(){
      return this.jatorprezioa;
   }
   public double getPrezioa(){
      return this.prezioa;
   }
   
   public void setJatorprezioa(double jatorprezioa){
      this.jatorprezioa = jatorprezioa;
   }
   
   public void setPrezioa(double prezioa){
      this.prezioa = prezioa;
   }
   
   public void beherapena(double deskontua){
      this.prezioa = (jatorprezioa*deskontua)/100;
   }
   
   public double aplikatutakoBeherapena (){
      double deskontua = (prezioa/jatorprezioa)*100;
      return deskontua;
   }

}
