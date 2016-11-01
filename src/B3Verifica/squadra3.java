package B3Verifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squadra3 extends sport {

    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    public squadra3() {
    }

    public void Insert() throws IOException {
        System.out.println("Inserisci Sede Amministrativa: ");
        SedeAmministrativa = obj.readLine();
        System.out.println("Inserire Sede Sportiva");
        SedeSportiva = obj.readLine();
        System.out.println("Inserire Nome: ");
        Nome = obj.readLine();
    }

    public void print() {
        System.out.println("Sede Amministrativa: " + SedeAmministrativa);
        System.out.println("Sede Sportiva: " + SedeSportiva);
        System.out.println("Nome: " + Nome);
    }

    public void InserisciBilancio() throws IOException {
        int Bilanciamento;
        System.out.println("Settare bilancio: ");
        Bilanciamento = Integer.parseInt(obj.readLine());
        setBilancio(Bilanciamento);
    }

    public void StampaBilancio() {
        System.out.println("Bilancio: " + getBilancio());
    }
}
