import java.util.Arrays;

public class Enplegatuak {
   private Enplegatua [] e;
   
   public Enplegatuak(){
      this.e = new Enplegatua[0];
   }
   
   public void addEnplegatua(Enplegatua e){
      this.e = Arrays.copyOf(this.e, this.e.length+1);
      this.e[this.e.length-1] = e;
   }
   
   public Enplegatua[] ateraEnplegatuak(){
      return this.e;
   }
   
   public int luzeera(){
      return this.e.length;
   }
   
   public String lortuIzenAbizenak(int i){
      return this.e[i].getIzenAbizenak();
   }
}