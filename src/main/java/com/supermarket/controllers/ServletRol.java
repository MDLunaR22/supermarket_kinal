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

import com.supermarket.models.domain.Rol;
import com.supermarket.models.dao.RolDaoImpl;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletRol")
public class ServletRol extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarRoles(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;

            }

        }

    }

    private void listarRoles(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Rol> data = new RolDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeRoles", data);
        response.sendRedirect("roles/roles.jsp");

    }

}
