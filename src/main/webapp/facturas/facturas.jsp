<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">
    <!-- Cabecera de la página, información general, metadatos -->
    <head>
        <title>Listar Facturas</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="../assets/css/estilos.css" />
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
                            <i class="fas fa-file-invoice-dollar"></i> Control de Facturas
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/nav-bar.jsp" />

        <main>
            <section id="factura">
                <div class="container mt-5 mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de facturas</h4>
                                </div>
                            </div>
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>No. Factura</th>
                                        <th>Serie</th>
                                        <th>Fecha</th>
                                        <th>Empleado</th>
                                        <th>Cliente</th>
                                        <th>Articulo</th>
                                        <th></th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="factura" items="${ListadoDeFacturas}">
                                    <tr>
                                        <td></td>
                                        <c:set var="comprobacion" value="${factura.numeroFacturas}"/>
                                        <c:if test="${comprobacion < 10}">
                                            <td>00${comprobacion}</td>
                                        </c:if>
                                        <c:if test="${comprobacion >= 10 && comprobacion <100}">
                                            <td>0${comprobacion}</td>
                                        </c:if>
                                        <td>${factura.serie}</td>
                                        <td>${factura.fecha}</td>
                                        <td>${factura.empleadoId}</td>
                                        <td>${factura.clienteId}</td>
                                        <td>${factura.ventaArticuloId}</td>
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
