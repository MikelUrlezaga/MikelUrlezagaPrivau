public class Enplegatua {

   private int langileKodea;
   private String izena;
   private String abizena1;
   private String abizena2;
   private String luzapena;
   private String emaila;
   private String bulegoKodea;
   private int nagusiKodea;
   private String lanpostua;
   
   public Enplegatua (){}
   public Enplegatua (int langileKodea, String izena, String abizena1, String abizena2, String luzapena, String emaila, String bulegoKodea, int nagusiKodea, String lanpostua){
      this.langileKodea = langileKodea;
      this.izena = izena;
      this.abizena1 = abizena1;
      this.abizena2 = abizena2;
      this.luzapena = luzapena;
      this.emaila = emaila;
      this.bulegoKodea = bulegoKodea;
      this.nagusiKodea = nagusiKodea;
      this.lanpostua = lanpostua;
   }
   
   public String getIzenAbizenak(){
      return this.izena + " " + this.abizena1 + " " + this.abizena2;
   }
   
   @Override
   public String toString(){
      return this.langileKodea + " " + this.izena + " " + this.abizena1 + " " + this.abizena2 + " " + this.luzapena + " " + this.emaila + " " + this.bulegoKodea + " " + this.nagusiKodea + " " + this.lanpostua;
   }

}