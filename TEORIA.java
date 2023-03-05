public class TEORIA{
   public static void main(String[] args){
      System.out.println("Kaixo");
   /*Identifikadoreak
   aldagai,konstante,klase,metodo edo paketeei emaiten den izena
   -Lehen karakterea letra bat, azpimarra karaktea,_,edo dolar karakterea,$,izan behar da.
   -Hurrengo karaktereak letrak edo zenbakiak izan behar dira.
   -Ezin da programazio-hizkuntzaren hitz erreserbaturik erabili.
   Javak maiuskulen eta minuskulen artean bereizten du.
   Aldagaia                batuketa,ikasleKopurua
   Konstantearen izena     PI,TAMAINA_MAX
   Klasearen izena         Pertsona,Karratua
   Metodoaren izena        aldatu_Balioa,abiadura_Eskuratu
   Datu Motak:(Aldagaia deklaratzeko(final ... = konstantea))
   byte,short,int,long,char,float,double,boolean
   -char null hasieran
   -boolearrak false hasieran
   -Erreferentziak null hasieran
   int eta byte ez dago baimendua byte = int datu mota txikiagoa delako
   int a; byte b = (byte) a;
   */
   
   int a,b;
   a=5;
   b=7;
   
   a+b;
   
   /*  +,-,*,/,%  */
   /*  +=,-=,*=,/=,%=,=  */
   /*  <,>,<=,>=,!=,==  */
   
   import java.util.Scanner;
   Scanner izena = new Scanner(System.in);
   /*izena.nextInt(),izena.nextDouble(),...*/
   nextXXX()   
   next()       String bat
   nextLine()   Lerro osoa
   hasNext()    Boolear bat (beste tokenik geratzen den ala ez)
   hasNextXXX   Boolear bat (beste tokenik geratzen den ala ez adierazten du,baina datu mota jakinekoa)
   
   if (adierazpen logikoa){
      sententzia 1;
      sententzia N;
   }
   else{
      sententzia 1;
      sententzia N;
   }
   
   
   switch (adierazpen logikoa){
   case balioa1:
      sententzia 1;
      sententzia N;
   break;
   case balioa2:
      sententzia 1;
      sententzia N;
   break;
   case balioaN:
      sententzia 1;
      sententzia N;
   break;
   default:
      sententzia def;
   }
   
   for (i=1;i<=x;i++){
      sententzia 1;
      sententzia N;
   }
   
   /*Kontuan izan ez sartzea inoiz*/
   while (baldintza){
      sententzia 1;
      sententzia N;
   }
   
   /*Sartu eta gero baldintza egiaztatu*/
   do {
      sententzia 1;
      sententzia N;
   }
   while (baldintza);
  
  
//File   
   
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class File{
   public static void main (String [] args){
         File fBezero = new File("BEZERO.txt");
         Scanner scBezero = new Scanner(fBezero);
         
         scBezero.nextLine();
         while(scBezero.hasNext()){
            auxIdBezero = scBezero.nextInt();
            auxIzena = scBezero.next();
            auxAbizena = scBezero.next();
            scBezero.next();
            auxMail = scBezero.next();
            if(idBezero == auxIdBezero){
               izena = auxIzena;
               abizena = auxAbizena;
               mail = auxMail;
            }
         }
         scBezero.close();
   }
}



//canRead();         (Tests whether the file is readable or not)
//canWrite();        (Tests whether the file is writable or not)
//createNewFile();   (Creates an empty file)
//delete();          (Deletes a file)
//exists();          (Tests whether the file exists)
//getName();         (Returns the name of the file)
//getAbsolutePath(); (Returns the absolute pathname of the file)
//length();          (Returns the size of the file in bytes)
//list();            (Returns an array of the files in the directory)
//mkdir();           (Creates a directory)
   
   
   
   Salbuespenak:
   (try(sententzia)-catch(harrapatuko duen blokea)-finally(exekutatuko den kodea))
   
   try {
      salbuespena;
   } catch(mota1){
      salbuespen_mota1_kudeatu;
   } catch(motaN){
      salbuespen_motaN_kudeatu;
   }
   finally {
      sententzia_finally;
   }
   
   Array-ak:
   
   Estatikoa edo Dinamikoa
   
   int[dimentsioa1][dimentsioa2][dimentsioaN]adinak;
   adinak = new int [x][a][b];
   adinak[0]=1;
   adinak[3][2][N]=5;
   /*Tamainatik kanpo jarritako indize bat badago "java.lang.ArrayIndexOutOfBoundsException"salbuespena agertuko da*/
   
   public static int[][](short[] array1, int[] array2, int[] array3, byte [][][] array4){
      //...
      int[][]ItzuleraArraya= new int[4][2];
      //...
      return itzuleraArraya;
   }
   
   }
   
   }
}