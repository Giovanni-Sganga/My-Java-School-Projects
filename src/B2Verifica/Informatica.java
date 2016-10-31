package B2Verifica;

public class Informatica extends VotiClasse {

    int IMark1 = GetVoti1();
    int IMark2 = GetVoti2();
    int IMark3 = GetVoti3();
    int IMedia;

    public Informatica() {
    }

    public Informatica(int IMark1, int IMark2, int IMark3, int IMedia) {
        this.IMark1 = IMark1;
        this.IMark2 = IMark2;
        this.IMark3 = IMark3;
        this.IMedia = IMedia;
    }

    public void Stampa() {
        System.out.println("Primo voto: " + GetVoti1());
        System.out.println("Secondo voto: " + GetVoti2());
        System.out.println("Terzo voto: " + GetVoti3());
    }

    public void Media() {
        Avarage(IMedia);
    }
}