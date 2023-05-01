<%-- 
    Document   : estudiantes
    Created on : 22/08/2022, 17:19:28
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">
    <!-- Cabecera de la página, información general, metadatos -->
    <head>
        <title>Listar Empleados</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="../assets/css/estilos.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>

        <script src="../assets/js/edcce2df4a.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>

    </head>

    <!-- Cuerpo de la página -->
    <body>
        <header class="p-3 bg-primary text-white">
            <div id="titulo-index" class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-user-cog"></i> Control Empleados
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/nav-bar.jsp" />

        <main>
            <section id="empleado">
                <div class="container mt-5 mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Empleados</h4>
                                </div>
                            </div>

                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>DPI</th>
                                        <th>Persona</th>
                                        <th>USUARIO</th>
                                        <th>Rol_ID</th>
                                        <th>#</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="empleados" items="${ListadoDeEmpleados}">
                                        <tr>
                                            <td>${empleados.dpi}</td>
                                            <td>${empleados.personaId} </td>
                                            <td>${empleados.usuarioId} </td>
                                            <td>${empleados.rolId} </td>
                                            <td>
                                                <i class="far fa-edit"> Editar</i>
                                            </td>
                                            <td>
                                                <i class="far fa-trash-alt"> Eliminar</i>
                                            </td>
                                            <td></td>
                                        </tr>  
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                    </div>

                </div>    
            </section>            
        </main>

        <aside>
            <!-- Información secundaria -->
        </aside>

        <jsp:include page="../WEB-INF/paginas/comunes/footer.jsp"/>
    </body>


</html>