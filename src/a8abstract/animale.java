/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a8abstract;

/**
 *
 * @author roberto.masella
 */
public abstract class animale {
    String nome;
    
    //passo il nome tramite il costruttore

    public animale(String nome) {
        this.nome = nome;
    }
    
    
    
    public void stampa(){
        System.out.println ("il nome dell' animale: "+nome);
        //pur non essendo implementate posso chiamarle????????
        System.out.println ("verso: " + verso());
        System.out.println ("mangia: " + mangia());
        System.out.println ("vive: " + vive());
    
    }
    
    //dovranno essere implementate dai figli
    public abstract String verso();
    public abstract String mangia();
    public abstract String vive();
    
}
