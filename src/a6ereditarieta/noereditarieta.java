/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6ereditarieta;

import a2inserimento.inserimento;

/**
 *
 * @author roberto.masella
 */

// e' come se esistesse un insieme di informazioni che possono essere ricevute
public class noereditarieta {
    public int val1;
    public int val2;
    public int risultato;
    public int somma()
    {
        //ho bisogno di istanziare un oggetto di inserimento
        inserimento obj = new inserimento();
        
        val1 = obj.scanfintero();
        val2= obj.scanfintero();
        risultato = val1+val2;
        return risultato;
        
    }
    
}
