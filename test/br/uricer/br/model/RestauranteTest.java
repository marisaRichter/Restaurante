/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uricer.br.model;

import java.util.List;
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
public class RestauranteTest {
    
    @Test
    public void deveListarMesasLivres(){
        Restaurante restaurante = new Restaurante();
        assertEquals(6, restaurante.listarMesasLivres().size());
    }
    
    @Test
    public void deveOcuparMesa(){
        Restaurante restaurante = new Restaurante();
        List<Mesa> mesasLivres = restaurante.listarMesasLivres();
        Mesa mesaLivre = mesasLivres.get(0);
        
        restaurante.ocuparMesa(mesaLivre);
        
        assertEquals(5, restaurante.listarMesasLivres().size());
        
    }
}
