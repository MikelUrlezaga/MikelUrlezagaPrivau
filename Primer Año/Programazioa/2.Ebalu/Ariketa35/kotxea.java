public class kotxea extends Auto{
   private int plazak;
   private double azelerazioa;
   
   public kotxea (String marka, String modelo, int zaldiak, double azelerazioa, int plazak){
      this.marka = marka;
      this.modelo = modelo;
      this.zaldiak = zaldiak;
      this.azelerazioa = azelerazioa;
      this.plazak = plazak;
   } 
   
    public int getPlazak(){
      return this.plazak;
   }  
   
   public void setPlazak(int plazak){
      this.plazak = plazak;
   }
   
    public double getAzelerazioa(){
      return this.azelerazioa;
   }  
   
   public void setAzelerazioa(double azelerazioa){
      this.azelerazioa = azelerazioa;
   }
   
   public String toString(){
      return("Kamioiaren karakteristikak: Marka: "+marka+" Modeloa: "+modelo+" Zaldiak: "+zaldiak+" Azelerazioa 0-100:"+azelerazioa+" Plazak: "+plazak);
   }
}