package br.com.unifacef.ex0;
public class TestaNiver {
    public static void main(String[] args) {
        Niver obj1 = new Niver();
        obj1.setDia(9);
        obj1.setMes("Outubro");
        
        Niver obj2 = new Niver();
        obj2.setDia(51);
        obj2.setMes("Outono");
        
        System.out.println("Dia: "+ obj1.getDia() + " Mês: " + obj1.getMes());
        System.out.println("Dia: "+ obj2.getDia() + " Mês: " + obj2.getMes());
    }
    
}
