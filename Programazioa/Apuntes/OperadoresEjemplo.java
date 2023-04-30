import java.util.Scanner;

public class OperadoresEjemplo {
    
    public static void main(String[] args) {
        int zbk1,zbk2;
        String izena1,izena2;
        Scanner sc = new Scanner(System.in);


        System.out.println("Sartu lehenengo zenbakia");
        zbk1 = sc.nextInt();
        System.out.println("Sartu bigarren zenbakia");
        zbk2 = sc.nextInt();


        System.out.println("");

        
        if (zbk1==zbk2){
            System.out.println("Zenbaki berdinak dira");
        }
        else{
            System.out.println("Zenbaki desberdinak dira");
        }


        System.out.println("");


        switch (zbk1) {
            case 1:
                System.out.println("Zenbakia 1 da");
            break;

            case 0:
                System.out.println("Zenbakia 0 da");
            break;

            default:
                System.out.println("Zenbakia ez da nahi dudana");
        }


        System.out.println("");


        for (int i=0; i<3; i++) {
            System.out.println("Errepikatu");
        }


        System.out.println("");


        while (zbk1<5) {
            zbk1 ++;
            System.out.println("+1");
        }


        System.out.println("");


        do {
            zbk1++;
            System.out.println("+1");
        } while (zbk1<50);


        System.out.println("");
    }
}
