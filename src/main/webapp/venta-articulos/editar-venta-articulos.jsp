<%-- 
    Document   : editar-estudiantes
    Created on : 22/08/2022, 17:20:06
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es_GT"/>

<!doctype html>

<html lang="es">

    <head>
        <title>Editar venta de artículos</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilo-kinal.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/edcce2df4a.js"></script>

    </head>

    <body>

        <header id="main-header" class="py-2">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-users-cog"></i> Control venta de artículos
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <main>
            <div class="container">
                <div class="row mt-5">
                    <div class="col-1">

                    </div>
                    <div class="col-10">
                        <div class="card">
                            <div class="card-header">
                                <h4>Editar venta de artículos</h4>
                            </div>
                        </div>

                        <a class="btn btn-secondary mt-3" href="${pageContext.request.contextPath}/venta-articulos/venta-articulos.jsp">
                            <i class="fa fa-arrow-left"></i> Regresar/cancelar
                        </a>

                        <form method="POST" action="${pageContext.request.contextPath}/ServletCategoria">

                            <div class="modal-body">
                                
                                <div class="mb-3">
                                    <label for="id" class="col-form-label">Id</label>
                                <input type="number" class="form-control" id="id" name="id" value="${categoria.id}" readonly="true" required>
                                </div>
                                
                                <div class="mb-3">
                                    <label for="categoria" class="col-form-label">Categoria</label>
                                    <input type="text" class="form-control" id="categoria" name="categoria" value="${categoria.categoria}" required>
                                </div>

                                <input type="hidden" class="form-control" id="accion" name="accion" value="insertar">

                                <div class="text-center">
                                    <a class="btn btn-danger " href="${pageContext.request.contextPath}/ServletCategoria?accion=eliminar&idCategoria=${categoria.id}">
                                        <i class="fas fa-trash"></i> Eliminar estudiante
                                    </a>

                                    <button type="submit" class="btn btn-success">
                                        <i class="fas fa-check"></i> Guardar cambios
                                    </button>
                                </div>

                            </div>
                            <input type="hidden" id="accion" name="accion" value="actualizar">
                        </form>

                    </div>
                    <div class="col-1">

                    </div>
                </div>
            </div>
        </main>

        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp"/>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js" ></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
