/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1stampa;

/**
 *
 * @author roberto.masella
 */
public class stampa {

    int num1;
    int num2;
    int somma;

    final void somma() {
        somma = num1 + num2;
    }
    //costruttore senza parametri
    public stampa() {
    }

    //costruttore con parametri
    public stampa(int a, int b) {
        this.num1 = a;
        this.num2 = b;

    }
    //costruttore con parametri
    public stampa(int a, int b, int c) {
        this.num1 = a;
        this.num2 = b;
        this.somma();
    }
}
