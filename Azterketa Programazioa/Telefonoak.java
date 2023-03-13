import javax.xml.bind.annotation.*;
import java.util.Arrays;
@XmlAccessorType (XmlAccessType.FIELD)

public class Telefonoak{
   @XmlElement (name="telefonoa")
   private int [] tk;
   
   public Telefonoak(){
      this.tk = new int [0];
   }
   
   public void addTelefonoa(int t){
      this.tk = Arrays.copyOf(this.tk, this.tk.length+1);
      this.tk[this.tk.length-1] = t;
   }




}