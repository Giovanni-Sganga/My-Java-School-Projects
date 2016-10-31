/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b04static;

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
public class ereditarieta{
    public int contonostatic=0;
    
    public static int conto=0;
    public  int conteggio(int spesa)
    {
        conto = conto + spesa;
        return conto;
    }
    public  int conteggionostatic(int spesa)
    {
        contonostatic = contonostatic + spesa;
        return contonostatic;
    }
    
}
