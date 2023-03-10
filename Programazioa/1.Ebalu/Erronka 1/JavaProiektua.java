//Erronkako Java proiektua

import java.io.File;
import java.util.Scanner;
public class JavaProiektua {
//LOGOAK
   //Logoko marrazki guztiak batzen dituen funtzioa
   public static void logoa(){
         logo1();
   	   logo2();
   	   logo3();
   	   marra();
   	   logo4();
   	   marra();
   	   logo3();
      }
      
    //Lerro bat marrazten duen funtzioa  
    public static void marra()
    {
       System.out.print("  ");
       for(int i=1; i<=5; i++)
       {
          System.out.print("*");
       }
       System.out.print("  ");
       System.out.println("");
      
    }
    //Lehenengo triangelua marrazten duen funtzioa   
    public static void logo1()
    {
        //Posizioa jakitzeko beharrezkoak diren aldagaiak
        int A = 1;
        int B = 7;
             
        for(int i=1; i<=4; i++)
        {
          
          System.out.print(" ");
          for(int z=1; z<=7; z++)
          {
            
             if(A <= z && B >= z)
             {
                System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }      
          }
          System.out.println("");
          //Posizioaren aldaketa
          A++;
          B--;
        }   
    }
    //Bigarren triangelua marrazten duen funtzioa   
    public static void logo2()
    {
       
        int A = 5;
        int B = 3;
          
        for(int i=1; i<=3; i++)
        {
          
          System.out.print(" ");
          for(int z=1; z<=7; z++)
          {
            
             if(B <= z && A >= z)
             {
                System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }      
          }
          System.out.println("");
          A++;
          B--;
        }   
    }
    //Triangelu hutsa marrazten duen funtzioa  
    public static void logo3()
    {
       
        for(int i=1; i<=7; i=i+2)
        {
          for(int z=7; z>=i; z=z-2)
          {
             System.out.print(" ");              
          }
            
          System.out.print("*");
            
          for(int z=1; z<= (i-2); z++)
          { 
             System.out.print(" ");
          }
             if(i==1)
             {
                System.out.println(""); 
             }
             else
             {
                System.out.println("*");
             }                 
        }     
     }
     //Lerro bertikal bat egiten duen funtzioa  
     public static void logo4()
     {
       
         for(int i=1; i<=3; i++)
         {
             
            for(int z=1; z<=4; z++)
            {
             
               System.out.print(" ");
             
            }
             
         System.out.println("*");
          
         }
       
     }
//MENUAK
   public static void menu() throws Exception{
      //Scanner funtzioa definitu
      Scanner leer = new Scanner (System.in);
   
      //Menua erakutsi
      System.out.println("1) Langileak");
      System.out.println("2) Bezeroak");
      System.out.println("3) Saioa itxi");
      
      int aukeratua;
      String saioItx = "" ;
      //Do-While erabili sartutako datua txarto dagoenean bueltatzeko
      do
      {
         do
         {  
            //Menu bat beste funtzioei deitzeko   
            System.out.println("Sartu zenbakia (1/2/3)");
            aukeratua = leer.nextInt();
   
            switch(aukeratua)
            {
            
               case 1:
               
                  menuLangile();
               
               break;
               
               case 2:
               
                  menuBezero();
               
               break;
               
               case 3:
               
                  System.out.println("Saioa itxi nahi duzu? (b/e)");
                  saioItx = leer.next();
               
               break;
               default:
                  System.out.println("Hau ez da aukera bat. Saiatu berriro.");
                  menu();
            
            }
            
          } while(aukeratua != 1 && aukeratua != 2 && aukeratua != 3);
           
      } while(saioItx.equals("e"));   
   
    }
    //Langileen menua
    public static void menuLangile() throws Exception{
      //Scanner funtzioa definitu     
      Scanner leer = new Scanner (System.in);
   
      //Menua erakutsi
      System.out.println("1) Kontsultatu langile baten informazioa (Izen-abizena, telefonoa eta alta-eguna)");
      System.out.println("2) Nagusi baten langileen zerrenda erakutsi (Izen-abizena eta emaila)");
      System.out.println("3) Aurreko pausora joan");
      
      int aukeratua;
      //Do-While bat erabili datua txarto sartutakoan bueltatzeko     
      do
        {     
           System.out.println("Sartu zenbakia (1/2/3)");
           aukeratua = leer.nextInt();
   
           switch(aukeratua)
           {
            
              case 1:
               
                 langileKontsulta();
               
              break;
               
              case 2:
               
                 nagusiKontsulta();
               
              break;
               
              case 3:
               
                 menu();
               
              break;
              default:
                 System.out.println("Hau ez da aukera bat. Saiatu berriro.");
                 menuLangile();
            
           }
            
       } while(aukeratua != 1 && aukeratua != 2 && aukeratua != 3);        
    }
    //Bezeroen menua
    public static void menuBezero() throws Exception{
      //Scanner funtzioa definitu
      Scanner leer = new Scanner (System.in);
   
      //Menua erakutsi
      System.out.println("1) Bezeroaren kontaktuak kontsultatu (izena-abizena, email eta telefonoa)");
      System.out.println("2) Bezero batek egindako erosketa baten faktura sortu (eskaera zenbakia, produktuak eta kopurua eta kalkulatu behar du totala 2 hamartarretara borobilduta)");
      System.out.println("3) Aurreko pausora joan");
      
      int aukeratua;
      //Do-While bat erabili datua txarto sartutakoan bueltatzeko 
      do
        {     
           System.out.println("Sartu zenbakia (1/2/3)");
           aukeratua = leer.nextInt();
   
           switch(aukeratua)
           {
            
              case 1:
               
                 bezeroKontsulta();
               
              break;
               
              case 2:
               
                 faktura();
               
              break;
               
              case 3:
               
                 menu();
               
              break;
              default:
                 System.out.println("Hau ez da aukera bat. Saiatu berriro.");
                 menuBezero();
            
           }
            
       } while(aukeratua != 1 && aukeratua != 2 && aukeratua != 3);        
    }
   

//BEZEROEN FUNTZIOAK

