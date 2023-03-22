
import java.io.FileWriter;
import java.util.Random;

public class Pruevas {
    public static void main(String[] args) {
        try {
            StringBuilder sb = null;
            int cont = 0;
            FileWriter fw = new FileWriter("ss.txt", true);
            do {

                sb = new StringBuilder();
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                alphabet = alphabet.toUpperCase();
                Random random = new Random();

                // generate a word of random length between 3 and 8 characters
                int length = random.nextInt(6) + 3;

                for (int i = 0; i < length; i++) {
                    // generate a random index into the alphabet
                    int index = random.nextInt(alphabet.length());

                    // append the character at the random index to the word
                    sb.append(alphabet.charAt(index));
                }
                fw.write(sb.toString() + "\n");
                System.out.println(sb.toString());
                cont++;
                fw.flush();
            } while (!sb.toString().equals("VSCODE"));
            System.out.println(cont);
            fw.close();
        } catch (Exception e) {
            System.out.println("Nova :D");
        }

    }
}