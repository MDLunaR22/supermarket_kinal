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

import com.supermarket.models.domain.Empleado;
import com.supermarket.models.dao.EmpleadoDaoImpL;

import java.util.List;
import java.io.IOException;


@WebServlet("/ServletEmpleado")
public class ServletEmpleado extends HttpServlet{
   protected void doPost(HttpServletRequest request, HttpServletResponse response){
       
   }
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
       
   
      String accion = request.getParameter("accion");
      
      if(accion != null){
          switch (accion) {
              case "listar":
                  listadeEmpleados(request, response);
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
   
   
   
  private void listadeEmpleados(HttpServletRequest request, HttpServletResponse response) throws IOException  {
      
      List<Empleado> data = new EmpleadoDaoImpL().getAll();
      HttpSession sesion = request.getSession();
      sesion.setAttribute("ListadoDeEmpleados", data);
      response.sendRedirect("empleados/empleados.jsp");
  }
           
}