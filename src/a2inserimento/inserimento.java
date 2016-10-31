/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2inserimento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author roberto.masella
 */
public class inserimento {
    // devo dichiarare un tipo static per poter essere considerato generale
    // attributi senza dichiarazione public,private, protected diventano private di default
    int numero;
    String linea;
    public int publicprova;
    protected int protectedprova;
    private int privateprova;
    

    public int  scanfintero() {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        //gestione degli errori ingloba eventuali inserimenti sbagliati!!!
        try {
            //acquisisce il numero
            System.out.println("Digita il numero intero: ");
            String pippo = obj.readLine();
            numero = Integer.parseInt(pippo);
        } catch (IOException ex) {
            System.out.println("attento caro studente hai inserito male un dato");
            //ex.printStackTrace();

        }
        return numero;

    }
    
        public String scanfstringa() {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        //gestione degli errori ingloba eventuali inserimenti sbagliati!!!
        linea = "";
        try {
            //acquisisce il numero
            System.out.println("Digita la stringa: ");
            linea = obj.readLine();
        } catch (IOException ex) {
            System.out.println("attento caro studente hai inserito male un dato");
            //ex.printStackTrace();

        }
        return linea;

    }

    
    

}
