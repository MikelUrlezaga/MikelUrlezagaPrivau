public class Bezeroa {
   int kodea;
   String izena;
   String kontaktuIzena;
   String kontaktuAbizena;
   String telefonoa;
   String fax;
   String helbide1;
   String helbide2;
   String herria;
   String eskualdea;
   String herrialdea;
   String postaKodea;
   int salerosketaLangileKodea;
   double kredituMuga;
   
   public Bezeroa (int kodea, String izena, String kontaktuIzena, String kontaktuAbizena, String telefonoa, String fax, String helbide1, String helbide2, String herria, String eskualdea, String herrialdea, String postaKodea, int salerosketaLangileKodea, double kredituMuga){
      this.kodea=kodea;
      this.izena=izena;
      this.kontaktuIzena=kontaktuIzena;
      this.kontaktuAbizena=kontaktuAbizena;
      this.telefonoa=telefonoa;
      this.fax=fax;
      this.helbide1=helbide1;
      this.helbide2=helbide2;
      this.herria=herria;
      this.eskualdea=eskualdea;
      this.herrialdea=herrialdea;
      this.postaKodea=postaKodea;
      this.salerosketaLangileKodea=salerosketaLangileKodea;
      this.kredituMuga=kredituMuga;
   }
   
   public int getKodea(){
      return this.kodea;
   }
   public String getIzena(){
      return this.izena;
   }
   public String getKontaktuIzena(){
      return this.kontaktuIzena;
   }
   public String getKontaktuAbizena(){
      return this.kontaktuAbizena;
   }
   public String getTelefonoa(){
      return this.telefonoa;
   }
   public String getFax(){
      return this.fax;
   }
   public String getHelbide1(){
      return this.helbide1;
   }
   public String getHelbide2(){
      return this.helbide2;
   }
   public String getHerria(){
      return this.herria;
   }
   public String getEskualdea(){
      return this.eskualdea;
   }
   public String getHerrialdea(){
      return this.herrialdea;
   }
   public String getPostaKodea(){
      return this.postaKodea;
   }
   public int getSalerosketaLangileKodea(){
      return this.salerosketaLangileKodea;
   }
   public double getKredituMuga(){
      return this.kredituMuga;
   }
}