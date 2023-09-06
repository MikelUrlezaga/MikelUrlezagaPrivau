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
   
   File:
   
   /fitxategiak irakurtzeko eta idazteko clasea inportatu

   import java.io.File;
   import java.util.Scanner;
   
   public class Adibidea {
   	public static void main … {
   		File f = new File (“fitxategirako bidea”); // adi ruta jartzerakoan “\\” bikoitza!
   		Scanner sc = new Scanner (f);
   		while (sc.hasNext()){
   			sententziak 1
         }
         sc.close() //konexioa itxi
      }
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
   getIzena();
   setIzena();
}