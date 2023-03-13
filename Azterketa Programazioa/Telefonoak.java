import javax.xml.bind.annotation.*;
import java.util.Arrays;
@XmlAccessorType (XmlAccessType.FIELD)

public class Telefonoak{
   
   @XmlElement (name="telefonoa")
   private int [] tf;
   
   public Telefonoak(){

      this.tf = new int [0];

   }
   
   public void addTelefonoa(int tk){
      this.tf = Arrays.copyOf(this.tf, this.tf.length+1);
      this.tf[this.tf.length-1] = tk;
   }




}