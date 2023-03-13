package Ariketa1;
import javax.xml.bind.annotation.*;

@XmlRootElement (name="langile")
@XmlAccessorType (XmlAccessType.FIELD)


public class Langile{
   @XmlAttribute (required=true)
   private int id;
   @XmlElement(name="izena")
   private String izena;
   @XmlElement(name="abizena")
   private String abizena;
   @XmlElement(name="adina")
   private int adina;
   @XmlElement(name="hiriburua")
   private String herrialdea;
   @XmlElement(name="mail")
   private String mail;
   @XmlElementWrapper (name = "telefonoak")
   @XmlElement(name="telefonoak") 
   private int [] telefono;
   
   public Langile(){}
   
   public Langile(int id, String izena, String abizena, int adina, String herrialdea, String mail, int [] telefonoa){
      this.id=id;
      this.izena=izena;
      this.abizena=abizena;
      this.adina=adina;
      this.herrialdea=herrialdea;
      this.mail=mail;
      this.telefono=telefono;
   }

}