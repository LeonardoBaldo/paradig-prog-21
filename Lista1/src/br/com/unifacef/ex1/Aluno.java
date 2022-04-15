package br.com.unifacef.ex1;

import javax.swing.JOptionPane;

public class Aluno {
    //declaração das variáveis
    String nome;
    int numeroAluno, idade;
    float p1, p2, p3;
    
    //método construtor sem parâmetro
    Aluno (){
        
    }
    
    //método construtor
    Aluno(String auxNome, int auxNumeroAluno, int auxIdade, float auxP1, float auxP2) {
        this.nome = auxNome;
        this.numeroAluno = auxNumeroAluno;
        this.idade = auxIdade;
        this.p1 = auxP1;
        this.p2 = auxP2;
    }
    
    //métodos
    float notaFinal(){
        return (this.p1 + this.p2)/2;
        // JOptionPane.showMessageDialog(null, "Média do Aluno: " + p3);
    }
    
    void dadosAluno(){
        JOptionPane.showMessageDialog(null, " Nome: " + this.nome + " Número do Aluno:  " + this.numeroAluno +
         " Idade: " + this.idade);
    }
    
    String passou (){
    //void passou(){
        //if (p3 >= 6) {
        //    JOptionPane.showMessageDialog(null, "Aluno aprovado.");
        //}
        //else {
        //    JOptionPane.showMessageDialog(null, "Aluno reprovado.");
        //}
        return(this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
        
    }
    

}
