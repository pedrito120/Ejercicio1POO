/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author pedro
 */
public class Resultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libros l1= new Libros("El mundo animal", "Pedro");
       
       l1.prestar(1);
       l1.informacion();
       l1.devolver();
       l1.informacion();
    }
    
}
