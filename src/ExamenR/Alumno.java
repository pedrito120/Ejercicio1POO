/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenR;

/**
 *
 * @author pedro
 */
public class Alumno {
    private float calificacion1,calificacion2,promedio;
    private String nombre;

    public Alumno(float calificacion1, float calificacion2, String nombre) {
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.nombre = nombre;
    }
    public String informacion(){
        this.promedio=(calificacion1+calificacion2)/2;
        return "el nombre del alumno es "+nombre+"con promedio de "+promedio;
    }
    
    public String estado(){
        
        if (promedio>=8) {
            return "aprobado";
        }else{
            return "reprobado";
        }
    }
}
