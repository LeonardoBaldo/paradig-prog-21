package br.com.unifacef.ex0;

public class Diretor extends Funcionario{
    private float Vc;
    private String carro;

    public Diretor() {
    }

    public Diretor(float Vc, String carro, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.Vc = Vc;
        this.carro = carro;
    }

    public float getVc() {
        return Vc;
    }

    public void setVc(float Vc) {
        this.Vc = Vc;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Diretor{" + "Vc=" + Vc + ", carro=" + carro + 
                super.toString() + '}';
    }
    
    @Override
    public float calculaSalarioFinal()
    {
        return (this.salario +this.Vc * 5/100);
    }
    
}
