package com.supermarket.controllers;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 6/09/2022
 * @time 09:32:34
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import com.supermarket.models.domain.Factura;
import com.supermarket.models.dao.FacturaDaoImpl;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletFactura")
public class ServletFactura extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch(accion){
                case "listar":
                    //Acciones
                    listarFactura(request, response);
                    
                    break;
                case "editar":
                    //Edición
                    
                    break;
                case "eliminar":
                    //Eliminar
                    
                    break;
            }
        }
    }
    
    private void listarFactura(HttpServletRequest reque, HttpServletResponse respon) throws IOException{
        List<Factura> data = new FacturaDaoImpl().getAll();
        HttpSession sesion = reque.getSession();
        sesion.setAttribute("ListadoDeFacturas", data);
        respon.sendRedirect("facturas/facturas.jsp");
    }
}
