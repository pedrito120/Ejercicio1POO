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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno a1= new Alumno(8, 9, "nombre");
        System.out.println(a1.informacion());
        System.out.println(a1.estado());
        
    }
    
}
