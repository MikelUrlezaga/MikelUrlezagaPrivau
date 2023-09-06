package FitxategiaIdatzi;

public class Arrays {
    public static void main (String [] args){
       int [] a1 = {2,4,5,1,6,9};
       int [] a2 = {1,3,7,2,8,9};
       int eZuzenak;
       eZuzenak = zenbatuErantzunak(a1, a2);
       System.out.println ("Erantzun zuzenen kopurua "+eZuzenak+" da."); 
    }
    public static int zenbatuErantzunak (int [] a1, int [] a2){
       int cont=0;
       for (int i=0;i<a1.length;i++){
          for (int j=0;j<a2.length;j++){
             if (a1[i]==a2[j]){
                cont++;
             }
          }
       }
       return cont;
    }
 }