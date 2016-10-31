/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a9interface;

/**
 *
 * @author roberto.masella
 */
public class mucca implements animale,animale1{

    public String vive()
    {
        return "in una fattoria";
    }
    public String mangia()
    {
        return "il fieno";
    }

 
    public String verso() {
        return "muggisce";
    }
    

    public String vive1()
    {
        return "anche allo stato libero";
    }
    public String mangia1()
    {
        return "anche le piante";
    }

    @Override
    public String verso1() {
        return "anche altro verso";
    }
    
    
    
}
