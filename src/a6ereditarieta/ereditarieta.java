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
 * inserimento
 *    ^
 *    |
 *    |
 * ereditarieta
 */
// come se esistesse un padre le cui indformazioni rimangono integrate nel nuovo insieme
public class ereditarieta extends inserimento{
    public int val1;
    public int val2;
    public int risultato;

    public int somma()
    {
        //non ho bisogno di istanziarla
        // non vedo numero perche' dichiarato non public e non vedo privatenumero
        //numero = 4;
        //privatenumero = 4;
        publicprova = 5;
        protectedprova=3;
        val1 = scanfintero();
        val2= scanfintero();
        risultato = val1+val2;
        return risultato;
        
    }
    
}
