package Datuak.Ariketa1;
import javax.xml.bind.annotation.*; 

@XmlRootElement (name="langileak")
@XmlType (propOrder = {"izena","abizena","adina","hiriburua","mail","telefonoak"})
@XmlAccessorType (XmlAccessType.FIELD)


public class langileak {
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

    @XmlElement (name="telefonoak")
    private int telefonoak;


    public langileak(){

    }
    public langileak(String izena,String abizena,int adina, String hiriburua, String mail, int telefonoak){
        this.izena=izena;
        this.abizena=abizena;
        this.adina=adina;
        this.hiriburua=hiriburua;
        this.mail=mail;
        this.telefonoak=telefonoak;
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
     public void setMarka (String hiriburua){
        this.hiriburua= hiriburua;
    }

    public String getMail (){
        return this.mail;
    }
     public void setMail (String mail){
        this.mail= mail;
    }

    public String getTelefonoak (){
        return this.hiriburua;
    }
     public void setTelefonoak (int telefonoak){
        this.telefonoak= telefonoak;
    }

    @Override
    public String toString (){
        return "Izena "+this.izena+"Abizena "+this.abizena+"Adina "+this.adina+"Hiriburua "+this.hiriburua+"Mail "+this.mail+"Telefonoak "+this.telefonoak;
    }

}
