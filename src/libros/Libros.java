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
public class Libros {

    private String nombre;
    private String autor;
    private String status;
    private int existencia=1;

    public  Libros(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;

    }
    public void informacion(){
        System.out.println("nombre del autor :"+autor);
        System.out.println("nombre del libro :"+nombre);
        System.out.println("esta pretado:"+status);
        return;
    }
    public void prestar(int e) {
        
        if(this.existencia==e){
          status="si";
          existencia=existencia-e;
          System.out.println("prestado");  
        }else{
            
            System.out.println("Ya esta prestado");
        }
        
       
    }
    public void devolver() {
        existencia=existencia+1;
        status="no";
       System.out.println("gracias por la devolucion");
       return;
    }
    
}
