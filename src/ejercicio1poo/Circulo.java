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
public class Circulo {
    private double radio;
    
    public void setA(double radio){
        this.radio=radio;
    }
    public void area(){
        double area = 3.1516*Math.pow(radio,2);
        System.out.println(area);
    }
}
