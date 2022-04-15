package br.com.unifacef.ex3;

import javax.swing.JOptionPane;

public class Produto {
    int id, qtde;
    String descricao;
    float preco;
    
    Produto(){
        
    }
    //método construtor
    Produto(String descricao, int id, int qtde, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
               
    }
    
    //métodos
    void comprar(int x){ 
        this.qtde += x;
    }
    void vender(int x){
        this.qtde -= x;
    }
    void subir(float x){
        this.preco += x;
    }
    void descer(float x){
        this.preco -= x;
    }
    void mostra(){
        JOptionPane.showMessageDialog(null," Descrição: " + this.descricao + " ID: " + this.id + " Número em estoque:  " 
        + this.qtde + " Preço: " + this.preco);
    }

}
