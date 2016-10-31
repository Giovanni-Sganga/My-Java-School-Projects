/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3utilizzoclassi;

import a2inserimento.inserimento;


/**
 *
 * @author roberto.masella
 */
public class Main {
    public static void main(String args[])
    {
        inserimento obj = new inserimento();
        int mionumero = obj.scanfintero();
        
        System.out.println ("numero inserito : " + mionumero);
        
        String miastringa = obj.scanfstringa();
        System.out.println ("stringa  inserita : " + miastringa);
     
    
    }
    
}
