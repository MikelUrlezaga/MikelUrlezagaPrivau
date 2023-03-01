public class Ariketa2 {
//Array-ak ondorengo datuak izango ditu
//{{4,3,5,7,1,9},{6,8,2,1,4,9,7},{2,9,5,3,1}}

    public static void main(String[] args) {
        
        
        int [] array1 = {4,3,5,7,1,9};
        int [] array2 = {6,8,2,1,4,9,7};
        int [] array3 = {2,9,5,3,1};

        int [][] arrayHandia = new int [3][1];

        arraya1(array1);
    }

    public static int [] arraya1 (int [] array1){
        int a;
        for (int i=0; i<(array1.length);i++){
            for (int z=0; z<(array1.length);i++){
                if(array1[i]<array1[i+1]){

                }
                else{
                    a = array1[i];
                    array1 [i] = array1 [i+1];
                    array1 [i+1] = a;
                }
            }
        }
        System.out.println(array1[0]);
        return array1;
    };
}