/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBaseDeDatos {
     private String url="jdbc:mysql://127.0.0.1:3306/recu_2022";//url de MySQL
    private String usuario="root";// usuario de mysql local
    private String clave="1234"; 
    private Connection conexion=null;  
    
    public Connection conectar(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection( url, usuario,clave);
        }  catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {   
           ex.printStackTrace();
        }         
        return conexion;        
    }
    
}
