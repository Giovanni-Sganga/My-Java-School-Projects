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
public class Cliente {
    private String nome;
    private int numeroconto;

    
    //set get.............................................
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroconto() {
        return numeroconto;
    }

    public void setNumeroconto(int numeroconto) {
        this.numeroconto = numeroconto;
    }
    //......................................................
    
    
    
    
    public Cliente() {
    }


    public Cliente(String nome, int numeroconto) {
        this.nome = nome;
        this.numeroconto = numeroconto;
    }
    
    public void mostra()
    {
    
        System.out.println("cliente:"+nome + numeroconto);
    }
    
}
