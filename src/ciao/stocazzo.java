/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author giovanni.sganga
 */
public class stocazzo {
    int quanticazzi;
    private String nomedelcazzo;
    
    public void inseriscicazzi()
    {
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Quanti cazzi sono? ");
        try
        {
        quanticazzi = Integer.parseInt(obj.readLine());
                System.out.println("Nome? ");
        nomedelcazzo = obj.readLine();
        mostracazzi();
        }
        catch (Exception e)
        {
            //dfsdfs
        }
    }
    
    private void mostracazzi()
    {
        System.out.println(quanticazzi);
        System.out.println(nomedelcazzo);
    }
}
