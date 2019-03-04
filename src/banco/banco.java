/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*    
       CuentaBancaria c1= new CuentaBancaria(00001, 0);
        Scanner leer = new Scanner(System.in);
        System.out.println("cantidad a depositar");
        float cantidad = leer.nextFloat();
        c1.depositar(cantidad);
        System.out.println("cantidad a retirar ");
        float r = leer.nextFloat();
        c1.retirar(r);
        System.out.println("cantidad a depositar");
        float cantida2=leer.nextFloat();
        c1.depositar(cantida2);
        float s=c1.getSaldo();
        System.out.println("el saldo total es de :"+s);
        String[] h=c1.getHistorial();
        for (int i = 0; i < 10; i++) {
            if (h[i]!=null) {
            System.out.println(h[i]);    
            }
            //preguntar que quiero realizar retiro,deposito,consuta de movimientos,consulta de saldo.
        }
         */
        Scanner leer = new Scanner(System.in);
        int opc;
        do {

            CuentaBancaria c2 = new CuentaBancaria(0002, 500);

            System.out.println("1.Deposito \n 2.-Retiro \n 3.-Cnsulta de saldo \n 4.-Consulta de movimientos \n 5.-salir");
            
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("cantidad a depositar");
                    float cantidad = leer.nextFloat();
                    c2.depositar(cantidad);
                    break;
                case 2:
                    System.out.println("cantidad a retirar");
                    float cantidadR = leer.nextFloat();
                    c2.retirar(cantidadR);
                    break;
                case 3:
                    float s = c2.getSaldo();
                    System.out.println("el saldo total es de :" + s);
                    break;
                case 4:
                    String[] h = c2.getHistorial();
                    for (int i = 0; i < 10; i++) {
                        if (h[i] != null) {
                            System.out.println(h[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("hasta pronto");
                    break;
            }

        } while (opc != 5);

    }

}
