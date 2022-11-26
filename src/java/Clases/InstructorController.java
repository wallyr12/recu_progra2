/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Wally Ramirez
 */
public class InstructorController {
    
     private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    
      public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }    
    
    
       public String guardarInstructor2(Instructor instructor){        
        String sql = "INSERT INTO recu_2022.instructor(codigo, nombre, apellido, correo, telefono, direccion, observaciones, curso_codigo)";
             sql += " VALUES(?,?,?,?,?,?,?,?)";              
       try{     
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, instructor.getCodigo());
            statement.setString(2, instructor.getNombre());
            statement.setString(3, instructor.getApellido());
            statement.setString(4, instructor.getCorreo());
            statement.setString(5, instructor.getTelefono());
            statement.setString(6, instructor.getDireccion());
            statement.setString(7, instructor.getObservaciones());
            statement.setInt(8, instructor.getCurso_codigo());
            
                int resultado = statement.executeUpdate(); 
                if(resultado > 0){
                    return String.valueOf(resultado);
                }else{
                    return String.valueOf(resultado);
                }
        }catch(SQLException e){ 
            return e.getMessage();
        }
    }
    
      
    
       
       
       
    
    
    
    
}
