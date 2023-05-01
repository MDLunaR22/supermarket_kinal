package com.supermarket.controllers;

/**
 *
 * @author Werner Obdulio Emmanuel Tuj Chacom
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import com.supermarket.models.domain.VentaArticulo;
import com.supermarket.models.dao.VentaArticuloDaoImpl;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletVentaArticulo")
public class ServletVentaArticulo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("doPost");
        String accion = request.getParameter("accion");
        
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    //Llamaremos a un método para insertar
                    System.out.println("Insertando...");
                    insertarVentaArticulo(request, response);
                    break;
                case "actualizar":
                    // ...
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("doGet");
        request.setCharacterEncoding("UTF-8");

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaDeVentaArticulos(request, response);
                    break;
                case "editar":
                    //Acciones
                    break;
                case "eliminar":
                    eliminarVentaArticulo(request, response);
                    break;
            }
        }
    }

    private void listaDeVentaArticulos(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<VentaArticulo> data = new VentaArticuloDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("ListadoDeVentaArticulos", data);
        response.sendRedirect(request.getContextPath() + "/" + "venta-articulos/venta-articulos.jsp");
    }
    
    private void insertarVentaArticulo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        double total = Double.parseDouble(request.getParameter("total"));
        int articuloId = Integer.parseInt(request.getParameter("articuloId"));
        
        // Crear el objeto de tipo ventaArticulo (bean)
        VentaArticulo ventaArticulo = new VentaArticulo(precio, cantidad, total, articuloId);
        System.out.println(ventaArticulo);
        
        //Insertar el nuevo objeto de tipo ventaArticulo en la base de datos
        int registrosInsertados = new VentaArticuloDaoImpl().add(ventaArticulo);
        
        listaDeVentaArticulos(request, response);
    }

    private void eliminarVentaArticulo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idVentaArticulo = Integer.parseInt(request.getParameter("idVentaArticulo"));
        VentaArticulo ventaArticulo = new VentaArticulo(idVentaArticulo);
        int registrosEliminados = new VentaArticuloDaoImpl().delete(ventaArticulo);
        listaDeVentaArticulos(request, response);
    }

}
