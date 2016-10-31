/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6ereditarieta;

/**
 *
 * @author roberto.masella
 */
public class Main {
    public static void main(String args[]){
         ereditarieta obj1= new ereditarieta();
         int risultato1 = obj1.somma();
         System.out.println (" risultato: "+risultato1);

         noereditarieta obj2 = new noereditarieta();
         int risultato2 = obj2.somma();
         System.out.println (" risultato: "+risultato2);
    
    }
    
}
