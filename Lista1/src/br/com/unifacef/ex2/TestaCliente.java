package br.com.unifacef.ex2;

public class TestaCliente {
    public static void main(String[] args) {
    
    Cliente client1 = new Cliente();
       
    client1.nome = "Fulano";
    client1.numeroAgencia = 1290;
    client1.numeroConta = 11;
    client1.saldo = 7400;
    client1.dadosCliente();
    client1.realizarDeposito(130);
    client1.dadosCliente();
    client1.realizarSaque(540);
    client1.dadosCliente();
    
    Cliente client2 = new Cliente();
       
    client2.nome = "Beltrano";
    client2.numeroAgencia = 7900;
    client2.numeroConta = 19;
    client2.saldo = 7400;
    client2.dadosCliente();
    client2.realizarDeposito(130);
    client2.dadosCliente();
    client2.realizarSaque(540);
    client2.dadosCliente();
    
    }
    
}
