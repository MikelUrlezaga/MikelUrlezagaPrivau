public class Ariketa2 {
//Array-ak ondorengo datuak izango ditu
//{{4,3,5,7,1,9},{6,8,2,1,4,9,7},{2,9,5,3,1}}

    public static void main(String[] args) {
        
        int [][] array = {{4,3,5,7,1,9},{6,8,2,1,4,9,7},{2,9,5,3,1}};
        int [] lehenengo = new int [6];
        int [] bigarren = new int [7];
        int [] hirugarren = new int [5];
        lehenengo = array [0];
        bigarren = array [1];
        hirugarren = array [2];

        lehenengoa(lehenengo);
        bigarrena(bigarren);
        hirugarrena(hirugarren);

        array [0] = lehenengo;
        array [1] = bigarren;
        array [2] = hirugarren;
    }
    public static int [] lehenengoa (int [] lehenengo) {

        int a;
        for (int i=0; i<(lehenengo.length-1);i++){
            for (int z=0; z<(lehenengo.length-1);z++){
                if (lehenengo[z]>lehenengo[z+1]){
                    a = lehenengo[z];
                    lehenengo[z] = lehenengo [z+1];
                    lehenengo[z+1] = a;
                } else{

                }
            }
        }
        for (int i=0;i<lehenengo.length;i++){
            System.out.print(lehenengo[i]+" ");
        }
        System.out.println("");
        return lehenengo;
    }

    public static int [] bigarrena (int [] bigarren) {

        int a;
        for (int i=0; i<(bigarren.length-1);i++){
            for (int z=0; z<(bigarren.length-1);z++){
                if (bigarren[z]>bigarren[z+1]){
                    a = bigarren[z];
                    bigarren[z] = bigarren [z+1];
                    bigarren[z+1] = a;
                } else{

                }
            }
        }
        for (int i=0;i<bigarren.length;i++){
            System.out.print(bigarren[i]+" ");
        }
        System.out.println("");
        return bigarren;
    }

    public static int [] hirugarrena (int [] hirugarren) {

        int a;
        for (int i=0; i<(hirugarren.length-1);i++){
            for (int z=0; z<(hirugarren.length-1);z++){
                if (hirugarren[z]>hirugarren[z+1]){
                    a = hirugarren[z];
                    hirugarren[z] = hirugarren [z+1];
                    hirugarren[z+1] = a;
                } else{

                }
            }
        }
        for (int i=0;i<hirugarren.length;i++){
            System.out.print(hirugarren[i]+" ");
        }
        System.out.println("");
        return hirugarren;
    }
}