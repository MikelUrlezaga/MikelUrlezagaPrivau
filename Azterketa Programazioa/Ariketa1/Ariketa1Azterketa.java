package Ariketa1;
/* Sortu programa bat javan �Datuak� karpetatik �langile.txt� 
fitxategia irakurtzen duena eta sortzen duena xml dokumentu bat ondorengo formatuarekin 
(xml dokumentua Datuak karpetan gordeko da):*/
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller; //beharrezkoa idazteko
import javax.xml.bind.PropertyException;
import java.util.Scanner;
import java.io.File;
public class Ariketa1Azterketa{
   public static void main(String[] args){
      
      Langile l = null;
      Langileak lk = new Langileak();
      
      
      
      try{
      
         File f = new File("Ariketa1/langileak.txt");
         Scanner sc = new Scanner(f);
         
         int id;
         String izena;
         String abizena;
         int adina;
         String herrialdea;
         String mail;
         int [] telefono = new int [2];
         
         sc.nextLine();
      

         while(sc.hasNext()){
            id=sc.nextInt();
            izena=sc.next();
            abizena=sc.next();
            adina=sc.nextInt();
            herrialdea=sc.next();
            mail=sc.next();
            telefono[0]=sc.nextInt();
            telefono[1]=sc.nextInt();
            
            l = new Langile(id, izena, abizena, adina, herrialdea, mail, telefono);
            lk.addLangile(l);
         }
    
      }catch(Exception e){
         System.out.println("Errorea irakurtzerakoan");
      }
      
   
   
      
      
      JAXBContext c;
      
      try{
         c = JAXBContext.newInstance (Langileak.class);
         Marshaller m = c.createMarshaller();
         m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
         m.marshal (lk,new File ("Ariketa1/langileak.xml"));
      }catch (Exception e){
         System.out.println("Errorea irakurtzerakoan "+e);
      }

   }
}