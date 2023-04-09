import java.io.File;
import javax.xml.bind.annotation.*;
import javax.xml.bind.*;
import java.util.Arrays;

@XmlRootElement(name="liburuak")
public class LiburuElektronikoaBD {
   @XmlElement (name="liburua")
   private LiburuElektronikoa [] le;
   
   public LiburuElektronikoaBD (){
      this.le=new LiburuElektronikoa [0];
   }
   
   public void addLiburuElektronika (LiburuElektronikoa le){
      this.le=Arrays.copyOf (this.le,this.le.length+1);
      this.le[this.le.length-1]=le;
   }
   
   public void liburuELektronikoaToString (){
      for (int i =0;i<this.le.length;i++){
         System.out.println(this.le[i].toString());
      }
   }
      
   public static void main (String [] args){
      LiburuElektronikoaBD le = new LiburuElektronikoaBD();
      try{
         JAXBContext context= JAXBContext.newInstance(LiburuElektronikoaBD.class);
         Unmarshaller um = context.createUnmarshaller();
         le=(LiburuElektronikoaBD) um.unmarshal(new File ("liburuak.xml"));
         le.liburuELektronikoaToString();
      }catch(Exception e){
         System.out.println("Error "+e);
      }
   }
}