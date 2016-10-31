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
public class Main {
    public static void main(String args[]){
        //istanzio figlio e utilizzo i metodi e gli attributi del padre
        // se il pade ha costruttore devo inizializzare tali dati
        equazione objfiglio = new equazione(10,11,12);
        //metodo del padre
        objfiglio.somma();
        //metodo del figlio
        objfiglio.stampaequazione();
        
         //istanzio figlio e utilizzo i metodi e gli attributi del padre
        // se il pade non ha costruttore
        equazionesenzacostruttore objfiglio1 = new equazionesenzacostruttore();
        //nel figlio
        objfiglio1.locale = 10;
        //nel padre
        objfiglio1.numero1 =11;
        objfiglio1.numero2 =12;
        
        //metodo del padre
        objfiglio1.somma();
        //metodo del figlio
        objfiglio1.stampaequazione();
        
        
        
        
    
    }
    
}
