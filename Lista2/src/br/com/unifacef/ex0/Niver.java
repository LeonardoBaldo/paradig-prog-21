package br.com.unifacef.ex0;
import java.util.ArrayList;
public class Niver {
    //variaveis encapsuladas
    private int dia;
    private String mes;
    
    //construtores
    public Niver(){
    
    }
    public Niver(int dia, String mes){
        this.dia = dia; this.mes = mes; 
    }
    //setters
    public void setDia(int dia){
        if ((dia >= 1) && (dia <=31)){
            this.dia = dia;
        }
        else {
            this.dia = 0;
            System.out.println("Dia inválido");
        }
    }
    public void setMes(String mes){
        ArrayList<String> vetor = new ArrayList();
        vetor.add("Janeiro");vetor.add("Fevereiro");
        vetor.add("Março");vetor.add("Abril");
        vetor.add("Maio");vetor.add("Junho");
        vetor.add("Julho");vetor.add("Agosto");
        vetor.add("Setembro");vetor.add("Outubro");
        vetor.add("Novembro");vetor.add("Dezembro");
        //verificar se mês está no vetor
        if(vetor.contains(mes)){
            this.mes = mes;
        }
        else {
            this.mes = "Inválido";
            System.out.println("Mês Inválido");
        }
    }
    //getters
    public int getDia(){
        return this.dia;
    }
    public String getMes(){
        return this.mes;
    }
}
