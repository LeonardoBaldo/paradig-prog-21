package br.com.unifacef.ex4;

import javax.swing.JOptionPane;

public class Rio {
    String nome;
    float nivel;
    boolean poluido; // false nao está poluido, true esta poluido
    
    //método construtor
    Rio(){
        
    }
    
    Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    //métodos
    void chover(float x){
        this.nivel += x;
    }
    void ensolarar(float x){
        this.nivel -= x;
    }
    void limpar(){
        this.poluido = false;
    }
    void sujar(){
        this.poluido = true;
    }
    void mostra(){
        JOptionPane.showMessageDialog(null,"Nome do rio: " + this.nome + 
        " O rio está poluído: " + (this.poluido ? "Sim" : "Não") + " Nível do rio: " + this.nivel);
    }
    

        
}
