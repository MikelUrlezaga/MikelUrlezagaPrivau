import java.util.Arrays;
public class Produktuak {
   Produktua [] p;
   
   public Produktuak(){
      p=new Produktua[0];
   }
   
   public void addProduktuak(Produktua p){
      this.p=Arrays.copyOf(this.p,this.p.length+1);
      this.p[this.p.length]=p;
   }
   
   public void getProduktuak(){
      for (int i=0;i<this.p.length;i++){
         System.out.println(p[i].toString());
      }
   }
}