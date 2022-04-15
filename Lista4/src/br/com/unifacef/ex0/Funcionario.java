package br.com.unifacef.ex0;
// a classe não pode ser instanciada
// Vai servir de modelo para as filhas
public abstract class Funcionario {
    // Para as filhas herdatem as variaveis, vamos defini-las
    // como protegidas
    protected String nome, cpf, funcao;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String funcao, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override // ele tem pai sim, é a classe objectt, que te, toString() padrão
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + 
                ", funcao=" + funcao + ", salario=" + salario + 
                "Salario final " + this.calculaSalarioFinal() +'}';
    }
    
    // calcula e retorna salário final do funcionário
    // método abstrato que será implementado apenas nas classes filhas
    public abstract float calculaSalarioFinal();
    
    
}
