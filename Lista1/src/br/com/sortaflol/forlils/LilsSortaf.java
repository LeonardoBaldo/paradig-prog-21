package br.com.sortaflol.forlils;

import javax.swing.JOptionPane;

public class LilsSortaf {
    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Escolha uma opção:");
        boolean tchau;
        tchau = (opcao == JOptionPane.OK_OPTION);
        
        Lils obj1 = new Lils (tchau);
        obj1.escolha1();
        obj1.escolha2();
        
    }
    
}
