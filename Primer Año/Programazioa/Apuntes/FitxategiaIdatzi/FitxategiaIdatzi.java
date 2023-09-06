package FitxategiaIdatzi;
import java.io.PrintWriter;
import java.io.FileWriter;

import java.io.File;

public class FitxategiaIdatzi {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter ("FitxategiaIdatzi/Kaixo.txt");
            PrintWriter pw = new PrintWriter (f);

            pw.println("Kaixo");
            pw.flush();
            pw.close();
            f.close();

        } catch (Exception e) {
            System.out.println("Errorea");
        }
    }
}