   //Bezeroen kontaktuak kontsultatu (izena-abizena, email eta telefonoa)
   public static void bezeroKontsulta() throws Exception{
      //Erabiliko ditugun aldagaiak
      int auxIdBezero, idBezero;
      String izena = "", abizena = "", mail = "", telefono = "", auxIzena, auxAbizena, auxMail, auxTelefono;
      
      //Erabiliko ditugun artxiboak zabaldu
      File fBezero = new File("BEZERO.txt");
      File fBezeroTelefono = new File("BEZERO_TELEFONO.txt");
      
      //Scannerak martxan jarri fitxeroak irakurtzeko
      Scanner scBezero = new Scanner(fBezero);
      Scanner scBezeroTelefono = new Scanner(fBezeroTelefono);
      Scanner sc = new Scanner(System.in);
      
      //Bezeroaren IDa eskatu
      System.out.println("Sartu bezero baten IDa: ");
      idBezero = sc.nextInt();
      
      //Lehenengo fitxeroa irakurtzeko while egitura. Izena, abizena eta maila lortuko dugu
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
      
      //Bigarren fitxeroa irakurri while batekin telefonoa lortzeko
      scBezeroTelefono.nextLine();
      while(scBezeroTelefono.hasNext()){
         scBezeroTelefono.next();
         auxIdBezero = scBezeroTelefono.nextInt();
         auxTelefono = scBezeroTelefono.next();
         if(idBezero == auxIdBezero){
            telefono = auxTelefono;
         }
      }
      scBezeroTelefono.close();
      System.out.println("Bezeroaren izena eta abizena: " + izena + " " + abizena + " E-mail: " + mail + " Telefonoa: " + telefono);
      System.out.println("");//Hutsune bat uzteko
      menuBezero();
   }
   
