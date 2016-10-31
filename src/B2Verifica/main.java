package B2Verifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String args[]) throws IOException {
        int Scelta;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        Informatica Informatica = new Informatica();
        Sistemi Sistemi = new Sistemi();
        Elettronica Elettronica = new Elettronica();
        
        for (int Ciclo = 0; Ciclo < 1;) {
            System.out.println("Press 1 for \"Informatica\" ");
            System.out.println("Press 2 for \"Elettronica\" ");
            System.out.println("Press 3 for \"Sistemi\" ");
            Scelta = Integer.parseInt(obj.readLine());
            switch (Scelta) {
                case 1: {
                    Informatica.GetVoti1();
                    Informatica.GetVoti2();
                    Informatica.GetVoti3();
                    Informatica.Media();
                    break;
                }
                case 2: {
                    Elettronica.GetVoti1();
                    Elettronica.GetVoti2();
                    Elettronica.GetVoti3();
                    Elettronica.Media();
                    break;
                }
                case 3:{
                    Sistemi.GetVoti1();
                    Sistemi.GetVoti2();
                    Sistemi.GetVoti3();
                    Sistemi.Media();
                    break;
                }
            }
        }
    }
}
