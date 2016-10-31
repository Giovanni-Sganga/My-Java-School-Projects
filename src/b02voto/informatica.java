/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b02voto;

/**
 *
 * @author roberto.masella
 */
public class informatica extends voticlasse{
    public String localenome;
    public int localevoti1,localevoti2,localevoti3;
    
    public informatica(String nome, int voti1, int voti2, int voti3) {
        super(nome, voti1, voti2, voti3);
    }

    public informatica() {
    }
    
    
    public void stampa (){
        localenome = getNome();
        localevoti1= getVoti1();
        localevoti2= getVoti2();
        localevoti3= getVoti3();
        
        float ris = media();
        
        
        System.out.println ("dati: "+ localenome + " " + localevoti1 + " "+ localevoti2 +" "+localevoti3 + " "+ris);
    }
    
}
