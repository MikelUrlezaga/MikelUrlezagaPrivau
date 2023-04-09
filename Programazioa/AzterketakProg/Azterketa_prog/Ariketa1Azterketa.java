/* Sortu programa bat javan “Datuak” karpetatik “langile.txt” 
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
      
      Telefonoak tk = null;
      
      
      try{
      
         File f = new File("datuak\\langileak.txt");
         Scanner sc = new Scanner(f);
         
         int id;
         String nombre;
         String apellido;
         int edad;
         String ciudad;
         String email;
         int telefono;
         //int [] telefono = new int [2];
         
         sc.nextLine();
      

         while(sc.hasNext()){
            tk = new Telefonoak();
            id=sc.nextInt();
            nombre=sc.next();
            apellido=sc.next();
            edad=sc.nextInt();
            ciudad=sc.next();
            email=sc.next();
            telefono=sc.nextInt();
            tk.addTelefonoa(telefono);
            telefono=sc.nextInt();
            tk.addTelefonoa(telefono);
            telefono[0]=sc.nextInt();
            //telefono[1]=sc.nextInt();
            
            l = new Langile(id, nombre, apellido, edad, ciudad, email, tk);
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
         m.marshal (lk,new File ("langileak.xml"));
      }catch (Exception e){
         System.out.println("Errorea irakurtzerakoan "+e);
      }

   }
}