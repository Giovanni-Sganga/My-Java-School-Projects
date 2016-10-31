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
public class Main {
    public static void main (String args[])
    {
        //non posso istanziare un abstract!!!
        //animale obj = new animale("pippo");
        
        //1) istanzio padre e figlio
        animale objanimale = new mucca ("carolina");
        objanimale.stampa();
        
        //2) istanzio figlio (stesso risultato)
        mucca objmucca = new mucca("carolina");
        objmucca.stampa();
        
        animale objanimale2 = new cane("bob");
        objanimale2.stampa();
        
    }
    
}
