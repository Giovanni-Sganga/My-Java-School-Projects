/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Stendi
 */
public class Studente {

    String Nome = "Giovanni";
    String Cognome = "Sganga";
    int Voto;
    private String Passwd;
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    public int InserimentoVoto() {
        try {
            System.out.println("Inserisci voto");
            String SVoto = obj.readLine();
            Voto = Integer.parseInt(SVoto);

        } catch (IOException ex) {
            System.out.println("Ah ah ah! Coglione... Programmami la fava");
        }
        return Voto;
    }

    public void VisualizzaDati() {
        System.out.println("Nome: " + Nome);
        System.out.println("Cognome: " + Cognome);
        System.out.println("Voto: " + Voto);
    }

    protected String InserimentoPasswd() {
        try {
            System.out.println("Inserisci Password: ");
            Passwd = obj.readLine();
        } catch (IOException ex) {
            System.out.println("Ah ah ah! Coglione... Programmami la fava");
        }
        return Passwd;
    }

    protected void VisualizzaPasswd() {
        System.out.println("Password inserita: " + Passwd);
    }
}
