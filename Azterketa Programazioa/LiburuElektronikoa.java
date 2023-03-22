import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class LiburuElektronikoa extends Liburu {
    @XmlElement
    private double tamaina;
    @XmlElement
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
     public String toString (){
      return (this.mota+" "+this.izenburua+" "+this.egilea+" "+this.argitaletxea);
     }
     
     //prezioaIgo metodoa 
}