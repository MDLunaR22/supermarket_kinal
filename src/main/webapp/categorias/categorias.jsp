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
        <title>Listar Categorías</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="../assets/css/estilos.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />

        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
        <script type="text/javascript" src="../assets/js/edcce2df4a.js"></script>

    </head>

    <!-- Cuerpo de la página -->
    <body>
        <header class="p-3 bg-primary text-white">
            <div id="titulo-index" class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-users-cog"></i> Control de Categorias
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/nav-bar.jsp" />

        <main>
            
            <section id="accions" class="py-4 mb-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addModal">Agregar categorías</a>
                        </div>
                    </div>
                </div>
            </section>
            
            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-primary text-white">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar artículos</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>

                        <form method="POST" action="${pageContext.request.contextPath}/ServletCategoria" class="was-validated">
                            <div class="modal-body">
                                
                                <div class="mb-3">
                                    <label for="categoria" class="col-form-label">Categoría</label>
                                    <input type="text" class="form-control" id="categoria" name="categoria" step="any" required>
                                </div>
                                
                                <input type="hidden" class="form-control" id="accion" name="accion" value="insertar">

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            
            <section id="categoria">
                <div class="container mt-5 mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Categorías</h4>
                                </div>
                            </div>
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>CATEGORIA</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="categoria" items="${ListadoDeCategorias}">
                                        <tr>
                                            <td>${categoria.id}</td>
                                            <td>${categoria.categoria} </td>
                                            <td>
                                                <a class="btn btn-warning" href="${pageContext.request.contextPath}/ServletCategoria?accion=editar&IdCategoria=${categoria.id}">
                                                    <i class="far fa-edit">Editar</i>
                                                </a>
                                            </td>
                                            <td>
                                                <a class="btn btn-danger" href="${pageContext.request.contextPath}/ServletCategoria?accion=eliminar&idCategoria=${categoria.id}">
                                                    <i class="far fa-trash-alt"></i>Eliminar
                                                </a>
                                            </td>
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