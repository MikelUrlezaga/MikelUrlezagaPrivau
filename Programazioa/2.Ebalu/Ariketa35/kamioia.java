public class kamioia extends Auto{
   private String carga_mota;
   private double pisumax;
   
   public kamioia (String marka, String modelo, int zaldiak, String carga_mota, double pisumax){
      this.marka = marka;
      this.modelo = modelo;
      this.zaldiak = zaldiak;
      this.carga_mota = carga_mota;
      this.pisumax = pisumax;
   } 
   
    public String getCarga_mota(){
      return this.carga_mota;
   }  
   
   public void setCarga_mota(String carga_mota){
      this.carga_mota = carga_mota;
   } 
   
   public double getPisumax(){
      return this.pisumax;
   }  
   
   public void setPisumax(double pisumax){
      this.pisumax = pisumax;
   }
   
   public String toString(){
      return("Kamioiaren karakteristikak: Marka: "+marka+" Modeloa: "+modelo+" Zaldiak "+zaldiak+" Carga maximoa: "+carga_mota+" Pisu maximoa: "+pisumax);
   }
}