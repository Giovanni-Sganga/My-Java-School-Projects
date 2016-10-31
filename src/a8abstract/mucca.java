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
public class mucca extends animale{

    public mucca(String nome) {
        super(nome);
    }
    
    public String vive()
    {
        return "in una fattoria";
    }
    public String mangia()
    {
        return "il fieno";
    }

    @Override
    public String verso() {
        return "muggisce";
    }
    
}
