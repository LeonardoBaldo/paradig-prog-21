package br.com.unifacef.ex1;

public abstract class Motorizado {
    protected float potencia;
    protected String combustivel;

    public Motorizado() {
    }

    public Motorizado(float potencia, String combustivel) {
        this.potencia = potencia;
        this.combustivel = combustivel;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Motorizado{" + "potencia=" + potencia + ", combustivel=" + combustivel + '}';
    }
    
    @Override 
    public String comoLocomovo()
    {
        return 
    }
    
}
