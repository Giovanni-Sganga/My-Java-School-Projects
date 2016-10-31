/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a7ereditarietacostruttore;

/**
 *
 * @author roberto.masella
 */
public class equazione extends matematica{
    int locale;
    //se la classe padre ha un costruttore devo inizializzare gli attributi di tale classe
    //mediante la notazione super =classe superiore)

    public equazione(int locale, int numero1, int numero2) {
        // super si riferisce agli attributi classe superiore
        super(numero1, numero2);
        //this si riferisce agli attributi locali
        this.locale = locale;
    }
    
    public void stampaequazione()
    {
        System.out.println("risultato " + risultato );
        System.out.println("locale " + locale );
    }
}
