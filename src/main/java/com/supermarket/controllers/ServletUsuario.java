package com.supermarket.controllers;

/**
 *
 * @author jmuy9
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import com.supermarket.models.domain.Usuario;
import com.supermarket.models.dao.UsuarioDaoImpl;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarUsuarios(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;

            }

        }

    }

    private void listarUsuarios(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Usuario> data = new UsuarioDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeUsuarios", data);
        response.sendRedirect("usuarios/usuarios.jsp");
    }

}
