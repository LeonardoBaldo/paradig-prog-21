package br.com.unifacef.ex1;

public abstract class Veiculo {
    protected String nome, modelo;

    public Veiculo() {
    }

    public Veiculo(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "nome=" + nome + ", modelo=" + modelo + '}';
    }
    
    public abstract String comoLocomovo();
    
    
}
