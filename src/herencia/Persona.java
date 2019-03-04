/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import java.util.Date;
/**
 *
 * @author pedro
 */
public class Persona {
    protected String nombre,paterno,materno,sexo;
    protected Date fechaNacimiento;

    public Persona(String nombre, String paterno, String materno, String sexo, Date fechaNacimiento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String nombreCompleto(){
        return nombre+" "+paterno+" "+materno;
    }
    
    public int edad (){
        Date fechaActual=new Date();
        long tiempo=fechaActual.getTime()-fechaNacimiento.getTime();
        return (int)(tiempo/1000/60/60/24/365);
    }
}
