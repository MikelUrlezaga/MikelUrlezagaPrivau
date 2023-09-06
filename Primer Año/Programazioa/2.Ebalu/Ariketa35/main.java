/*
Izena:Sergio
Data:19/01/2023
Ariketa 35
Deskribapena: Sortu Autoa superklasetik heredatuko duten 2 klase. Kotxea eta Kamioia. Erabaki zeintzuk atributu dituen bakoitzak eta azpiklasekoa den edo superklasekoa . 
Adib (kolorea, zaldiPotentzia, etab.) Bakoitzeko bere getter eta setter definitu eta toString metodoa pantailatik ateratzen duena ibilgailuaren informazioa.
*/


public class main{
   public static void  main(String[] args){
      kamioia L = new kamioia("Scania","Serie L",530,"madera",192);
      System.out.println(L.toString());
      kotxea civic = new kotxea("Honda","Civic",182,5.4,5);
      System.out.println(civic.toString());
   } 
}