public class Funciones {
    public static void main(String[] args) {
        
        int zbk1;
        int zbk2;

        zbk1 = 1;
        zbk2 = 5;
        
        zbk2 = metodo1(zbk1);
        metodo2(zbk2);
    }

    public static int metodo1(int zbk1){
        zbk1++;
        return zbk1;
    }

    public static void metodo2(int zbk2){
        System.out.println("Zure zenbakia hau da = " + zbk2);
    }
}
