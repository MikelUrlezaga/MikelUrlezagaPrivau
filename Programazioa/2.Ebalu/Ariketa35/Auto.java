public class Auto{
   protected String marka;
   protected String modelo;
   protected int zaldiak;
   protected double azelerazioa;

   public String getMarka(){
      return this.marka;
   }
   public String getModelo(){
      return this.modelo;
   }
     
   public int getZaldiak(){
      return this.zaldiak;
   }  
   
   public void setMarka(String marka){
      this.marka = marka;
   }
   
   public void setModelo(String modelo){
      this.modelo = modelo;
   }

   public void setModelo(int zaldiak){
      this.zaldiak = zaldiak;
   }
}