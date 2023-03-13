import javax.xml.bind.annotation.*;
import java.util.Arrays;
@XmlRootElement (name="liburuak")

public class LiburuElektronikoak{
   @XmlElement (name="liburua")
   private LiburuElektronikoa [] lk;
   
   public LiburuElektronikoak(){
      this.lk = new LiburuElektronikoa [0];
   }
  
   public void inprimatu(){
      for(int i=0; i<lk.length;i++){
         System.out.println(lk[i].toString());
      }
   }
 
   public void igoPrezioa(){
      for(int i=0; i<lk.length;i++){
         lk[i].prezioaIgo(10);
      }
   }
}