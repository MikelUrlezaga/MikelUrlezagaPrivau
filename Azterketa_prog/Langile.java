import javax.xml.bind.annotation.*;
@XmlRootElement (name="langile")
@XmlAccessorType (XmlAccessType.FIELD)


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
   //@XmlElementWrapper (name = "telefonoak")
   @XmlElement(name="telefonoak")
   private Telefonoak tk;
   //private int [] telefono;
   
   public Langile(){}
   
   public Langile(int id, String nombre, String apellido, int edad, String ciudad, String email, Telefonoak tk){ //int [] telefono
      this.id=id;
      this.nombre=nombre;
      this.apellido=apellido;
      this.edad=edad;
      this.ciudad=ciudad;
      this.email=email;
      this.tk=tk;
   }

}