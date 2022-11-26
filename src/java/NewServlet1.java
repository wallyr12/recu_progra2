/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */



import Clases.ConexionBaseDeDatos;
import Clases.Instructor;
import Clases.InstructorController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
@WebServlet(urlPatterns = {"/NewServlet1"})
public class NewServlet1 extends HttpServlet {

    
     Instructor instructor;
     InstructorController registroInstructor;  
     StringBuffer objetoRespuesta = new StringBuffer();
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter respuesta = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            
              
            registroInstructor=new InstructorController();
           String control = request.getParameter("control");
           
           if(control.toUpperCase().equals("GUARDAR")){
               
               instructor=new Instructor(
                Integer.parseInt(request.getParameter("codigo")),
                request.getParameter("nombre"),
                 request.getParameter("apellido"),
                request.getParameter("correo"),  
                       request.getParameter("telefono"), 
                       request.getParameter("direccion"), 
                       request.getParameter("observaciones"), 
             Integer.parseInt(request.getParameter("codigo_curso")) );     
                              
                registroInstructor.guardarInstructor2(instructor);//almacenarlo en BD                 
           }
              
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
