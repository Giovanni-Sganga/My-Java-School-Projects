/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B5Verifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author giovanni.sganga
 */
public class main {

    public static void main(String args[]) throws IOException {
        int i;
        int Scelta;
        Cliente1 Cliente1 = new Cliente1();
        Cliente2 Cliente2 = new Cliente2();
        Cliente3 Cliente3 = new Cliente3();
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i <= 1; i = i + 0) {
            System.out.println("Ehi! Premi 1 per Cliente1");
            System.out.println("Premi 2 per Cliente2");
            System.out.println("Premi 3 per Cliente3");
            System.out.println("Premi 4 per Uscire");
            Scelta = Integer.parseInt(obj.readLine());
            switch (Scelta) {
                case 1: {
                    Cliente1.FunzioneInserimento();
                    Cliente1.FunzioneStampa();
                    break;
                }
                case 2: {
                    Cliente2.FunzioneInserimento();
                    Cliente2.FunzioneStampa();
                    break;
                }
                case 3: {
                    Cliente3.FunzioneInserimento();
                    Cliente3.FunzioneStampa();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Inserimento errato. Idiota.");
                    break;
                }
            }
        }
    }
}
