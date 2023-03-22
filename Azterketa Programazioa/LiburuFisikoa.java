public class LiburuFisikoa extends Liburu {
    private int orrialdeKopurua;
    private String esteka;

    public LiburuFisikoa(String mota, String izenburua, String egilea, String argitaletxea, int argitaratzeData, double prezioa, int orrialdeKopurua, String esteka) {
        this.mota=mota;
        this.izenburua=izenburua;
        this.egilea=egilea;
        this.argitaletxea=argitaletxea;
        this.argitaratzeData=argitaratzeData;
        this.prezioa=prezioa;
        this.orrialdeKopurua = orrialdeKopurua;
        this.esteka = esteka;
    }

    // Getter eta setter metodoak

    public int getOrrialdeKopurua() {
        return orrialdeKopurua;
    }

    public void setOrrialdeKopurua(int orrialdeKopurua) {
        this.orrialdeKopurua = orrialdeKopurua;
    }

    public String getEsteka() {
        return esteka;
    }

    public void setEsteka(String esteka) {
        this.esteka = esteka;
    }
}