package br.com.unifacef.lista3.exe02;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        //objeto-parte
        
        Passageiro p = new Passageiro("Amanda", "43405390826");
        Voo v = new Voo(123, "Fortaleva", "Salvador");
        Reserva re = new Reserva(12734, new Date(), p, v);
        
        System.out.println(re.toString());
        
        
    }
    
}
