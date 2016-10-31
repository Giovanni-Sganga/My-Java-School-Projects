package B1Verifica;

public class veicolo {

    private int girimotore;
    private int cilindrata;

    public veicolo() {
        this.girimotore = 0;
    }

    /*
     ERRORE!
     public void costruttore() {
     girimotore = 0;
        
     }*/
    public void avvia() {
        girimotore = 1000;
    }

    public void spegni() {
        girimotore = 0;
    }

    public void aumentagiri() {
        girimotore = girimotore + 10;
        if (girimotore > 7000) {
            System.out.println("Stai andando fuorigiri coglione!");
        }
    }

    public void diminuiscigiri() {
        if (girimotore < 1010) {
            System.out.println("'nvedi che stai spegnendo il motore idiota! Dai GAS FERMONE!");
        } else {
            girimotore = girimotore - 10;
        }
    }

    public int getgirimotore() {
        return girimotore;
    }

    public void setnumerogiri(int girimotore) {
        this.girimotore = girimotore;
    }
}
