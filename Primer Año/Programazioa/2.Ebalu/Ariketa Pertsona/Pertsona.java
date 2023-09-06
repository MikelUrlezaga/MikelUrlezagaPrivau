public class Pertsona {
   //atributuak definitu
   public String izena;
   private String abizena1;
   private String abizena2;
   public int adina;
   private int altuera;
   //metodoak definitu
   //sortzailea
   Pertsona(){
      izena = "izenik gabe";
      abizena1 = "abizenik gabe";
      abizena2 = "abizenik gabe";
      adina = 0;
      altuera = 0;
   }
   Pertsona (String i, String a){
      izena = i;
      abizena1 = a;
   }
   
   //metodoak definitu
   void agurtu (){
      System.out.println("Kaixo "+izena+" "+abizena1+" naiz.");
   }

   public void setIzena (String i){
      izena = i;
   }
   
   public String getIzena (){
      return izena;
   }
   void setAbizena1 (String a){
      abizena1 = a;
   }
   
   String getAbizena1 (){
      return abizena1;
   }
   
   void setAbizena2 (String b){
      abizena2 = b;
   }
   
   String getAbizena2 (){
      return abizena2;
   }
   
   void setAdina (int c){
      adina = c;
   }
   
   int getAdina (){
      return adina;
   }
   
   void setAltuera (int d){
      altuera = d;
   }
   
   int getAltuera (){
      return altuera;
}
}