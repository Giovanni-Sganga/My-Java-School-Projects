/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package b01auto;

/**
 *
 * @author 4agr13
 */
public class Veicolo {
   // Dato che esistono metodi per controllare questi valori, credo abbia
   // più senso dichiararli protected.
   protected int giriMotore, cilindrata;
   
   public Veicolo() {
       giriMotore = 0;
   }
   
   public void avvia() {
       giriMotore = 1000;
   }
   
   public void spegni() {
       giriMotore = 0;
   }
   
   public void aumentaGiri() {
       if( (giriMotore += 10) > 7000) {
           System.out.println("AVVISO: Diminuire la velocità.");
       }
   }
   
   public void diminuisciGiri() {
       if( (giriMotore -= 10) < 1000) {
           giriMotore = 1000;
       }
   }
   
   public int getGiriMotore() {
       return giriMotore;
   }
   
   public int getCilindrata() {
       return cilindrata;
   }
}
