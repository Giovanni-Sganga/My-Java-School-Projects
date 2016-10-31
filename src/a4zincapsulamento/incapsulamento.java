/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4zincapsulamento;
import a4incapsulamento.*;
/**
 *
 * @author roberto.masella
 */
class incapsulamento {
    
    void prova(){
        
        //occorre istanziare .....System.out.println (" visibile " + var1);
        
        // non funziona perche non e' public
        //eredita obj = new eredita();
        publicincapsulamento obj = new publicincapsulamento();
        obj.due = 1;
        obj.uno=3;
        //in un altro package non vedo la private e non vedo la protected e non vedo var senza incapsul 
        //obj.privvar
        //obj.protectedvar
        //obj.senzaincapsulamentovar
        
        
        
    }
}
