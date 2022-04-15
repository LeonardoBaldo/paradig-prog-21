package br.com.unifacef.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    //metódo construtor
    Cliente(String nm, int nc, int na, float sd) {
        this.numeroConta = nc;
        this.numeroAgencia = na;
        this.nome = nm;
        this.saldo = sd;
    }

    Cliente() {
       
    }
    
    //metódos
    void realizarDeposito(float x){
        this.saldo += x;
    }
    void realizarSaque(float x){
        this.saldo -= x;
    }
    void dadosCliente (){
        JOptionPane.showMessageDialog(null, " Nome: " + this.nome + " Número da conta:  " + this.numeroConta +
        " Saldo atual: " + this.saldo);   
    }
        
}
