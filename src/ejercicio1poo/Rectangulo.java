/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

/**
 *
 * @author Angelmarcat
 */
public class Rectangulo {
   private float base, altura;
    
   //Construtor debe de (llamarse igual que la clase + (se ingresa el tipo de dato + la variable)
   public Rectangulo(float base, float altura){
   this.base=base;
   this.altura=altura;
   }
   
    public void setValores(float base, float altura){
        this.base=base;
        this.altura=altura;
        
    }
    public void area(){
        System.out.println("Esta es el area del cuadrado: "+this.base*this.altura+" cm^2");
    }
    public void perimetro(){
        System.out.println("Esta es el perimetro del cuadrado: "+((this.base*2)+(this.altura*2))+" cm");
    } 
}
