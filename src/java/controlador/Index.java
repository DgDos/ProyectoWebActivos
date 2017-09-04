/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.BD;
import servicios.Servicios;

/**
 *
 * @author Labing I5
 */
public class Index extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            RequestDispatcher rq=request.getRequestDispatcher("/index.jsp");
            ArrayList<dato.Activo> activos=null;
            Servicios servicio=new Servicios();
            BD bd= servicio.leer();
            if(bd != null){
                activos= bd.getActivos();
                System.out.println("aspdiojpsoij" + activos.size());
                request.setAttribute("activos", activos);
            }else{
                request.setAttribute("activos", null);
            }
            rq.forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        String cedula= request.getParameter("cedula");
        String activo = request.getParameter("activo");
        String cantidad = request.getParameter("cantidad");
        
        //Luego se incluiran validaciones
        System.out.println(cedula + " " + activo + " " + cantidad);
        
        
    }

   
}
