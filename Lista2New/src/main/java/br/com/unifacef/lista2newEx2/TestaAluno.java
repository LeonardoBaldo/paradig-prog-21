package br.com.unifacef.lista2newEx2;

public class TestaAluno {
    public static void main(String[] args) {
        //public Aluno(int nroAluno, int idade, String nome, float p1, float p2
        Aluno obj1 = new Aluno(123478, 18, "Sabrina", 8, 6);
        obj1.notaFinal();
        obj1.dadosAluno();
        
        Aluno obj2 = new Aluno(807533, 14, "Carlos", 7, 8);
        obj2.notaFinal();
        obj2.dadosAluno();
        
        Aluno obj3 = new Aluno(45698789, -10, "Morgana Lamberti da Silva Sauro", -5, -2);
        obj3.notaFinal();
        obj3.dadosAluno();
    }
    
}
