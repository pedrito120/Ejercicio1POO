/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;
import banco.*;
/**
 *
 * @author pedro
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c = new Cuadrado();
        c.setLado(7.5f);
        c.area();
        c.perimetro();
        
        Triangulo t= new Triangulo();
        t.setAb(12,20);
        t.area();
        t.perimetro();
        
        Circulo c1 = new Circulo();
        c1.setA(12);
        c1.area();
        
    }
    
}
