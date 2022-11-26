/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Wally Ramirez
 */
public class Instructor {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;
    private String observaciones;
    
    
    private int curso_codigo;
    
    
     public Instructor (int codigo, String nombre, String apellido, String correo, String telefono, String direccion, String observaciones, int curso_codigo){
         
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        this.direccion=direccion;
        this.observaciones=observaciones;
        
        this.curso_codigo=curso_codigo;
     
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCurso_codigo() {
        return curso_codigo;
    }

    public void setCurso_codigo(int curso_codigo) {
        this.curso_codigo = curso_codigo;
    }
    
    
    
    
}
