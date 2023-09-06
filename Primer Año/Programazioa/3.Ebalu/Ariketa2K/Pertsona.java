package Ariketa2K;
public class Pertsona {
    protected int ID;
    protected String Sexua;
    protected String Herrialdea;
    protected String Izena;
    protected String Abizena;

    public Pertsona (){}

    public Pertsona (int ID, String Sexua, String Herrialdea, String Izena, String Abizena) {
        this.ID=ID;
        this.Sexua=Sexua;
        this.Herrialdea=Herrialdea;
        this.Izena=Izena;
        this.Abizena=Abizena;
    }

    public int getID (){
        return this.ID;
    }

    public void setID (int ID){
        this.ID= ID;
    }

    public int getSexua (){
        return this.ID;
    }

    public void setSexua (int ID){
        this.ID= ID;
    }

    public int getHerrialdea (){
        return this.ID;
    }

    public void setHerrialdea (int ID){
        this.ID= ID;
    }

    public int getIzena (){
        return this.ID;
    }

    public void setIzena (int ID){
        this.ID= ID;
    }

    public int getAbizena (){
        return this.ID;
    }

    public void setAbizena (int ID){
        this.ID= ID;
    }

    @Override
    public String toString(){
        return "ID "+this.ID+"Herrialdea "+this.Herrialdea+"Izena "+this.Izena+"Abizena "+this.Abizena;
    }
}
