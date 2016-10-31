package B1Verifica;

public class automobile extends veicolo {

    private int velocita;
    private int posizionemarcia;

    public automobile() {
        this.velocita = 0;
        this.posizionemarcia = 0;
    }

    /*
     ERRORE
     public void costruttoreB() {
     velocita = 0;
     posizionemarcia = 0;
     }
     */
    public void avviamotore() {
        posizionemarcia = 1;
        avvia();
    }

    public void fermamotore() {
        posizionemarcia = 0;
        diminuiscigiri();
    }

    public void accelera() {
        aumentagiri();
    }

    public void decelera() {
        diminuiscigiri();
    }

    public void cambiamarciasu() {
        posizionemarcia++;
    }

    public void cambiamarciagiu() {
        posizionemarcia--;
    }

    public void aggiornavelocita() {
        velocita = (getgirimotore() - 100) / 200 * posizionemarcia;
        System.out.println("Velocità: " + velocita);
    }

    public int getvelocita() {
        return velocita;
    }

    public int getposizionemarcia() {
        return posizionemarcia;
    }
}
