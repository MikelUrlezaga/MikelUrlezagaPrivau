/*
Izena:Sergio
Data:17/01/2023
Ariketa 32
Deskribapena: Sortu ezazu bi sortzaile izango dituen Auto klasea. Sortzaileetako batek ez du parametrorik jasoko, eta besteak, bai. 
Bi sortzaileek marka eta modelo atributuak hasieratuko dituzte. Sor itzazu Auto klaseko bi objektu, objektu bakoitza sortzaile bat 
erabilita, eta froga ezazu egindakoa ondo dabilela.

*/


public class Auto{
   private String marka;
   private String modelo;

   public static void  main(String[] args){
      Auto coche = new Auto();
      Auto laguna = new Auto("renault","laguna");
   }
   
   public Auto (){
      this.marka = "ez du markarik";
      this.modelo = "ez dauka modelurik";
   }

   public Auto (String marka, String modelo){
      this.marka = marka;
      this.modelo = modelo;
   }  
   
   public String getMarka(){
      return this.marka;
   }
   public String getModelo(){
      return this.modelo;
   }
   
   public void setMarka(String marka){
      this.marka = marka;
   }
   
   public void setModelo(String modelo){
      this.modelo = modelo;
   }
}