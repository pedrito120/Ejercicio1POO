/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author pedro
 */
public class Examen {
    private String nombre,autor,estado;
    public Examen(String nombre,String autor){
        this.nombre=nombre;
        this.autor=autor;
    }
    public void info(){
        System.out.println(nombre);
        System.out.println(autor);
        System.out.println(estado);
        
    }
    
    public String prestar(){
        estado="prestado";
        return estado;
    }
    public String devolver(){
      estado="disponible";
      return estado;
    }
}
