package com.supermarket.controllers;

/**
 *
 * @author USUARIO
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import com.supermarket.models.domain.Proveedor;
import com.supermarket.models.dao.ProveedorDaoImpl;

import java.util.List;
import java.io.IOException;


@WebServlet("/ServletProveedor")
public class ServletProveedor extends HttpServlet{
   protected void doPost(HttpServletRequest request, HttpServletResponse response){
       
   }
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
       
   
      String accion = request.getParameter("accion");
      
      if(accion != null){
          switch (accion) {
              case "listar":
                  listadeProveedores(request, response);
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
   
   
   
  private void listadeProveedores(HttpServletRequest request, HttpServletResponse response) throws IOException  {
      
      List<Proveedor> data = new ProveedorDaoImpl().getAll();
      HttpSession sesion = request.getSession();
      sesion.setAttribute("ListadoDeProvedores", data);
      response.sendRedirect("proveedores/proveedores.jsp");
  }
           
}