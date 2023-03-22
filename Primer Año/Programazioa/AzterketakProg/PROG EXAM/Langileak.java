import javax.xml.bind.annotation.*;
import java.util.Arrays;
@XmlRootElement (name = "langileak")
//XmlAccessorType (XmlAccessType.FIELD) //solo si tenemos getters y setters
public class Langileak{
   @XmlElement (name="langile")
   private Langile [] lk;
   
   public Langileak(){
      this.lk = new Langile[0];
   }
   
   public void addLangile(Langile la){
      this.lk = Arrays.copyOf(this.lk, this.lk.length+1);
      this.lk[this.lk.length-1] = la;
   }
}

