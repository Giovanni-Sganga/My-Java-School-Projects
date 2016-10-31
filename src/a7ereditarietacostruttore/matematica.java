/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a7ereditarietacostruttore;

import a2inserimento.inserimento;

/**
 *
 * @author roberto.masella
 */
public class matematica extends inserimento{
    public int numero1;
    public int numero2;
    public int risultato;

    //costruttore per inizializzare gli attibuti 
    public matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    public void somma()
    {
        risultato = numero1+numero2;
    }
    
    
}
