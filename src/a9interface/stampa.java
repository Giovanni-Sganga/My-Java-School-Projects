/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a9interface;

/**
 *
 * @author roberto.masella
 */
public class stampa {
    String nome;

    public stampa(String nome) {
        this.nome = nome;
    }
    
    
    public void stampa(animale uno, animale1 due){
        System.out.println ("il nome dell' animale: "+nome);
        //pur non essendo implementate posso chiamarle????????
        System.out.println ("verso: " + uno.verso());
        System.out.println ("mangia: " + uno.mangia());
        System.out.println ("vive: " + uno.vive());

        System.out.println ("altro verso: " + due.verso1());
        System.out.println ("altro mangia: " + due.mangia1());
        System.out.println ("altro vive: " + due.vive1());
    
    }
}
