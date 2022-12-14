<%-- 
    Document   : RegInstructor
    Created on : 26/11/2022, 09:22:23 AM
    Author     : Wally Ramirez
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Instructor</title>
         
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        
        
        <script src="js/script.js"></script>
        
    </head>
    <body>
        
        
        
        <%
            //conectando a base de datos
            Connection conexion=null;
            String url="jdbc:mysql://localhost:3306/recu_2022";//url de MySQL
            String usuario="root";// usuario de mysql local
            String clave="1234"; 
           
            
             Class.forName("com.mysql.jdbc.Driver");
             conexion=DriverManager.getConnection( url, usuario,clave);
             
             //listado de la tabla
             
             PreparedStatement ps;
             ResultSet rs;
             ps=conexion.prepareStatement("select * from usuario");
             rs=ps.executeQuery();
             
             //creacion de tabla
             

            %>
        
        
     
  <div class="container-sm ">              
      <div class="shadow-lg p-3 bg-white rounded">
        <form method="POST" id="form" name="form" action="NewServlet1" >
             <div class="for m-group">                       
                        
                        <h2 class="display-8 text-center my-4"> REGISTRO DE INSTRUCTOR</h2>
                     
            
       
                            <div class="row">
                                <div class="col">
                                    <label for="codigo">C??digo Instructor</label>
                                    <input class="form-control" type="text" placeholder="Ingrese c??digo instructor" name="codigo" id="codigo">
                                    <input type="hidden" name="control" value="GUARDAR"> 
                                </div>
                               </div> 
                        
                        <br>
                            <div class="row">
                                <div class="col">
                                    <label for="nombre">Nombre del Instructor</label>
                                    <input class="form-control" type="text" placeholder="Ingrese nombre instructor" name="nombre" id="nombre">
                                </div>
                            </div>
        
                        <br>
                            <div class="row">
                                <div class="col">
                                    <label for="apellido">Apellido del Instructor</label>
                                    <input class="form-control" type="text" placeholder="Ingrese apellido" name="apellido" id="apellido">
                                </div>
                              </div>
                        
                         <br>
                         
                         
                           <div class="row">
                                <div class="col">
                                    <label for="correo">Correo del Instructor</label>
                                    <input class="form-control" type="email" placeholder="Ingrese correo" name="correo" id="correo">
                                </div>
                              </div>
                        
                         <br>
                         
                        
                         <div class="row">
                                <div class="col">
                                    <label for="telefono">Telefono del Instructor</label>
                                    <input class="form-control" type="text" placeholder="Ingrese telefono" name="telefono" id="telefono">
                                </div>
                              </div>
                        
                         <br>
                                          
                          
                         <div class="row">
                                <div class="col">
                                    <label for="direccion">Direccion</label>
                                    <input class="form-control" type="text" placeholder="Ingrese direcci??n" name="direccion" id="direccion">
                                 
                                </div>
                               </div> 
            
                           <br> 
                           
                           
                           
                           <div class="row">
                                <div class="col">
                                    <label for="observaciones">Observaciones</label>
                                    <input class="form-control" type="text" placeholder="Ingrese observaciones" name="observaciones" id="observaciones">
                                </div>
                              </div>
                        
                         <br>
                           
                         
                         
                          <div class="row">
                                <div class="col">
                                    <label for="codigo_curso">C??digo del Curso</label>
                                    <input class="form-control" type="text" placeholder="Ingrese c??digo del curso" name="codigo_curso" id="codigo_curso">
                                    <input type="hidden" name="control" value="GUARDAR"> 
                                </div>
                               </div> 
                        
                        <br>
                         
                           
            <button type="button" onclick="enviarFormularioOpcion2()" class="btn btn-success">Guardar</button>
             <button type="reset" class="btn btn-danger">Vaciar</button>
             <a class="btn btn-warning" href="home.jsp" style="float: right;">Atr??s</a>
             
             
        </div>
        </form>   
        </div>
        
    
    
        </div>
        
        
              <%
                        
                        while(rs.next()){

                    %>
             
                    
                    
                    <tr>
                    <td><%= rs.getString("usuario")%></td>
                     <td class="text-center"> 
                                                
                        
                           
                        </td>
                    
                    </tr>
                    
                     <% } %>
                    
    </body>
</html>