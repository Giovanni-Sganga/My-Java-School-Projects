/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b02voto;

import a2inserimento.inserimento;

/**
 *
 * @author roberto.masella
 */
public class voticlasse extends inserimento {

    private String nome;
    private int voti1, voti2, voti3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVoti1() {
        return voti1;
    }

    public void setVoti1(int voti1) {
        this.voti1 = voti1;
    }

    public int getVoti2() {
        return voti2;
    }

    public void setVoti2(int voti2) {
        this.voti2 = voti2;
    }

    public int getVoti3() {
        return voti3;
    }

    public void setVoti3(int voti3) {
        this.voti3 = voti3;
    }

    public voticlasse(String nome, int voti1, int voti2, int voti3) {
        this.nome = nome;
        this.voti1 = voti1;
        this.voti2 = voti2;
        this.voti3 = voti3;
    }

    public voticlasse() {
    }
    
    

    public float media() {
        float ris = 0;
        ris = (voti1 + voti2 + voti3) / 3;
        return ris;

    }

    public void inserisci() {

        nome = scanfstringa();
        voti1 = scanfintero();
        voti2 = scanfintero();
        voti3 = scanfintero();

    }

}
