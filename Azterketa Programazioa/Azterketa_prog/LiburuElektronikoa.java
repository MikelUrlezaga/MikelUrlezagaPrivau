import javax.xml.bind.annotation.*;
public class LiburuElektronikoa extends Liburu{
    private double tamaina;
    private String formatua;
    
    public LiburuElektronikoa(){}

    public LiburuElektronikoa(String mota, String izenburua, String egilea, String argitaletxea, int argitaratzeData, double prezioa, double tamaina, String formatua) {    
        this.mota=mota;
        this.izenburua=izenburua;
        this.egilea=egilea;
        this.argitaletxea=argitaletxea;
        this.argitaratzeData=argitaratzeData;
        this.prezioa=prezioa;
        this.tamaina=tamaina;
        this.formatua=formatua;
     }
     
     public double getTamaina (){
        return this.tamaina;
     }
     
     public void setTamaina (double tamaina){
        this.tamaina=tamaina;
     }
     
     public String getFormatua(){
         return this.formatua;
     }
     
     public void setFormatua (String formatua){
         this.formatua=formatua;
     }
     
     //toString metodoa ateratzeko pantailatik datuak
     
     @Override
     
     public String toString(){
         return this.mota + " " +  this.izenburua + " " + this.egilea + " " + this.argitaletxea + " " + this.argitaratzeData + " " + this.prezioa + " " + this.tamaina + " " + this.formatua;
     }
     
     
     //prezioaIgo metodoa 
     
     public void prezioaIgo(int x){
        if(this.prezioa > 30){
           this.prezioa = (this.prezioa + (this.prezioa * x)/100);
           System.out.println(this.prezioa);
        }
     }
}