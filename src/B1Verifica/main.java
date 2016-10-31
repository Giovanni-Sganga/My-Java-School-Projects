package B1Verifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String args[]) throws IOException {
        int Scelta;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        veicolo Veicolo = new veicolo();
        automobile Automobile = new automobile();
        System.out.println("Ciao!");
        for (int Ciclo = 0; Ciclo < 1; Ciclo = Ciclo + 0) {
            System.out.println("Premi: 1 per avviare il motore");
            System.out.println("2 per Accelerare");
            System.out.println("3 per decelerare");
            System.out.println("4 per salire di marcia");
            System.out.println("5 per scalare di marcia");
            System.out.println("6 per fermare il motore");
            System.out.println("7 per uscire");
            System.out.println("Giri motore: " + Automobile.getgirimotore());
            System.out.println("Marcia: " + Automobile.getposizionemarcia());
            System.out.println("Velocità: " + Automobile.getvelocita());
            Scelta = Integer.parseInt(obj.readLine());

            switch (Scelta) {
                case 1: {
                    Automobile.avviamotore();
                    Automobile.aggiornavelocita();
                    break;
                }
                case 2: {
                    Automobile.accelera();
                    Automobile.aggiornavelocita();

                    break;
                }
                case 3: {
                    Automobile.decelera();
                    Automobile.aggiornavelocita();

                    break;
                }
                case 4: {
                    Automobile.cambiamarciasu();
                    Automobile.aggiornavelocita();

                    break;
                }
                case 5: {
                    Automobile.cambiamarciagiu();
                    Automobile.aggiornavelocita();

                    break;
                }
                case 6: {
                    Automobile.fermamotore();
                    Automobile.aggiornavelocita();

                    break;
                }
                case 7: {
                    Ciclo++;
                    break;
                }
            }
        }
    }
}
