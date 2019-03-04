/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Boleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MaquinaDeBoletos m1= new MaquinaDeBoletos(200, 1000, 20);
        Scanner leer= new Scanner(System.in);
        System.out.println("cuantos boletos desea comprar");
        int cantidad = leer.nextInt();
        m1.comprarBoleto(cantidad);
        float cdb = m1.cantidadDeBoletos();
        System.out.println("boletos restantes son de :"+cdb);
        float s = m1.obtenerSaldo();
        System.out.println("el saldo es :"+s);
        
    }
    
}
