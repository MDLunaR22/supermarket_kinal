<%-- 
    Document   : personas
    Created on : 6/09/2022, 21:41:44
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es_GT" />
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Listar personas</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="../assets/css/estilos.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />

        <script src="../assets/js/edcce2df4a.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>
    </head>
    <body>
        <header class="p-3 bg-primary text-white titulo">
            <div id="titulo-index" class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-users-cog"></i> Control Persona
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/nav-bar.jsp" />

        <main>
            <section id ="persona">
                <div class="container mt-5 mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de personas</h4>
                                </div>
                            </div>   
                            <table class="table table-stripted">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Nombre Completo</th>
                                        <th>Correo</th>
                                        <th>Telefono</th>
                                        <th></th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="personas" items="${ListadoDePersonas}">
                                        <tr>
                                            <td>${personas.id}</td>
                                            <td>${personas.primerNombre} ${personas.primerApellido}</td>
                                            <td>${personas.correo}</td>
                                            <td>${personas.telefono}</td>
                                            <td>
                                                <i class="far fa-edit"></i> Editar
                                            </td>
                                            <td>
                                                <i class="far fa-trash-alt"></i> Eliminar
                                            </td>
                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                        </section>

                        </main>

                        <aside>
                            <!-- Información secundaria -->
                        </aside>

                        <jsp:include page="../WEB-INF/paginas/comunes/footer.jsp"/>


                        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
                        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
                        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js" ></script>
                        <script type="text/javascript" src="../assets/js/script.js"></script>

                        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
                        </body>
                        </html>
