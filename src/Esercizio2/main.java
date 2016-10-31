/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio2;

/**
 *
 * @author Stendi
 */
public class main {

    public static void main(String args[]) {
        String Nome = "Giovanni ";
        String Cognome = "Sganga";

        //First method
        System.out.println(Nome + Cognome);

        //Second method
        Concatena1 obj = new Concatena1();
        obj.Name();
        obj.Surname();
        System.out.println("");

        //Third method
        System.out.println(obj.SName() + " " + obj.SSurname());
        System.out.println();

        //Fourth method
        System.out.println(Nome.concat(Cognome));
    }

}
