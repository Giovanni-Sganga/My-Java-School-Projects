/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b03sport;
/**
 *
 * @author alessandro.cotena
 */
public class squadra2 extends sport{

    public squadra2(int bilancio) {
        super(bilancio);
    }
    
    public int localebilancio = getBilancio();
    
    public squadra2() {
    }
    
    public void inserisci(){
        System.out.println ("Inserisci sede amministrativa: ");
        sedeamministrativa = scanfstringa();
        System.out.println ("Inserisci sede sportiva: ");
        sedesportiva = scanfstringa();
        System.out.println ("Inserisci nome: ");
        nome = scanfstringa();
    }
    
    public void stampa(){
        System.out.println ("Squadra 2");
        System.out.println ("Sede amministrativa: " + sedeamministrativa);
        System.out.println ("Sede sportiva: " + sedesportiva);
        System.out.println ("Nome: " + nome);
    }
    
    public void inseriscibilancio(){
       System.out.println ("Inserisci bilancio: ");
       localebilancio = scanfintero();
       setBilancio(localebilancio);
    }
    
    public void stampabilancio(){
        System.out.println ("Bilancio: " + getBilancio());
    }
}