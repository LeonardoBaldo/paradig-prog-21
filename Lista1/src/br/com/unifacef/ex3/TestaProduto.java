package br.com.unifacef.ex3;

public class TestaProduto {

    public static void main(String[] args) {

    Produto obj1 = new Produto("Máscara", 101, 50, 3.5f); // f converte para float
    Produto obj2 = new Produto("Lápis Faber Castell", 789, 150, 2.99f);
    
    obj1.mostra();
    obj1.comprar(20);
    obj1.mostra();
    obj1.vender(10);
    obj1.mostra();
    obj1.subir(5.0f);
    obj1.mostra();
    obj1.vender(5);
    obj1.mostra();
    obj1.descer(5.5f);
    obj1.mostra();
    
    obj2.mostra();
    obj2.comprar(47);
    obj2.mostra();
    obj2.vender(97);
    obj2.mostra();
    obj2.subir(0.98f);
    obj2.mostra();
    obj2.vender(39);
    obj2.mostra();
    obj2.descer(0.45f);
    obj2.mostra();
    
    
    
    }
    
}
