package b02voto;

import b01auto.*;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author 4agr13
 */
public class Main {
    public static void main(String args[]) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        //voticlasse obj = new voticlasse();
        informatica obj1 = new informatica();
     
        
        Boolean esci = false;
        while( !esci ) {
            System.out.println("Scegli un'opzione fra: ");
            System.out.println("\t1 - informatica");
            System.out.println("\t2 - elettronica");
            System.out.println("\t3 - sistemi");
            System.out.println("\t0 - Esci");
            
            int scelta = scanner.nextInt();
            
            switch(scelta) {
                case 0:
                    esci = true;
                    break;
                case 1:
                    System.out.println("informatica;");
                    obj1.inserisci();
                    obj1.stampa();
                    break;
                case 2:
                    System.out.println("elettronica");
                    break;
                case 3:
                    System.out.println("sistemi");
                    break;
                default:
                    System.out.println("Scelta invalida;");
                    break;
            }
            
        }
        
    }
}
