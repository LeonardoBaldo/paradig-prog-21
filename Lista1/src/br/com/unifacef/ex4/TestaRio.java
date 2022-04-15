package br.com.unifacef.ex4;

public class TestaRio {

    public static void main(String[] args) {
        Rio obj1 = new Rio ("Primeira Lagoa", 2.0f, true);
        
        Rio obj2 = new Rio ("Segunda Lagoa", 3.0f, false);
        
        Rio obj3 = new Rio ("Lagoa Maior", 7.0f, true);
        
        obj1.mostra();
        obj1.chover(3.0f);
        obj1.limpar();
        obj1.mostra();
        
        obj2.mostra();
        obj2.ensolarar(0.5f);
        obj2.sujar();
        obj2.mostra();
        
        obj3.mostra();
        obj3.chover(3.0f);
        obj3.ensolarar(2.0f);
        obj3.mostra();
    }
    
}
