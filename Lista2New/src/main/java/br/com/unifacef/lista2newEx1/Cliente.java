package br.com.unifacef.lista2newEx1;
public final class Cliente {
    //private numeroConta (String), numeroAgencia (String), nome (String) e saldo (float)
    
    private String nroConta, nroAgencia, nome;
    private float saldo;
    
    public Cliente(){
    
    }
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia); 
        this.setNome(nome); 
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta){
        if (nroConta.length() == 8){
            if(nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else {
                System.out.println("Número de conta sem dígito verificador.");
                this.nroConta = "Inválido";
            }
        }
        else {
            System.out.println("Número de conta com tamanho inválido.");
                this.nroConta = "Inválido";
        }
    }
    public void setNroAgencia(String nroAgencia){
        if (nroAgencia.length() == 6){
            if(nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else {
                System.out.println("Número de agência sem dígito verificador.");
                this.nroAgencia = "Inválido";
            }
        }
        else {
            System.out.println("Número de agência com tamanho inválido.");
            this.nroAgencia = "Inválido";
        }
    }
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome com tamanho inválido.");
            this.nome = "Inválido";
        }
    }
    public void setSaldo(float saldo){
        if (saldo < 0){
            System.out.println("Saldo não pode ser negativo.");
        }
        else{
            this.saldo = saldo;
            System.out.println("Seu saldo: " +saldo);
        }
    }
    public void sacar(float x){
        this.setSaldo(this.saldo-x);
    }
    public void depositar(float x){
        this.setSaldo(this.saldo+x);
    }
    //getters
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public String mostra(){
        return "Conta: " + this.nroConta + " Agência: " + this.nroAgencia + 
        " Nome: " + this.nome + " Saldo: " + this.saldo;
    }
}
