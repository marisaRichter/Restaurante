/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uricer.br.visao;

import br.uricer.br.model.Mesa;
import br.uricer.br.model.Produto;
import br.uricer.br.model.Restaurante;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando o Restaurante");
        Restaurante restaurante = new Restaurante();
        
        System.out.println("Listando Mesas Desocupadas: ");
        List<Mesa> mesasLivres = restaurante.listarMesasLivres();
        
        for(Mesa mesa:mesasLivres){
            System.out.println("Mesa: " + mesa.getNumero());
        }
        
        System.out.println("Selecionando a primeira mesa livre.");
        Mesa mesa = mesasLivres.get(0);
        mesa.ocupar();
        
        System.out.println("Iniciando um produto");
        Produto coca = new Produto();
        coca.setPreco(new BigDecimal("5.50"));
        coca.setDescricao("Coca-Cola");
        
        Produto paoDeQueijo = new Produto();
        paoDeQueijo.setPreco(new BigDecimal("2.00"));
        paoDeQueijo.setDescricao("Pão-de-queijo");
        
        System.out.println("Adicionando produto na mesa");        
        mesa.adicionarItem(coca, new BigDecimal("1.00"));
        mesa.adicionarItem(paoDeQueijo, new BigDecimal("2.00"));
        
        System.out.println("Totalizando mesa");
        
        mesa.totalizar();
        
        System.out.println("Valor total: R$" + mesa.getValorTotal());
        System.out.println("Desocupando Mesa.");
        mesa.desocupar();
        
    }
    
}
