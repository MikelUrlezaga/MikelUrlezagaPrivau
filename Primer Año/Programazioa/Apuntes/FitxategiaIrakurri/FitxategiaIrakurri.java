package FitxategiaIrakurri;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;


public class FitxategiaIrakurri {
    public static void main(String[] args) {
        
        String izena1,izena2,izena3,izena4;

        try {
        File f = new File("FitxategiaIrakurri/Irakurri.txt");
        Scanner sc = new Scanner(f);

        sc.nextLine();
        while(sc.hasNext()){
            izena1 = sc.next();
            System.out.println(izena1);
            izena2 = sc.next();
            System.out.println(izena2);
            izena3 = sc.next();
            System.out.println(izena3);
            izena4 = sc.next();
            System.out.println(izena4);
        }
        sc.close();
        } catch (Exception e) {
            System.out.println("Ez da irakurri");
        }
    }
}
