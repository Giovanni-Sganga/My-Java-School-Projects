/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package b01auto;

/**
 *
 * @author 4agr13
 */
public class Automobile extends Veicolo {
    // Come in Veicolo.java, dato che esistono metodi per controllare
    // questi attributi, è meglio non esporli per evitare che vengano impostati
    // a valori sbagliati.

    protected float velocita;
    protected int posizioneMarcia;

    public Automobile() {
        super();
        velocita = 0;
        posizioneMarcia = 0;
    }

    public void avviaMotore() {
        posizioneMarcia = 1;
        avvia();
    }

    public void fermaMotore() {
        posizioneMarcia = 0;
        spegni();
    }

    public void accelera() {
        aumentaGiri();
    }

    public void decelera() {
        diminuisciGiri();
    }

    public void cambiaMarcia(int marcia) {
        if (marcia < 0 || marcia > 5) {
            System.out.println("Impossibile impostare la marcia " + marcia);
            return;
        }
        if( marcia < posizioneMarcia ) {
            decelera();
        }
        else if( marcia > posizioneMarcia ) {
            accelera();
        }
        
        posizioneMarcia = marcia;
    }
    
    public float aggiornaVelocita() {
        return (velocita = (float)(giriMotore - 100) / 200 * posizioneMarcia);
    }
    
    public int getMarcia() {
        return posizioneMarcia;
    }
    
    public float getVelocita() {
        return velocita;
    }
}
