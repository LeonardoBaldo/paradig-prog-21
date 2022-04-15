package br.com.unifacef.lista2newEx1;

import javax.swing.JOptionPane;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("325766", "2767678691", "Felipe", 1000);
        obj1.sacar(13000);
        JOptionPane.showMessageDialog(null, obj1.mostra());
        
        Cliente obj2 = new Cliente("123456-7", "1234-6", "José", 2575);
        obj2.depositar(25);
        JOptionPane.showMessageDialog(null, obj2.mostra());
        obj2.sacar(1000);
        JOptionPane.showMessageDialog(null, obj2.mostra());
    }
    
}
