import javax.xml.bind.annotation.*;
@XmlRootElement (name="langile")
//XmlAccessorType (XmlAccessType.FIELD) //solo si tenemos getters y setters

public class Langile{
   @XmlAttribute (required=true)
   private int id;
   @XmlElement(name="izena")
   private String nombre;
   @XmlElement(name="abizena")
   private String apellido;
   @XmlElement(name="adina")
   private int edad;
   @XmlElement(name="hiriburua")
   private String ciudad;
   @XmlElement(name="mail")
   private String email;
   @XmlElementWrapper (name="telefonoak")
   @XmlElement(name="telefonoa")
   private int [] telefonoak;
   
   public Langile(){}
   
   public Langile(int id, String nombre, String apellido, int edad, String ciudad, String email, int tlf1, int tlf2){
      this.id=id;
      this.nombre=nombre;
      this.apellido=apellido;
      this.edad=edad;
      this.ciudad=ciudad;
      this.email=email;
      this.telefonoak = new int [2];
      this.telefonoak[0] = tlf1;
      this.telefonoak[1] = tlf2;
   }
}