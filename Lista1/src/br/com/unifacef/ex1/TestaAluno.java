package br.com.unifacef.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {
    String auxNome = JOptionPane.showInputDialog("Informe o seu nome: ");
    int auxNumeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu número de aluno: "));
    int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
    float auxP1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da primeira prova: "));
    float auxP2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da segunda prova: "));
   
    Aluno obj1 = new Aluno(auxNome, auxNumeroAluno, auxIdade, auxP1, auxP2);
    
    obj1.notaFinal();
    obj1.dadosAluno();
    obj1.passou();
    //JOptioPane.showMessageDialog(null, obj1.passou());
    //obj1.dadosAluno();
    //JOptioPane.showMessageDialog(null, "Média: " + obj1.NotaFinal());
    }
    
}