   //Bezero batek egindako erosketa baten faktura sortu (eskaera zenbakia, produktuak eta kopurua eta kalkulatu behar du totala 2 hamartarretara borobilduta)
   public static void faktura() throws Exception{
      //Erabiliko ditugun aldagaiak
      int idEskari = 0, idProduktu, auxIdBezero, auxIdEskari, auxIdProduktu, idBezero;
      double batuketaGuz = 0;
      String bezeroId = "", eskariId = "", tituluak, guztiraString, eskariGuztiak;
      
      
      //Erabiliko ditugun artxiboak zabaldu
      File fEskari = new File("ESKARI.txt");
      File fEskariLerro = new File ("ESKARI_LERRO.txt");
      
      
      //Scannerak sortu
      Scanner scEskari = new Scanner(fEskari);
      Scanner scEskariLerro = new Scanner(fEskariLerro);
      Scanner sc = new Scanner(System.in);
      
      //Bezeroaren IDa eskatu
      System.out.println("Bezeroaren IDa idatzi:");
      idBezero = sc.nextInt();
      
      //String.format formatua emateko erakutsiko ditugun datuei
      bezeroId = String.format("Bezeroaren ID: %d", idBezero);
      tituluak = String.format("%12s %12s %12s %12s", "PRODUKTUA", "KOPURUA", "SALNEURRIA", "GUZTIRA");
      
      //Stringak erabili datuak erakusteko
      System.out.println(bezeroId);
      
      //Lehenengo while batekin bezero bakoitzak egindako eskarien IDak lortuko ditugu
      scEskari.nextLine();
      while(scEskari.hasNext()){
         auxIdEskari = scEskari.nextInt();
         auxIdBezero = scEskari.nextInt();
         if(idBezero == auxIdBezero){
            idEskari = auxIdEskari;
            System.out.println("");
            eskariId = String.format("Eskariaren ID: %d", idEskari);
            System.out.println(eskariId);
            System.out.println(tituluak);  
            batuketaGuz = batuketaGuz + guztira(fEskariLerro, idEskari);
            guztiraString = String.format("%39s %11.2f", "Guztira: ", guztira(fEskariLerro, idEskari));
            System.out.println(guztiraString); 
         }       
         scEskari.nextLine();
      }
      scEskari.close();
      System.out.println("");
      eskariGuztiak = String.format("%39s %11.2f", "Eskari guztiak: ", (Math.round(batuketaGuz*100.0)/100.0));
      System.out.println(eskariGuztiak);
      System.out.println("");//Hutsune bat uzteko
      menuBezero();
   }
   
   //Faktura bakoitzaren guztirako salneurria kalkulatzeko funtzioa
   public static double guztira(File fEskariLerro, int idEskari) throws Exception{
      //Aldagaiak
      int auxIdEskari, idProduktu = 0, kontadorea;
      double salneurri = 0, kopuru = 0, guztiraProd = 0, guztira = 0;
      String datuak;
      
      //Scannera martxan jarri
      Scanner scEskariLerro = new Scanner(fEskariLerro);
      
      //While egitura datuak irakurtzeko
      scEskariLerro.nextLine();
      while(scEskariLerro.hasNext()){
         guztiraProd = 0; //Buelta bakoitza hastean produktuaren guztirako prezioa 0 jarri behar da, bestela askotan gehituko duelako
         auxIdEskari = scEskariLerro.nextInt();
         scEskariLerro.next();
         idProduktu = scEskariLerro.nextInt();
         kopuru = scEskariLerro.nextDouble();
         salneurri = scEskariLerro.nextDouble();
         if(idEskari == auxIdEskari){
            guztiraProd = kopuru * salneurri;
            datuak = String.format("%12d %12d %12.2f %12.2f", idProduktu, (int)kopuru, salneurri, guztiraProd);
            System.out.println(datuak); 
         }
         guztira += guztiraProd; 
      }
      scEskariLerro.close();
      
      return guztira;
   }

//LANGILEEN FUNTZIOAK
   
   //Langileen informazioa kontsultatu
   public static void langileKontsulta() throws Exception{
      //Erabiliko ditugun aldagaiak definitu
      int auxIdLangile, idLangile;
      String izena = "", abizena = "", telefonoa = "", data = "", auxIzena, auxAbizena, auxTelefonoa, auxData;
      
      //Artxiboak ireki
      File fLangile = new File("LANGILE.txt");
          
            
      //Scannerak martxan jarri "Langile" artxibotik hartzeko eta kontsolako testua irakurtzeko
      Scanner scLangile = new Scanner(fLangile);
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Idatzi langile baten IDa: ");
      idLangile = sc.nextInt();
      
      //While egitura datuak lortzeko
      scLangile.nextLine(); //Lehenengo lerroa saltatu
      while(scLangile.hasNext()){
         auxIdLangile = scLangile.nextInt();
         auxIzena = scLangile.next();
         auxAbizena = scLangile.next();
         scLangile.next();
         auxTelefonoa = scLangile.next();
         auxData = scLangile.next();
         if(idLangile == auxIdLangile){
            izena = auxIzena;
            abizena = auxAbizena;
            telefonoa = auxTelefonoa;
            data = auxData;
         }
         scLangile.nextLine();
      }
      scLangile.close();
      
      //Pantailatik erakutsi datuak
      System.out.println("Izena eta abizena: " + izena + " " + abizena + " Telefonoa: " + telefonoa + " Kontratatze-data: " + data);
      System.out.println("");//Hutsune bat uzteko.
      menuLangile();
   }
   
