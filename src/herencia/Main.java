/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * matricula carrera grupo informacion del alumno
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 10;
        Carrera tics = new Carrera("TICS");
        while (opcion != 0) {
            String n = tics.getNombreCarrera();
            System.err.println("**************__" + n + "__**************");
            System.out.println("****************************************");
            System.out.println("*      Ingresa una opcion            **");
            System.out.println("*  1 Crear un grupo                  **");
            System.out.println("*  2 Obtener promedio de la carrera  **");
            System.out.println("*  3 Consultar Grupo                 **");
            System.out.println("*  4 Reporte de carrera              **");
            System.out.println("*  0 salir                           **");
            System.out.println("***************************************");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("Ingresa No de alumnos y Nombre del grupo");
                int noAlumnos = leer.nextInt();
                String nombreGrupo = leer.next();
                tics.crearNuevoGrupo(noAlumnos, nombreGrupo);
            } else if (opcion == 2) {
                float p = tics.promedioCarrera();
                System.out.println("El promedio de la carrera es de :" + p);
            } else if (opcion == 3) {
                System.out.println("ingresa el nombre del grupo");
                String nombreGrupo = leer.next();
                Grupo g = tics.obtenerGrupo(nombreGrupo);
                if (g == null) {
                    System.out.println("No exite el grupo");
                } else {
                    int opcion2 = 10;
                    while (opcion2 != 0) {
                        System.err.println("************" + g.getNombre() + "***********");
                        System.out.println("*****************************************");
                        System.out.println("**          Ingresa una opcion         **");
                        System.out.println("**   1 Para agregar alumno             **");
                        System.out.println("**   2 Para promedio del grupo         **");
                        System.out.println("**   3 Para agregar materia al grupo   **");
                        System.out.println("**   4 Consultar alumno                **");
                        System.out.println("**   5 Lista de alumnos                **");
                        System.out.println("**   6 Lista de alumnos aprobados      **");
                        System.out.println("**   7 Lista de alumnos reprobados     **");
                        System.out.println("**   0 Salir                           **");
                        System.out.println("*****************************************");
                        opcion2 = leer.nextInt();
                        if (opcion2 == 1) {
                            System.out.println("ingresa nombre");
                            String nombre = leer.next();
                            System.out.println("ingresa apellido paterno");
                            String paterno = leer.next();
                            System.out.println("ingresa apellido materno");
                            String materno = leer.next();
                            System.out.println("ingresa sexo");
                            String sexo = leer.next();
                            System.out.println("ingresa matricula");
                            int matricula = leer.nextInt();
                            System.out.println("ingresa fecha de nacimiento");
                            String fecha = leer.next();
                            Date fechaNacimiento = new Date(fecha);

                            g.agregarAlumnos(nombre, paterno, materno, sexo,
                                    fechaNacimiento, matricula, tics.getNombreCarrera(), nombreGrupo);

                        } else if (opcion2 == 2) {
                            System.out.println("El promedio del grupo es de :" + g.promedioGrupo());
                        } else if (opcion2 == 3) {
                            System.out.println("Agrega los nombres de las materias");
                            String m1 = leer.next();
                            String m2 = leer.next();
                            String m3 = leer.next();
                            String m4 = leer.next();
                            String m5 = leer.next();

                            g.generarMaterias(m1, m2, m3, m4, m5);
                        } else if (opcion2 == 4) {
                            System.out.println("ingresa la matricula del alumno");
                            int ma = leer.nextInt();
                            Alumno a = g.obtenerAlumno(ma);
                            if (a == null) {
                                System.out.println("No exite el alumno");

                            } else {
                                int opcion3 = 10;
                                while (opcion3 != 0) {
                                    System.err.println("**********" + a.nombreCompleto() + "**********");
                                    System.out.println("**********************************************");
                                    System.out.println("**          Ingresa una opcion              **");
                                    System.out.println("**   1 Mostrar la informacion del alumno    **");
                                    System.out.println("**   2 Mostrar el promedio del alumno       **");
                                    System.out.println("**   3 Consultar materia                    **");
                                    System.out.println("**   4 Reporte de materias                  **");
                                    System.out.println("**   0 Salir                                **");
                                    System.out.println("**********************************************");
                                    opcion3 = leer.nextInt();
                                    if (opcion3 == 1) {
                                        System.out.println(a.informacion());
                                    } else if (opcion3 == 2) {
                                        float promedioA = a.promedioAlumno();
                                        if (promedioA == 0.0) {
                                            System.out.println("el alumno no tiene promedio");
                                        } else {
                                            System.out.println("El promedio del alumno es de : " + a.promedioAlumno());
                                        }
                                    } else if (opcion3 == 3) {
                                        System.out.println("ingresa el nombre de la materia");
                                        String obtenerM = leer.next();
                                        Materia m1 = a.obtenerMateria(obtenerM);
                                        if (m1 == null) {
                                            System.out.println("no existe la materia");
                                        } else {
                                            int opcion4 = 10;
                                            while (opcion4 != 0) {
                                                System.err.println("**********" + m1.getNombre() + "***********");
                                                System.out.println("******************************************");
                                                System.out.println("**          Ingresa una opcion          **");
                                                System.out.println("**   1 Modificar parcial 1              **");
                                                System.out.println("**   2 Modificar parcial 2              **");
                                                System.out.println("**   3 Consultar el promedio            **");
                                                System.out.println("**   4 Reporte                          **");
                                                System.out.println("**   0 Salir                            **");
                                                System.out.println("*****************************************");
                                                opcion4 = leer.nextInt();
                                                if (opcion4 == 1) {
                                                    System.out.println("agrega la calificacion del parcial 1");
                                                    float par1 = leer.nextFloat();
                                                    m1.setParcial1(par1);
                                                } else if (opcion4 == 2) {
                                                    System.out.println("agrega la calificacion del parcial 2");
                                                    float par2 = leer.nextFloat();
                                                    m1.setParcial2(par2);
                                                } else if (opcion4 == 3) {
                                                    System.out.println("el promedio de la materia es :" + m1.promedio());
                                                } else if (opcion4 == 4) {
                                                    System.out.println(m1.reporteM());
                                                }
                                            }
                                        }
                                    } else if (opcion3 == 4) {
                                        System.out.println(a.listaMaterias());
                                    }
                                }
                            }
                        } else if (opcion2 == 5) {
                            System.out.println(g.listaAlumnos());
                        } else if (opcion2 == 6) {
                            String ap = g.listaAlumnosAprobados();
                            if (ap == "") {
                                System.out.println("No hay alumnos");
                            } else {
                                System.out.println(g.listaAlumnosAprobados());
                            }
                        } else if (opcion2 == 7) {
                            String ar=g.listaAlumnosReprobados();
                            if (ar == "") {
                                System.out.println("No hay alumnos");
                            } else {
                                System.out.println(g.listaAlumnosReprobados());
                            }
                        }

                    }
                }
            } else if (opcion == 4) {
                String l = tics.listaGrupos();
                System.out.println(l);
            }
        }

    }
}
