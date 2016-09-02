/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uricer.br.model;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno 
 */
public class MesaTest {
    
    public MesaTest() {
    }
    
    @Test
    public void deveIniciarComoDesocupada(){
        Mesa mesa = new Mesa(1);
        assertEquals(false, mesa.isOcupada());
    }
    
    @Test
    public void deveRetornarOcupadaDepoisDeOcupar(){
        Mesa mesa = new Mesa(1);
        mesa.ocupar();
        
        assertEquals(true, mesa.isOcupada());
    }
    
    @Test
    public void deveRetornarDesocupadoDespoisDeDesocupar(){
        Mesa mesa = new Mesa(1);
        mesa.desocupar();
        
        assertEquals(false, mesa.isOcupada());
    }
    
    @Test
    public void adicionaItem(){
        Produto produto = new Produto();
        produto.setPreco(new BigDecimal("1.50"));
        produto.setDescricao("Coca-Cola");
        BigDecimal quantidade = new BigDecimal("2.0");
        Mesa mesa = new Mesa(1);
        mesa.ocupar();
        mesa.adicionarItem(produto, quantidade);
        
        assertEquals(1, mesa.getItens().size());
    }
    
    @Test
    public void deveTotalizar(){
        Produto coca = new Produto();
        coca.setPreco(new BigDecimal("5.50"));
        coca.setDescricao("Coca-Cola");
        
        Produto paoDeQueijo = new Produto();
        paoDeQueijo.setPreco(new BigDecimal("2.00"));
        paoDeQueijo.setDescricao("Pão-de-queijo");
        
        Mesa mesa = new Mesa(1);
        mesa.ocupar();
        mesa.adicionarItem(coca, new BigDecimal("1.00"));
        mesa.adicionarItem(paoDeQueijo, new BigDecimal("2.00"));
        
        mesa.totalizar();
        
        assertEquals(new BigDecimal("9.50"), mesa.getValorTotal());
    }
    
    
    
}
