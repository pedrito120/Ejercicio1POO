/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author pedro
 */
public class obrero {
    private float horas,pagoPorHora;
    String nombre;
    
    public obrero (String nombre,float horas,float pagoPorHora){
        this.nombre=nombre;
        this.pagoPorHora=pagoPorHora;
        this.horas=horas;
    }
    
    
    public void informacion(){
        System.out.println("el nombre es :"+nombre);
        
    }
    
    public float pago(){
       float sueldo = 0;
        if (horas<=40) {
            sueldo=horas*pagoPorHora;
        }else if(horas>40){
            float p1=horas-40;
            float p2=p1*2;
            sueldo = p2+(40*pagoPorHora);
        }
        return sueldo;
}
    
}
