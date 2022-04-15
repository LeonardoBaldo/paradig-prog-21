package br.com.unifacef.lista3.exe3;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
    private int codigo;
    private Date data;
    private float valor;
    private String cep;
    // objeto-parte
    private ArrayList<ItemCarrinho>itens;

    public Carrinho() {
        // aloca espaço na memória para o ArrayList
        this.itens = new ArrayList();
    }

    public Carrinho(int codigo, Date data, float valor, String cep, ArrayList<ItemCarrinho> itens) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.cep = cep;
        this.itens = itens;
    }
    

    public Carrinho(int codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
        this.valor = 0;
        this.itens = new ArrayList();
    }

    

    public Carrinho(int codigo, Date data, float valor, String cep) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.cep = cep;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemCarrinho> itens) {
        this.itens = itens;
    }
    
    // adiciona 1 ItemCarrinho em itens
    public void addItemCarrinho(ItemCarrinho item)
    {
        this.itens.add(item);
        this.valor = this.valor + (item.getValor() * item.getQtde());
        System.out.println("Item adicionado");
    }
    
    // remove 1 ItemCarrinho em itens
    public void removeItemCarrinho(ItemCarrinho item)
    {
       if (this.itens.remove(item))
       {
           this.valor = this.valor - (item.getValor() * item.getQtde());
           System.out.println("item removido");
       }
       else
       {
           System.out.println("Item não existe");
       }
    }

    @Override
    public String toString() {
        return "Carrinho{" + "codigo=" + codigo + ", data=" + data + ", valor=" + valor + ", cep=" + cep + ", itens=" + itens + '}';
    }
    
}
