package br.uricer.br.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    
    private boolean ocupada;
    private List<Item> itens = new ArrayList<Item>();
    private BigDecimal valorTotal;

    public void ocupar() {
        this.ocupada = true;
    }
    
    public void desocupar() {
        this.ocupada = false;
    }
    
    public void totalizar(){
        valorTotal = new BigDecimal("0.0");
        
        for(Item item:itens){
            item.totalizar();
            valorTotal = valorTotal.add(item.getValorTotal());
        }
        
    }
    
    public void adicionarItem(Produto produto, BigDecimal quantidade){
        Item novoItem = new Item();
        novoItem.setProduto(produto);
    }
    
    public boolean isOcupada() {
        return ocupada;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
