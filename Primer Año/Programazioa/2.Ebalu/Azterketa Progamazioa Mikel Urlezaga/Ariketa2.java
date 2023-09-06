public class Ariketa2 {
//Array-ak ondorengo datuak izango ditu
//{{4,3,5,7,1,9},{6,8,2,1,4,9,7},{2,9,5,3,1}}
   public static void main(String[] args){
     int [] [] zbk={{4,3,5,7,1,9},{6,8,2,1,4,9,7},{2,9,5,3,1}};
     int [] array1;
     int [] array2;
     int [] array3;
     array1 = new int [6];
     array2 = new int [7];
     array3 = new int [5];
     array1 = zbk [0];
     array2 = zbk [1];
     array3 = zbk [2];
     
     funtzio1(array1);
     funtzio2(array2);
     funtzio3(array3);
  
     zbk [0]= funtzio1(array1);
     zbk [1]= funtzio2(array2);
     zbk [2]= funtzio3(array3);
   }
   public static int [] funtzio1(int array1 []){
      int a;
         for(int z=0;z<(array1.length-1);z++){
            for(int i=0;i<(array1.length-1);i++){
               if(array1[i]>=array1[i+1]){
                  a=array1[i];
                  array1[i]=array1[i+1];
                  array1[i+1]=a;
                  
               }
               else{
            
               }
            }
         }
         for(int i=0;i<(array1.length);i++){
            System.out.println(array1[i]);
         }
         System.out.println("");
   
   return array1;
   }
   public static int [] funtzio2(int array2 []){
      int b;
         for(int z=0;z<(array2.length-1);z++){
            for(int i=0;i<(array2.length-1);i++){
               if(array2[i]>=array2[i+1]){
                  b=array2[i];
                  array2[i]=array2[i+1];
                  array2[i+1]=b;
                  
               }
               else{
            
               }
            }
         }
         for(int i=0;i<(array2.length);i++){
            System.out.println(array2[i]);
         }
         System.out.println("");
   return array2;
   }
   public static int [] funtzio3(int array3 []){
      int c;
         for(int z=0;z<(array3.length-1);z++){
            for(int i=0;i<(array3.length-1);i++){
               if(array3[i]>=array3[i+1]){
                  c=array3[i];
                  array3[i]=array3[i+1];
                  array3[i+1]=c;
                  
               }
               else{
            
               }
            }
         }
         for(int i=0;i<(array3.length);i++){
            System.out.println(array3[i]);
         }
         System.out.println("");
   return array3;
   }
}