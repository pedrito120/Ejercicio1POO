/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Grupo {

    private float[] calificacion;
    private float promedio;
    private String nombre;
    private float acu = 0;

    public Grupo(int noAlumnos, String nombre) {
        calificacion = new float[noAlumnos];
        this.nombre=nombre;
    }

    public void ingresarCalificaciones() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("ingresa la calificacion : " + (i + 1));
            float calif = leer.nextFloat();
            calificacion[i] = calif;
            acu = acu + calif;
        }
        promedio = acu / calificacion.length;
    }

    public String getNombre(){
        return nombre;
    }
    public void mostrarCalificaciones() {
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("calificacion" + (i + 1) + ":" + calificacion[i]);
        }

    }

    public float getP() {
        return promedio;
    }

    public int aprobados() {
        int ap=0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] >= 8) {
                ap = ap + 1;
            }
        }
        return ap;
    }

    public int reprobados() {
        int rep=0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] < 8) {
                rep = rep + 1;
            }
        }
        return rep;
    }

    public int mayorAlPromedio() {
        int cant=0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] >= promedio) {
                cant++;
            }
        }
        return cant;
    }

    public float mayorCalificacion() {
        float calMayor=0;
        for (int i = 0; i < calificacion.length; i++) {
            if (calMayor <= calificacion[i] ) {
                    calMayor=calificacion[i];    
            }
        }

        return calMayor;
    }
    public float menorCalificacion(){
        float calMenor=10;
        for (int i = 0; i < calificacion.length; i++) {
            if (calMenor > calificacion[i] ) {
                    calMenor=calificacion[i];    
            }
        }

        return calMenor;
    }
    
    
    

}
