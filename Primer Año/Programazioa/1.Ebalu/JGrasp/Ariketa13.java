import java.util.Scanner;
public class Ariketa13
{
	public static void main (String [] args)
   {
		int zbk1,zbk2;
		Scanner leer = new Scanner (System.in);
		System.out.print("Sartu zbk1 ");
		zbk1= leer.nextInt();
		System.out.print("Sartu zbk2 ");
		zbk2= leer.nextInt();
		zenbakiakIkusi (zbk1,zbk2);
	}
	public static void zenbakiakIkusi(int zbk1, int zbk2)
   {
   //Desberdindu zein den handiena eta txikiena gero erabiltzeko for-ean
   int max;
   int min;
   
   max = zbk1;
   min = zbk2;
   
      if(max >= min)
      {
      }
      else
      {
      max = zbk2;
      min = zbk1;
      }
      //Bi zenbakiak zeintzuk diren jakinda, for bat egin printeatuko duela buelta bakoitzean i-ren balioa + 1, honekin barruko zenbakiak emanda
   System.out.println("Bi zenbakien arteko zenbakiak hauek dira:");
   for(int i=min; i+2<=max; i++)
   {  
      System.out.print((i+1)+" ");   
	}
   }
}
