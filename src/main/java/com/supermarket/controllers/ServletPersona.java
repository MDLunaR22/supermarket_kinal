package com.supermarket.controllers;

import java.util.List;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.supermarket.models.domain.Persona;
import com.supermarket.models.dao.PersonaDaoImpl;
/**
 *
 * @author Walter Gabriel Reyes Peralta
 * @date 6/09/2022
 * @time 21:33:48
 * 
 * IN5BV
 */

@WebServlet("/ServletPersona")

public class ServletPersona extends HttpServlet {
        
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    }
    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String accion = request.getParameter("accion");
        
        if (accion != null){
            switch (accion) {
                case "listar":
                    listarPersona(request, response);
                    break;
                case "editar":
                    //...
                    break;
                case "eliminar":
                    //
                    break;    
            }
        }
    }
    
    private void listarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Persona> data = new PersonaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("ListadoDePersonas", data);
        response.sendRedirect("personas/personas.jsp");
    }
}
