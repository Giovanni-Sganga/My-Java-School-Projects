package B2Verifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VotiClasse {

    private int Voti1;
    private int Voti2;
    private int Voti3;
    public int Counter;
    public int[] Array;
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    public void SetVoti() throws IOException {
        System.out.println("Set primo voto: ");
        Voti1 = Integer.parseInt(obj.readLine());
        System.out.println("Set secondo voto: ");
        Voti2 = Integer.parseInt(obj.readLine());
        System.out.println("Set terzo voto: ");
        Voti1 = Integer.parseInt(obj.readLine());
    }

    public int GetVoti1() {
        return Voti1;
    }

    public int GetVoti2() {
        return Voti2;
    }

    public int GetVoti3() {
        return Voti3;
    }

    public VotiClasse(int Voti1, int Voti2, int Voti3) {
        this.Voti1 = Voti1;
        this.Voti2 = Voti2;
        this.Voti3 = Voti3;
    }

    public VotiClasse() {
    }

    public int Avarage(int Local) {
        Local = (Voti1 + Voti2 + Voti3) / 3;
        return Local;
    }

    public void Insertion() {
        Array[1] = Voti1;
        Array[2] = Voti2;
        Array[3] = Voti3;
    }
}