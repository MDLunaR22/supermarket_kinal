<nav>
    <div class="nav flex-column bg-primary text-white" style="--bs-bg-opacity: .5;">
        <ul class="nav justify-content-end">
            <li class="nav-item">
                <a class="nav-link text-black" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletRol?accion=listar">Roles</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletFactura?accion=listar">Facturas</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletPersona?accion=listar">Personas</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletUsuario?accion=listar">Usuarios</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletEmpleado?accion=listar">Empleados</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletCliente?accion=listar">Clientes</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletProveedor?accion=listar">Proveedores</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletCategoria?accion=listar">Categorias</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-black" href="${pageContext.request.contextPath}/ServletVentaArticulo?accion=listar">Ventas de Articulos</a>
            </li>
        </ul>
    </div>
</nav>