package br.com.unifacef.ex0;

public class Gerente extends Funcionario{
    private float comissao;

    public Gerente() {
    }

    public Gerente(float comissao, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "comissao=" + comissao + super.toString();
    }
    
    @Override 
    public float calculaSalarioFinal()
    {
        return this.salario + (this.salario * this.comissao)/100;
    }
}
