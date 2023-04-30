import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        String Izena;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Idatzi zure izena");
        Izena = sc.next();
        System.out.println(Izena + " izen oso polita da");
    }
}
