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
public class cane extends animale{

    public cane(String nome) {
        super(nome);
    }
    
    
    public String vive()
    {
        return "in casa";
    }
    public String mangia()
    {
        return "croccantini";
    }

 
    public String verso() {
        return "abbaia";
    }
    
}
