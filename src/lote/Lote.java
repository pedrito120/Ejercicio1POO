/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote;

/**
 *
 * @author pedro
 */
public class Lote {
    
    private String nombre;
    private int oferta;
    
    public void Lote(int oferta){
        this.oferta=oferta;
    }
    public String getNombre(String nombre){
        return nombre;
    }
    public int getOferta(int oferta){
        return oferta;
    }
    
    
}