   //Nagusia emanda begiratu nortzuk diren langileak
   public static void nagusiKontsulta() throws Exception{
      //Erabiliko ditugun aldagaiak definitu
      int auxIdNagusi, idNagusi;
      String izena, abizena, mail;
      
      //Artxiboa zabaldu
      File fLangile = new File("LANGILE.txt");
      
      //Scannera martxan jarri "Langile" fitxeroa irakurtzeko eta kontsolako testua irakurtzeko
      Scanner scLangile = new Scanner(fLangile);
      Scanner sc = new Scanner(System.in);
      
      //Nagusiaren IDa lortzeko
      System.out.println("Nagusi baten IDa idatzi: ");
      idNagusi = sc.nextInt();
      
      //While egitura datuak lortzeko
      scLangile.nextLine(); //Lehenengo lerroa saltatzeko
      while(scLangile.hasNext()){
         scLangile.next();
         izena = scLangile.next();
         abizena = scLangile.next();
         mail = scLangile.next();
         scLangile.next();
         scLangile.next();
         auxIdNagusi = scLangile.nextInt();
         if(idNagusi == auxIdNagusi){
            System.out.println("Izena eta abizena: " + izena + " " + abizena + " Email: " + mail);
         }
      }
      scLangile.close();
      System.out.println("");//Hutsune bat uzteko.
      menuLangile();
   }

//ERABILTZAILEA ETA PASAHITZA
   //Erabiltzailea egokia den ala ez ikusteko funtzioa
   public static boolean erabiltzaileaEgiaztatu (String erabiltzaile) {
      
      //Switch egitura egokia den edo ez jakiteko
      switch(erabiltzaile) {
         case "asier":
            return true;
         case "aimar":
            return true;
         case "gorka":
            return true;
         case "mikel":
            return true;
         case "adrian":
            return true;
        default:
            System.out.println("Ez da erabiltzaile egoki bat, saiatu berriro");
            return false;
      }
   }
   
   public static boolean pasahitzaEgiaztatu (String erabiltzaile, int pasahitza) { //Eskatutako aldagaiak erabiltzailea eta pasahitza izango dira, biak konparatu ahal izateko
      switch(erabiltzaile) {
         //Erabiltzailearen arabera pasahitza egokia den edo ez konprobatuko du. Horrela bakoitzak nahi duen pasahitza jarri ahal izango du
         case "asier":
            if(pasahitza == 1234) {
               return true;
            }
            else {
               System.out.println("Saiatu berriro");
               return false;
            }
         case "aimar":
            if(pasahitza == 1234) {
               return true;
            }
            else {
               System.out.println("Saiatu berriro");
               return false;
            }
         case "gorka":
            if(pasahitza == 1234) {
               return true;
            }
            else {
               System.out.println("Saiatu berriro");
               return false;
            }
         case "mikel":
            if(pasahitza == 1234) {
               return true;
            }
            else {
               System.out.println("Saiatu berriro");
               return false;
            }
         case "adrian":
            if(pasahitza == 1234) {
               return true;
            }
            else {
               System.out.println("Saiatu berriro");
               return false;
            }
        default:
            System.out.println("Ez da pasahitza egoki bat, saiatu berriro");
            return false;
      }
   }
   
   public static void main(String[] args) throws Exception{
      //Erabiliko diren aldagaiak definitu
      String erabiltzaile;
      int pasahitza;
      boolean erabiltzaileEgokia, pasahitzaEgokia;
      
      
      //Scannera martxan jarri idatzitako datuak irakurtzeko
      Scanner sc = new Scanner(System.in);
      
      //Erabiltzailea eta pasahitza eskatu
      do {
         System.out.println("Erabiltzailea:");
         erabiltzaile = sc.next();
         erabiltzaileEgokia = erabiltzaileaEgiaztatu(erabiltzaile);
      }
      while(erabiltzaileEgokia == false);
      
      do{
         System.out.println("Pasahitza: ");
         pasahitza = sc.nextInt();
         pasahitzaEgokia = pasahitzaEgiaztatu(erabiltzaile, pasahitza);
      }
      while(pasahitzaEgokia == false);
      
      System.out.println("Kaixo " + erabiltzaile + "!");
      
      //Logoko funtzioa deitu
      logoa();
      
      //Menuko funtzioak deitu
      menu();
             
   }
}