package Datuak.Ariketa1;
import javax.xml.bind.annotation.*; 

@XmlRootElement (name="langileak")
@XmlType (propOrder = {"izena","abizena","adina","hiriburua","mail","telefonoa1","telefonoa2"})
@XmlAccessorType (XmlAccessType.FIELD)


public class langilea {
    @XmlAttribute (required=true)
    private int id;

    @XmlElement (name="izena")
    private String izena;

    @XmlElement (name="abizena")
    private String abizena;

    @XmlElement (name="adina")
    private int adina;

    @XmlElement (name="hiriburua")
    private String hiriburua;

    @XmlElement (name="mail")
    private String mail;

    @XmlElement (name="telefonoa1")
    private int telefonoa1;

    @XmlElement (name="telefonoa2")
    private int telefonoa2;


    public langilea(){
        this.izena="";
        this.abizena="";
        this.adina=0;
        this.hiriburua="";
        this.mail="";
        this.telefonoa1=0;
        this.telefonoa2=0;
    }
    public langilea(String izena,String abizena,int adina, String hiriburua, String mail, int telefonoa1, int telefonoa2){
        this.izena=izena;
        this.abizena=abizena;
        this.adina=adina;
        this.hiriburua=hiriburua;
        this.mail=mail;
        this.telefonoa1=telefonoa1;
        this.telefonoa2=telefonoa2;
    }
    
    public String getIzena (){
        return this.izena;
    }
     public void setIzena (String izena){
        this.izena= izena;
    }

    public String getAbizena (){
        return this.abizena;
    }
     public void setAbizena (String abizena){
        this.abizena= abizena;
    }

    public int getAdina (){
        return this.adina;
    }
     public void setAdina (int adina){
        this.adina= adina;
    }

    public String getHiriburua (){
        return this.hiriburua;
    }
     public void setHiriburua (String hiriburua){
        this.hiriburua= hiriburua;
    }

    public String getMail (){
        return this.mail;
    }
     public void setMail (String mail){
        this.mail= mail;
    }

    public int getTelefonoa1 (){
        return this.telefonoa1;
    }
     public void setTelefonoa1 (int telefonoa1){
        this.telefonoa1= telefonoa1;
    }

    public int getTelefonoa2 (){
        return this.telefonoa2;
    }
    public void setTelefonoa2 (int telefonoa2){
        this.telefonoa2= telefonoa2;
    }

    @Override
    public String toString (){
        return "Izena "+this.izena+"Abizena "+this.abizena+"Adina "+this.adina+"Hiriburua "+this.hiriburua+"Mail "+this.mail+"Telefonoa1 "+this.telefonoa1+"Telefonoa2 "+this.telefonoa2;
    }

}
