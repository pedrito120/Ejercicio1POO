/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

/**
 *
 * @author pedro
 */
public class Triangulo {
    private float base,altura;
    public void setAb(float base,float altura){
        this.base=base;
        this.altura=altura;
        
    }
    public void area(){
        float area=(base*altura)/2;
        System.out.println("el area es: "+area);
    }
    public void perimetro(){
        float per=base*3 ;
        System.out.println("el perimetro del triangulo es: "+per);
    }
}
