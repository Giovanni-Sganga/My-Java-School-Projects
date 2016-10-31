/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a9interface;

import a8abstract.*;

/**
 *
 * @author roberto.masella
 */
public class Main {
    public static void main (String args[])
    {
        //non posso istanziare un interface!!!
        //animale obj = new animale();
        
        //1) istanzio padre e figlio e posso solo utilizzare i metodi del figlio
        animale objanimale = new mucca ();
        System.out.println ("solo padre efiglio" +objanimale.mangia());
        System.out.println ("solo padre e figlio" + objanimale.verso());
        System.out.println ("solo padre e figlio" + objanimale.vive());
                
        
        //2) istanzio figlio (stesso risultato)
        mucca objmucca = new mucca();
        System.out.println ("solo figlio" +objmucca.mangia());
        System.out.println ("solo figlio" + objmucca.verso());
        System.out.println ("solo figlio" + objmucca.vive());
        System.out.println ("solo figlio" +objmucca.mangia1());
        System.out.println ("solo figlio" + objmucca.verso1());
        System.out.println ("solo figlio" + objmucca.vive1());
        
        //3) 
        mucca objmuccastampa = new mucca();
        cane objcanestampa = new cane();
        stampa objstampa = new stampa("nome generico");
        objstampa.stampa(objmuccastampa, objcanestampa);
        
    }
    
}
