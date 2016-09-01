/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uricer.br.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Restaurante {
    
    private List<Mesa> mesas = new ArrayList<Mesa>();

    public List<Mesa> listarMesasLivres(){
        return mesas;
    }
    
    public void ocuparMesa(Mesa mesa){
        
    }
    
    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
    
    
}
