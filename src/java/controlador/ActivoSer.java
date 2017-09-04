/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
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
 * @author LabingXEON
 */
public class ActivoSer extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre=request.getParameter("activo");
        String s="";
        if(nombre.trim().length()>0){
            try {
                Servicios servicios=new Servicios();
                BD bd;
                bd = servicios.leer();
                if(bd==null){
                    bd=new BD();
                }
                dato.Activo activo=new dato.Activo(nombre);
                bd.addActivo(activo);
                boolean resultado=servicios.escribir(activo);
                if(resultado){
                    s="Exitoso";
                }else{
                    s="Problemas";
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ActivoSer.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/activo.jsp");
            request.setAttribute("palabra", s);
            rd.forward(request, response);

        }else{
            
        }
        
    }


}
