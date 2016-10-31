package B2Verifica;

public class Sistemi extends VotiClasse {

    int SMark1 = GetVoti1();
    int SMark2 = GetVoti2();
    int SMark3 = GetVoti3();
    int SMedia;

    public Sistemi() {
    }

    public Sistemi(int SMark1, int SMark2, int SMark3, int SMedia) {
        this.SMark1 = SMark1;
        this.SMark2 = SMark2;
        this.SMark3 = SMark3;
        this.SMedia = SMedia;
    }

    public void Stampa() {
        System.out.println("Primo voto: " + GetVoti1());
        System.out.println("Secondo voto: " + GetVoti2());
        System.out.println("Terzo voto: " + GetVoti3());
    }

    public void Media() {
        Avarage(SMedia);
    }
}