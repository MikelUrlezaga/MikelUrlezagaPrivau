import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Liburu {
   @XmlAttribute (required=true)
   protected String mota;
   @XmlElement
   protected String izenburua;
   @XmlElement
   protected String egilea;
   @XmlElement
   protected String argitaletxea;
   @XmlElement
   protected int argitaratzeData;
   @XmlElement
   protected double prezioa;

   public Liburu(){}
   
   public Liburu(String mota,String izenburua, String egilea, String argitaletxea, int argitaratzeData, double prezioa) {
       this.mota=mota;
       this.izenburua = izenburua;
       this.egilea = egilea;
       this.argitaletxea = argitaletxea;
       this.argitaratzeData = argitaratzeData;
       this.prezioa = prezioa;
   }

   // Getter eta setter metodoak

   public String getIzenburua() {
       return izenburua;
   }

   public void setIzenburua(String izenburua) {
       this.izenburua = izenburua;
   }

   public String getEgilea() {
       return egilea;
   }

   public void setEgilea(String egilea) {
       this.egilea = egilea;
   }
    public String getArgitaletxea() {
       return argitaletxea;
   }
    public void setArgitaletxea(String argitaletxea) {
       this.argitaletxea = argitaletxea;
   }
    public int getArgitaratzeData() {
       return argitaratzeData;
   }
    public void setArgitaratzeData(int argitaratzeData) {
       this.argitaratzeData = argitaratzeData;
   }
    public double getPrezioa() {
       return prezioa;
   }
    public void setPrezioa(double prezioa) {
       this.prezioa = prezioa;
   }
}