/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;

/**
 *
 * @author pedro
 */
public class Grupo {

    private Alumno[] alumnos;
    private String nombre;
    private int a;

    public Grupo(int noAlumnos, String nombre) {
        alumnos = new Alumno[noAlumnos];
        this.nombre = nombre;
        a = 2;

        alumnos[0] = new Alumno("pedro", "de jesus", "cortez", "hombre", new Date("1999/02/28"), 123, "tics",nombre);
        alumnos[1] = new Alumno("christian", "galicia", "garcia", "hombre", new Date("1999/02/4"), 124, "tics",nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumnos(String nombre, String paterno, String materno, String sexo, Date fechaNacimiento, int matricula, String carrera, String grupo) {
        Alumno alu = new Alumno(nombre, paterno, materno, sexo, fechaNacimiento, matricula, carrera, grupo);
        alumnos[a] = alu;
        a++;
    }

    public void agregarMaterias(String nombreMateria, int matricula) {
        for (int i = 0; i < a; i++) {
            if (alumnos[i].getMatricula() == matricula) {
                alumnos[i].agregarMateria(nombreMateria);
            }
        }

    }

    public void agregarcalificacionParcial1(int matricula, String materia, float calificacion) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                alumnos[i].obtenerMateria(materia).setParcial1(calificacion);
            }
        }
    }

    public void agregarcalificacionParcial2(int matricula, String materia, float calificacion) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                alumnos[i].obtenerMateria(materia).setParcial2(calificacion);
            }
        }
    }

    public Materia obtenerMateriaAlumno(int matricula, String materia) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                return alumnos[i].obtenerMateria(materia);
            }
        }
        return null;
    }

    public void generarMaterias(String materia1, String materia2, String materia3, String materia4, String materia5) {
        for (int i = 0; i < a; i++) {
            alumnos[i].agregarMateria(materia1);
            alumnos[i].agregarMateria(materia2);
            alumnos[i].agregarMateria(materia3);
            alumnos[i].agregarMateria(materia4);
            alumnos[i].agregarMateria(materia5);
        }
    }

    public float promedioGrupo() {
        float acu = 0;
        for (int i = 0; i < a; i++) {
            acu = acu + alumnos[i].promedioAlumno();
        }

        return acu / a;
    }

    public String listaAlumnosAprobados() {
        String acu = "";
        for (int i = 0; i < a; i++) {
            if (alumnos[i].promedioAlumno()>= 8) {
            acu = acu +(i+1)+".-"+ alumnos[i].nombreCompleto()+"\t"+"Con promedio de: "+alumnos[i].promedioAlumno()+ "\n";                
            }
                    }
        return acu;
    }
    public String listaAlumnosReprobados() {
        String acu = "";
        for (int i = 0; i < a; i++) {
            if (alumnos[i].promedioAlumno()< 8) {
            acu = acu +(i+1)+".-"+ alumnos[i].nombreCompleto()+"\t"+"Con promedio de: "+alumnos[i].promedioAlumno()+ "\n";                
            }
                    }
        return acu;
    }
    public String listaAlumnos() {
        String acu = "";
        for (int i = 0; i < a; i++) {
            acu = acu +(i+1)+".-"+ alumnos[i].nombreCompleto() + "\n";
        }
        return acu;
    }

    public int acumulador(){
    return a;
    }

    public Alumno obtenerAlumno(int matricula) {
        for (int i = 0; i < a; i++) {
            if (matricula == alumnos[i].getMatricula()) {
                return alumnos[i];
            }
        }
        return null;
    }

}
