/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5setget;

/**
 *
 * @author roberto.masella
 */
public class Main {
    public static void main (String args[])
    {
        //costruttore senza parametri
        Cliente obj = new Cliente();
        //non vedo gli attributi privati vedo solo il public
        obj.mostra();
        
        //costruttore con parametri
        Cliente obj1 = new Cliente("paperino",20);
        obj1.mostra();
        /*posso utilizzare solo la void public mostra interna alla classe
          qui non vedo gli attributi e non posso gestirli!!
          System.out.println ("cliente"+obj1.nome+obj1.numeroconto);
        */
        
        //uso per gestire i private le void  set get
        obj.setNome("pluto");
        obj.setNumeroconto(69);
        obj.mostra();
        String localnome = obj.getNome();
        int localnumeroconto = obj.getNumeroconto();
        System.out.println("attributi miei locali:"+localnome+localnumeroconto );
        
        
    }
}
