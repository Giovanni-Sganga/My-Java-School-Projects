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
public class Cliente2 extends Supermercato {

    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    public Cliente2() {

    }

    public void FunzioneInserimento() throws IOException {
        System.out.println("Inserire Costo Carne: ");
        CostoCarne = Float.valueOf(obj.readLine());
        System.out.println("Inserire Costo Alimentari: ");
        CostoAlimentari = Float.valueOf(obj.readLine());
        System.out.println("Inserire Costo Frutta: ");
        CostoFrutta = Float.valueOf(obj.readLine());
    }

    public void FunzioneStampa() {
        System.out.println("Costo Carne: " + CostoCarne);
        System.out.println("Costo Alimentari: " + CostoAlimentari);
        System.out.println("Costo Costo: " + CostoFrutta);
    }
}