package br.com.unifacef.lista2newEx2;

import javax.swing.JOptionPane;

public final class Aluno {
    //private numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float)
    private int nroAluno, idade;
    private String nome;
    private float p1, p2, p3;
    
    public Aluno(){
        
    }
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2){
        this.setNroAluno(nroAluno);
        this.setIdade(idade); 
        this.setNome(nome); 
        this.setP1(p1);
        this.setP2(p2); 
    }
    //o número do aluno deve ter tamanho exatamente igual a 6. 
    public void setNroAluno(int nroAluno){
        if(Integer.toString(nroAluno).length() == 6){
            this.nroAluno = nroAluno;
        }
        else {
            System.out.println("Número de aluno está errado.");
        }
    }
    //O nome do aluno não pode ultrapassar tamanho 30.
    public void setNome(String nome){
        if(nome.length() > 30){
            System.out.println("Nome com tamanho inválido.");
            this.nome = "Inválido";
        }
        else {
            this.nome = nome;
        }
    }
    //A idade, e as notas p1 e p2 não podem ser negativas.
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade não pode ser negativa.");
        }
        else {
            this.idade = idade;
        }
    }
    public void setP1(float p1){
        if(p1 < 0){
            System.out.println("P1 não pode ser negativa.");
        }
        else {
            this.p1 = p1;
        }
    }
    public void setP2(float p2){
        if(p2 < 0){
            System.out.println("P2 não pode ser negativa.");
        }
        else {
            this.p2 = p2;
        }
    }
    //metodos
    public void notaFinal(){
        p3 = (this.p1 + this.p2)/2;
        JOptionPane.showMessageDialog(null, "Média do Aluno: " + p3);
    }
    public void dadosAluno(){
        JOptionPane.showMessageDialog(null, mostra());
    }
    //getters
    public int getNroAluno(){
        return this.nroAluno;
    }
    public int idade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    public String mostra(){
        return "Número do aluno: " + this.nroAluno + " Idade: " + this.idade + 
        " Nome: " + this.nome;
    }
}
