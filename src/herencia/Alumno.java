/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.*;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class Alumno extends Persona {

    private String  carrera, grupo;
    private int m,matricula;
    private Materia[] materias;

    public Alumno(String nombre, String paterno, String materno, String sexo, Date fechaNacimiento, int matricula, String carrera, String grupo) {
        super(nombre, paterno, materno, sexo, fechaNacimiento);
        this.matricula = matricula;
        this.carrera = carrera;
        this.grupo = grupo;
        materias = new Materia[5];
        m = 0;
    }
    public int getMatricula(){
        return matricula;
    }
    public String informacion() {
        return "Nombre: "+nombreCompleto() + "\n" +"Sexo: "+ sexo + "\n" +"Edad: "+ edad() + "\n" +"Matricula: "+ matricula + "\n" +"Carrera: "+ carrera + "\n" +"Grupo: "+ grupo + "\n";
    }
    

    public void agregarMateria(String materia) {
        Materia m1 = new Materia(materia);
        materias[m] = m1;
        m++;
    }
public String listaMaterias() {
        String acu = "";
        for (int i = 0; i < m; i++) {
            acu = acu +"Materia: "+ materias[i].getNombre() + " \t "+" \t "+ "Parcial 1: "+materias[i].getParcial1()+"\t"+ "Parcial 2: "+materias[i].getParcial2()+"\t" +"Promedio: "+materias[i].promedio()+"\n";
        }
        
        return acu;
    }
    
    public Materia obtenerMateria(String nombre){
        for (int i = 0; i < 10; i++) {
            if (nombre.equals(materias[i].getNombre())) {
                return materias[i];
            }
        }return null;
    }
     public float promedioAlumno(){
         float acu=0;
         for (int i = 0; i < m; i++) {
             acu= acu + materias[i].promedio();
         }
         return acu/m;
     }
     
  
}
