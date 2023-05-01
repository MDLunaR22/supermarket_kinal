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

import com.supermarket.models.dao.CategoriaDaoImpl;
import com.supermarket.models.domain.Categoria;

import java.util.List;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.ServletException;

@WebServlet("/ServletCategoria")
public class ServletCategoria extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, IOException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("doPost");
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    insertarCategoria(request, response);
                    break;
                case "actualizar":
                    actualizarCategoria(request, response);
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaDeCategorias(request, response);
                    break;
                case "editar":
                    editarCategoria(request, response);
                    break;
                case "eliminar":
                    eliminarCategorias(request, response);
                    break;
            }
        }
    }

    private void listaDeCategorias(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Categoria> data = new CategoriaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("ListadoDeCategorias", data);
        response.sendRedirect("categorias/categorias.jsp");
    }

    private void insertarCategoria(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String categoria = request.getParameter("categoria");

        //Crear el objeto de tipo categoria (bean)
        Categoria insertarCategoria = new Categoria(categoria);
        System.out.println(insertarCategoria);

        int registrosInsertados = new CategoriaDaoImpl().add(insertarCategoria);

        listaDeCategorias(request, response);
    }

    private void eliminarCategorias(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
        Categoria categoria = new Categoria(idCategoria);
        int registrosEliminados = new CategoriaDaoImpl().delete(categoria);
        listaDeCategorias(request, response);
    }

    private void editarCategoria(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //Recuperar el ID del estudiante
        String idCategoria = (request.getParameter("idCategoria"));

        //Buscar toda la informacion del estudiante por medio de su id
        Categoria categoria = new CategoriaDaoImpl().get(new Categoria(idCategoria));
        HttpSession sesion = request.getSession();
        sesion.setAttribute("categoria", categoria);
        response.sendRedirect(request.getContextPath() + "/categorias/categorias.jsp");
    }
    
    private void actualizarCategoria(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String categoria = request.getParameter("categoria");
        
        Categoria updateCategoria = new Categoria(id, categoria);
        listaDeCategorias(request, response);
    }
    
}
