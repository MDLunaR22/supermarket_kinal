

package com.supermarket.controllers;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 */



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.supermarket.models.domain.Cliente;
import com.supermarket.models.dao.ClienteDaoImpl;

import java.util.List;
import java.io.IOException;


@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet{
   protected void doPost(HttpServletRequest request, HttpServletResponse response){
       
   }
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
       
   
      String accion = request.getParameter("accion");
      
      if(accion != null){
          switch (accion) {
              case "listar":
                  listadeClientes(request, response);
                  break;
              case "editar":
                 //Acciones
                  break;
              case "eliminar":
                  //Acciones
               break;
          }
      }
   }
   
   
   
  private void listadeClientes(HttpServletRequest request, HttpServletResponse response) throws IOException  {
      
      List<Cliente> data = new ClienteDaoImpl().getAll();
      HttpSession sesion = request.getSession();
      sesion.setAttribute("ListadoDeClientes", data);
      response.sendRedirect("clientes/clientes.jsp");
  }
           
}