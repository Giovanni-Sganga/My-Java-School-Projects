/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b03sport;
import a2inserimento.inserimento;

/**
 *
 * @author alessandro.cotena
 */
public class sport extends inserimento{
    public String sedeamministrativa;
    public String sedesportiva;
    public String nome;
    
    private int bilancio;

    public sport(int bilancio) {
        this.bilancio = bilancio;
    }

    public int getBilancio() {
        return bilancio;
    }

    public void setBilancio(int bilancio) {
        this.bilancio = bilancio;
    }
    
    public sport(){
    }
    
}
