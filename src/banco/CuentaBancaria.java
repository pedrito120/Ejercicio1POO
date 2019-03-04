/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author pedro
 */
public class CuentaBancaria {
    private int numeroDeCuenta;
    private float saldo;
    private String[] historial;
    private int noMovimiento;
    
    public CuentaBancaria(int numeroDeCuenta,float saldo){
        this.numeroDeCuenta=numeroDeCuenta;
        this.saldo=saldo;
        this.historial=new String[10];
        this.noMovimiento =0;
    }
    ///metodos 3
    public void depositar(float cantidad){
        this.saldo = this.saldo+cantidad;
        this.historial[noMovimiento] ="deposito de "+cantidad;
        noMovimiento=noMovimiento+1;
    } 
            
    public float retirar(float cantidad){
        if (this.saldo>=cantidad) {
            this.saldo=this.saldo-cantidad;
             this.historial[noMovimiento] ="Retiro de "+cantidad;
             noMovimiento=noMovimiento+1;
        }else{
            System.out.println("no tiene la cantidad necesaria");
        }
        return saldo;
    }
    
    
    public float getSaldo(){
        return saldo;
    }
    
    public String[] getHistorial(){
      return historial;  
    }
    
    
}


