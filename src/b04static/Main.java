/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b04static;

import a6ereditarieta.*;

/**
 *
 * @author roberto.masella
 */
public class Main {
    public static void main(String args[]){
         ereditarieta obj1= new ereditarieta();
         ereditarieta obj2= new ereditarieta();
         ereditarieta obj3= new ereditarieta();
         ereditarieta obj4= new ereditarieta();
         obj1.conteggio(10);
         obj2.conteggio(11);
         obj3.conteggio(12);
         obj4.conteggio(13);
         System.out.println ("conteggio static" + obj4.conto);
         obj1.conteggionostatic(10);
         obj2.conteggionostatic(11);
         obj3.conteggionostatic(12);
         obj4.conteggionostatic(13);
         System.out.println ("conteggio nostatic" + obj4.contonostatic);
         
         
    
    }
    
}
