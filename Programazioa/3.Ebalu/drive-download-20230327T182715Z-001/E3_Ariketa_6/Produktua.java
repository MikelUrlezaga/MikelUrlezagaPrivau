
public class Produktua{
   private int produktuKodea;
   private String izena;
   private String gama;
   private String neurria;
   private String hornitzailea;
   private String deskribapena;
   private int stock;
   private double salPrezioa;
   private double horPrezioa;
   
   public Produktua(){}
   
   public Produktua(int produktuKodea, String izena, String gama, String neurria, String hornitzailea, String deskeribapena, int stock, double salPrezioa, double horPrezioa){
      this.produktuKodea=produktuKodea;
      this.izena=izena;
      this.gama=gama;
      this.neurria=neurria;
      this.hornitzailea=hornitzailea;
      this.deskribapena=deskribapena;
      this.stock=stock;
      this.salPrezioa=salPrezioa;
      this.horPrezioa=horPrezioa;
   }
   
   @Override
   public String toString(){
      return this.produktuKodea+" "+this.izena+" "+this.gama+" "+this.neurria+" "+this.hornitzailea+" "+this.deskribapena+" "+this.stock+" "+this.salPrezioa+" "+ this.horPrezioa;
   }
}