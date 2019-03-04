/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mate;

/**
 *
 * @author pedro
 */
public class resultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematicas m1=new Matematicas();
        
        System.out.println("la suma es "+m1.getSuma(4, 5));
        System.out.println("la resta es "+m1.getResta(10, 5));
        System.out.println("la multiplicacion es "+m1.getMulti(4, 5));
        System.out.println("la divicion es "+m1.getDivicion(20, 5));
        
    }
    
}
