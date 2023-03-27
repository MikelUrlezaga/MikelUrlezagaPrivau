public class Persona {
   private String id;
   private String team;
   private String country;
   private String nameF;
   private String nameL;
   
   public Persona(){}
   public Persona(String id, String team, String country, String nameF, String nameL){
      this.id=id;
      this.team=team;
      this.country=country;
      this.nameF=nameF;
      this.nameL=nameL;
   }
   
   public String getId(){
      return this.id;
   }
   public String getTeam(){
      return this.team;
   }
   public String getCountry(){
      return this.country;
   }
   public String getNameF(){
      return this.nameF;
   }
   public String geetNameL(){
      return this.nameL;
   }
   public void setId (String id){
      this.id=id;
   }
   public void setTeam (String team){
      this.team=team;
   }
   public void setCountry (String country){
      this.country=country;
   }
   public void setNameF(String nameF){
      this.nameF=nameF;
   }
   public void setNameL(String nameL){
      this.nameL=nameL;
   }
   
   @Override
   public String toString (){
      return (this.id+" "+this.team+" "+this.country+" "+this.nameF+" "+this.nameL);
   }
}