/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;



/**
 *
 * @author pedro
 */
public class Carrera {
   private String nombre;
    private int noDeGruposActivos;
    private Grupo[] grupos;
    

    public Carrera(String nombre) {
        grupos = new Grupo[10];
        this.nombre = nombre;
        noDeGruposActivos = 0;
    }

    public void crearNuevoGrupo(int noAlumnos, String nombre) {
        Grupo nuevo = new Grupo(noAlumnos, nombre);
        grupos[noDeGruposActivos] = nuevo;
        noDeGruposActivos++;
    }

    public void ingresarCalificacionesGrupo(String nombre) {
        for (int i = 0; i < noDeGruposActivos; i++) {
            if (nombre.equals(grupos[i].getNombre())) {
                grupos[i].ingresarCalificaciones();

            }

        }
    }
public int mayorCalificacion(String nombre) {
        for (int i = 0; i < noDeGruposActivos; i++) {
            if (nombre.equals(grupos[i].getNombre())) {
                return grupos[i].aprobados();
            }
        }
        return 0;
    }
public int menorCalificacion(String nombre) {
        for (int i = 0; i < noDeGruposActivos; i++) {
            if (nombre.equals(grupos[i].getNombre())) {
                return grupos[i].reprobados();
            }
        }
        return 0;
    }
    public float promedioGrupo(String nombre) {
        for (int i = 0; i < noDeGruposActivos; i++) {
            if (nombre.equals(grupos[i].getNombre())) {
                return grupos[i].getP();
            }
        }
        return 0;
    }
    public float promedioCarrera(){
        float acu=0;
        for (int i = 0; i < 10; i++) {
            acu=acu+grupos[i].getP();
                    
        }
        return acu/noDeGruposActivos;
    }
    
    public String  calificacionMayorEnLaCarrera(){
        float calM=0;
        String n="";
        for (int i = 0; i < noDeGruposActivos; i++) {
            if (calM<=grupos[i].mayorCalificacion()) {
                calM=grupos[i].mayorCalificacion();
                n=grupos[i].getNombre();
            }
                               
        }
        return "el grupo es:"+n+" con cali:"+calM;
    }
    
    public void imprimirCalificaciones(String nombre) {
        for (int i = 0; i < noDeGruposActivos; i++) {
            if (nombre.equals(grupos[i].getNombre())) {
                grupos[i].mostrarCalificaciones();
            }
        }

    }
}
