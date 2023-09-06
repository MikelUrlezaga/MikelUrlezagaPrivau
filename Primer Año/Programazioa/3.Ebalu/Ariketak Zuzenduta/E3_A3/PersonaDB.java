import java.util.Arrays;

public class PersonaDB {
   private Persona [] p;
   
   public PersonaDB (){
      p=new Persona [0];
   }
   public PersonaDB (Persona [] p){
      this.p=p;
   }
   public void addPersona (Persona p){
      this.p=Arrays.copyOf(this.p, this.p.length+1);
      this.p[this.p.length-1]=p;
      
   }
   
   public Persona getPertsona (int index){
      return this.p[index];
   }
   
   public int length (){
      return this.p.length;
   }
}