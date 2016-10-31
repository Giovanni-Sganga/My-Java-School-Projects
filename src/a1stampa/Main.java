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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //istanzio un oggetto della classe stampa: cosrtuttore senza parametri
        stampa obj = new stampa();
        obj.num1 = 10;
        obj.num2 = 20;
        obj.somma();
        
        System.out.println ("Risultato "+obj.somma);

        //istanzio un oggetto della classe stampa: cosrtuttore con parametri
        
        stampa obj1 = new stampa(11,21);
        obj1.somma();
        System.out.println ("Risultato "+obj1.somma);


        //istanzio un oggetto della classe stampa: cosrtuttore con parametri
        
        stampa obj2 = new stampa(12,22,0);
        System.out.println ("Risultato "+obj2.somma);
        
        
    }
    
}
