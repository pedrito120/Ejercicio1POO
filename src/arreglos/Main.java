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
public class Main {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Grupo g1= new Grupo(5);
        g1.ingresarCalificaciones();
        int aprobados=g1.aprobados();
        int reprobados=g1.reprobados();
        float promedio=g1.getP();
        int mM=g1.mayorAlPromedio();
        float mMayor=g1.mayorCalificacion();
        float mMenor=g1.menorCalificacion();
        System.out.println("-------------------");
        g1.mostrarCalificaciones();
        System.out.println("-------------------");
        System.out.println(aprobados+" aprobados");
        System.out.println(reprobados+" reprobados");
        System.out.println(promedio+" es el promedio grupal");
        System.out.println(mM+" son los que tuvieron mayor o igual al promedio del grupo");
        System.out.println(mMenor+" es el promedio menor");
        System.out.println(mMayor+" es el promedio mayor");
        */
        Scanner leer = new Scanner(System.in);
        int opcion = 10;
        Carrera tics= new Carrera("tics");
        while (opcion != 0) {
            System.out.println("ingresa una opcion");
            System.out.println("1 para crear un grupo");
            System.out.println("2 para ingresar calificaciones");
            System.out.println("3 ver promedio del grupo");
            System.out.println("4 promedio de la carrera");
            System.out.println("5 ver calificaciones reprobatorias");
            System.out.println("6 ver calificaciones aprobatorias");
            System.out.println("7 Ver quien tiene mayor promedio de la carrera");
            System.out.println("0 para salir");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese no de Alumnos y nombre del Grupo: ");
                int noAlumnos = leer.nextInt();
                String nombreGrupo = leer.next();
                tics.crearNuevoGrupo(noAlumnos, nombreGrupo);
            } else if (opcion == 2) {
                System.out.println("ingresa el nombre del grupo: ");
                String nombreGrupo = leer.next();
                tics.ingresarCalificacionesGrupo(nombreGrupo);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del grupo: ");
                String nombreGrupo = leer.next();
                System.out.println(tics.promedioGrupo(nombreGrupo));
            } else if (opcion == 4) {
                tics.promedioCarrera();
            }else if (opcion==5) {
                System.out.println("Ingrese el nombre del grupo: ");
                String nombreGrupo = leer.next();
                System.out.println(tics.mayorCalificacion(nombreGrupo));
            }else if (opcion==6) {
                System.out.println("Ingrese el nombre del grupo: ");
                String nombreGrupo = leer.next();
                System.out.println(tics.menorCalificacion(nombreGrupo));
            }else if (opcion==7) {
                System.out.println( tics.calificacionMayorEnLaCarrera());
            }

        }

    }
    }
    

