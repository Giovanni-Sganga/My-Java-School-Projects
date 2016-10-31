package b01auto;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author 4agr13
 */
public class Main {
    public static void main(String args[]) throws IOException {
        
        Automobile auto = new Automobile();
        Scanner scanner = new Scanner(System.in);
        
        Boolean esci = false;
        while( !esci ) {
            System.out.println("Scegli un'opzione fra: ");
            System.out.println("\t1 - Avvia motore");
            System.out.println("\t2 - Accelera");
            System.out.println("\t3 - Decelera");
            System.out.println("\t4 - Aumenta marcia");
            System.out.println("\t5 - Diminuisci marcia");
            System.out.println("\t6 - Spegni motore");
            System.out.println("\t0 - Esci");
            
            int scelta = scanner.nextInt();
            
            switch(scelta) {
                case 0:
                    esci = true;
                    break;
                case 1:
                    auto.avviaMotore();
                    System.out.println("Motore avviato;");
                    break;
                case 2:
                    auto.accelera();
                    System.out.println("Accelerazione in corso;");
                    break;
                case 3:
                    auto.decelera();
                    System.out.println("Decelerazione in corso;");
                    break;
                case 4:
                    auto.cambiaMarcia( auto.getMarcia() + 1 );
                    System.out.println("Marcia attuale: " + auto.getMarcia() + ";");
                    break;
                case 5:
                    auto.cambiaMarcia( auto.getMarcia() - 1 );
                    System.out.println("Marcia attuale: " + auto.getMarcia() + ";");
                    break;
                case 6:
                    auto.fermaMotore();
                    System.out.println("Motore spento;");
                    break;
                default:
                    System.out.println("Scelta invalida;");
                    break;
            }
            
            System.out.println("Velocità: " + auto.aggiornaVelocita() + "km/h.");
        }
        
    }
}
