/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b03sport;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author alessandro.cotena
 */
public class Main {
     public static void main(String args[]) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        //voticlasse obj = new voticlasse();
        squadra1 obj1 = new squadra1();
        squadra2 obj2 = new squadra2();
        squadra3 obj3 = new squadra3();
     
        Boolean esci = false;
        while( !esci ) {
            System.out.println("Scegli un'opzione fra: ");
            System.out.println("\t1 - Squadra 1");
            System.out.println("\t2 - Squadra 2");
            System.out.println("\t3 - Squadra 3");
            System.out.println("\t0 - Esci");
            
            int scelta = scanner.nextInt();
            
            switch(scelta) {
                case 0:
                    esci = true;
                    break;
                case 1:
                    obj1.inserisci();
                    obj1.stampa();
                    obj1.inseriscibilancio();
                    obj1.stampabilancio();
                    break;
                case 2:
                    obj2.inserisci();
                    obj2.stampa();
                    obj2.inseriscibilancio();
                    obj2.stampabilancio();
                    break;
                case 3:
                    obj3.inserisci();
                    obj3.stampa();
                    obj3.inseriscibilancio();
                    obj3.stampabilancio();
                    break;
                default:
                    System.out.println("Scelta invalida;");
                    break;
            }
            
        }
        
    }
}
