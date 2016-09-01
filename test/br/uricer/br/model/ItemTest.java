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
public class ItemTest {
    /*
    public ItemTest() {
    }
    */
    
    @Test
    public void deveTotalizarItem() {
        Produto produto = new Produto();
        Item item = new Item();
        item.setProduto(produto);
        item.setQuantidade(new BigDecimal("2.0"));
        item.setValorUnitario(new BigDecimal("2.50"));
        
        item.totalizar();
        
        assertEquals(new BigDecimal("5.00"), item.getValorTotal());
    }
    
    
}
