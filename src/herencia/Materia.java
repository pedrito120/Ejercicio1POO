/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author pedro
 */
public class Materia {

    private String nombre;
    private float parcial1, parcial2;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.parcial1 = 0;
        this.parcial2 = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public float getParcial1() {
        return parcial1;
    }

    public float getParcial2() {
        return parcial2;

    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float promedio() {
       
        return (parcial1 + parcial2) / 2;
    }
    public String reporteM(){
        return "Materia: "+nombre+"\t"+"parcial 1: "+parcial1+"\t"+"parcial 2: "+parcial2+"\t"+"\t"+"Promedio: "+ promedio();
    }
}
