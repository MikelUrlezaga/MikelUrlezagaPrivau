import java.util.Arrays;

public class DBPertsona{
    private Pertsonak [] p;

    public DBPertsona(){
        p = new Pertsonak [0];
    }

    public void addPertsona(Pertsonak p){
        this.p=Arrays.copyOf(this.p,this.p.length+1);
        this.p[this.p.length-1]=p;    
    }

    public void irakurriFitxategia(Pertsonak [] p){

    }
}