import javax.xml.bind.annotation;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.util.Scanner;

public class Ariketa1{
	public static void main(String[] args){
      izena = new String [25];
      abizena = new String [25];
      adina = new int [25];
      hiriburua = new String [25];
      mail = new String [25];
      telefonoa1 = new int [25];
      telefonoa2 = new int [25];
      int i=0;
      
      File f = new File ("langileak.txt");  
      Scanner leer = new Scanner (f);
      while (leer.hasNext()){
         leer.nextLine();
      	leer.next()=izena[i];
         leer.next()=abizena[i];
         leer.nextInt()=adina[i];
         leer.next()=hiriburua[i];
         leer.next()=mail[i];
         leer.nextInt()=telefonoa1[i];
         leer.nextInt()=telefonoa2[i];
         i++;
      }
      leer.close();

      Element 1 = new Element (izena,izena[0],izena[1],izena[2],izena[3],izena[4],izena[5],izena[1],izena[1],izena[1],izena[1],izena[0],izena[1],izena[1],izena[1],izena[1],izena[0],izena[1],izena[1],izena[1],izena[1],izena[0],izena[1],izena[1],izena[1],izena[1],);
      Element 2 = new Element (abizena,abizena[0],...);
      Element 3 = new Element (adina,adina[0],...);
      Element 4 = new Element (hiriburua,hiriburua[0],...);
      Element 5 = new Element (mail,mail[0],...);
      Element 6 = new Element (telefonoa1,telefonoa1[0],...);
      Element 7 = new Element (telefonoa2,telefonoa2[0],...);
//badakit ez doala baina jartzeko nik egingo nuen moduan      
      JAXBContext c;
      try{
      c = JAXBContext.newInstance (langileak.class);
      Marshaller m = c.createMarshaller();
      m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      m.marshal (es,new File ("elements.xml"));
      }catch (Exception e){
      System.out.println("Errorea irakurtzerakoan");
      }
   }
}

