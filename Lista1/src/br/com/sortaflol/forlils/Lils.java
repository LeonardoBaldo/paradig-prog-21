package br.com.sortaflol.forlils;

import javax.swing.JOptionPane;

public class Lils {
    boolean tchau; //true mensagem1 false mensagem2
    
    Lils(){
    
    }
    Lils(boolean tchau){
        
    }
    void escolha1(){
        this.tchau = true;
        JOptionPane.showMessageDialog(null,"Lils vc é incrivel.");
    }
    void escolha2(){
        this.tchau = false;
        JOptionPane.showMessageDialog(null,"Lils vc é incrivel.");
    }      
}
