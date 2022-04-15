package br.com.unifacef.ex0;

public class Assistente extends Funcionario{
    private float bonus;

    public Assistente() {
    }

    
    public Assistente(float bonus, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario); // Chama construtor da superclasse.
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        //super.toString() -> Chama o construtor da superclasse
        return "Assistente{" + "bonus=" + bonus + super.toString();
    }
    
    @Override
    public float calculaSalarioFinal()
    {
        return this.salario + this.bonus;
    }
}
