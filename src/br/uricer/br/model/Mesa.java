package br.uricer.br.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    
    private int numero;
    private boolean ocupada;
    private List<Item> Itens = new ArrayList<Item>();
    private BigDecimal valorTotal;
    
    public Mesa(int numero){
        this.numero = numero;
    }

    public void ocupar() {
        this.ocupada = true;
    }
    
    public void desocupar() {
        this.ocupada = false;
    }
    
    public void totalizar(){
        valorTotal = new BigDecimal("0.0");
        
        for(Item item:Itens){
            item.totalizar();
            valorTotal = valorTotal.add(item.getValorTotal());
        }
        
    }
    
    public void adicionarItem(Produto produto, BigDecimal quantidade){
        Item novoItem = new Item();
        novoItem.setProduto(produto);
        novoItem.setQuantidade(quantidade);
        novoItem.setValorUnitario(produto.getPreco());
        Itens.add(novoItem);
    }
    
    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public List<Item> getItens() {
        return Itens;
    }

    public void setItens(List<Item> itens) {
        this.Itens = itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
