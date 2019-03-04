/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;

/**
 *
 * @author pedro
 */
public class MaquinaDeBoletos {
    private int cantidadDeBoletos;
    private float saldo;
    private float precio;
    
    public MaquinaDeBoletos(int cantidadDeBoletos,float saldo,float precio){
        this.cantidadDeBoletos=cantidadDeBoletos;
        
        this.saldo=saldo;
        this.precio=precio;
        
    }
    public int cantidadDeBoletos(){
        return cantidadDeBoletos;
    }
    
    public float obtenerSaldo(){
        return saldo;
    }
    public void comprarBoleto(int cantidad){
        if(cantidadDeBoletos>cantidad){
            float s = cantidad*this.precio;
            this.saldo +=s;
            this.cantidadDeBoletos=this.cantidadDeBoletos-cantidad;
        }else{
            System.out.println("no es valido");
        }
    }
    
}
