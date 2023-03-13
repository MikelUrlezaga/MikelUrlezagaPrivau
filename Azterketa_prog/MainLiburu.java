/*Behean duzuen klase diagraman oirrituta; irakurri “Datuak” karpetan dagoen “liburuak.xml” fitxategia. 
Bertan liburu elektronikoak bakarrik egongo dira. Sortu beharko duzue “LiburuElektronikoak.java” klasea 
gordetzen dituena liburu digitalak array batean. Ondoren, bi funtzio sortu behar dira “toString” eta “prezioaIgo”. 
Lehenengoak pantailatik aterako du liburuElektroniko bat eta bigarrenak ehuneko bat jasoko du eta prezio igoera aplikatuko du liburuari.
Bukatzeko, igoko diozue %10 30€ baino gehiago balio duten liburuei eta pantailatik aterako dituzue liburu guztiak */

import java.io.File;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller; //beharrezkoa irakurtzeko
import javax.xml.bind.PropertyException;

public class MainLiburu{
   public static void main(String[] args){
      

      JAXBContext c;
      
      try{
         c = JAXBContext.newInstance(LiburuElektronikoak.class);
         Unmarshaller um = c.createUnmarshaller();
         LiburuElektronikoak l = (LiburuElektronikoak) um.unmarshal (new File("datuak\\liburuak.xml")); //hemen sortzen da objektua
         
         l.inprimatu();
         l.igoPrezioa();
         
      }catch(Exception e){
         System.out.println("Errorea irakurtzerakoan " + e);
      }
   }
}