package Datuak.Ariketa1;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;


public class Ariketa1{
    public static void main(String[] args){
        langileak langileak = new langileak();

        String auxa,auxb,auxc,auxd;
        int auxe,auxf,auxg;
        File file = null;
        Scanner sc = null;
        try{  
            file = new File ("langileak.txt");
            sc = new Scanner (file);
            sc.nextLine();
            sc.nextInt();

                auxa = sc.next();
                auxb = sc.next();
                auxe = sc.nextInt();
                auxc = sc.next();
                auxd = sc.next();
                auxf = sc.nextInt();
                auxg = sc.nextInt();
                langileak.setIzena(auxa);
                langileak.setAbizena(auxb);
                langileak.setAdina(auxe);
                langileak.setHiriburua(auxc);
                langileak.setMail(auxd);
                langileak.setTelefonoa1(auxf);
                langileak.setTelefonoa2(auxg);

            
            System.out.println(langileak.toString());  
        }catch(Exception e){
            System.out.println("Errorea"+e);
        }







        JAXBContext c;
        try{
           c = JAXBContext.newInstance (langileak.class);
           Marshaller m = c.createMarshaller();
           m.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           m.marshal (langileak,new File ("langileak.xml"));
        }catch (Exception e){
           System.out.println("Errorea irakurtzerakoan"+e);
        }

    }
    
}
