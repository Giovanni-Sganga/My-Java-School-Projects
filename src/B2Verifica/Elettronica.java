package B2Verifica;

public class Elettronica extends VotiClasse {

    int EMark1 = GetVoti1();
    int EMark2 = GetVoti2();
    int EMark3 = GetVoti3();
    int EMedia;

    public Elettronica() {
    }

    public Elettronica(int EMark1, int EMark2, int EMark3, int EMedia) {
        this.EMark1 = EMark1;
        this.EMark2 = EMark2;
        this.EMark3 = EMark3;
        this.EMedia = EMedia;
    }

    public void Stampa() {
        System.out.println("Primo voto: " + GetVoti1());
        System.out.println("Secondo voto: " + GetVoti2());
        System.out.println("Terzo voto: " + GetVoti3());
    }

    public void Media() {
        Avarage(EMedia);
        System.out.println("Media: " + EMedia);
    }
}