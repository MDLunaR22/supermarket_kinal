<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="./assets/css/estilos.css"/>
        <link rel="stylesheet" href="./assets/css/bootstrap.css"/>
        <title>Supermarket Kinal</title>
    </head>
    <body>
        <header id="titulo-index" class="p-3 bg-primary text-white titulo">
            <h1>
                Supermarket Kinal
            </h1>
        </header>
        
        <jsp:include page="./WEB-INF/paginas/comunes/nav-bar.jsp" />
        
        <main>
            <article>
                <section>
                    <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-3">
                                            <a href="./prueba.jsp" role="button" class="btn btn-light"><img src="assets/image/slider1.jpg" class="d-block w-100"/> Caducado</a>
                                        </div>
                                        <div class="col-1">
                                            
                                        </div>
                                        <div class="col-3">
                                            <a role="button" class="btn btn-light"><img src="./assets/image/slider2.png" class="d-block w-100"> Otra pagina</a>
                                        </div>
                                        <div class="col-1">
                                            
                                        </div>
                                        <div class="col-3">
                                            <a role="button" class="btn btn-light"><img src="./assets/image/slider3.jpg" class="d-block w-100"/> Saber</a>
                                        </div>
                                    </div>
                                </div>
                                
                            </div>
                            <div class="carousel-item">
                                <img src="./assets/image/slider6.jpg" class="d-block w-100" />
                            </div>
                            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Anterior</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Siguiente</span>
                            </button>
                        </div>
                    </div>
                    <div class="container">
                        <div class="row">
                            <div class="col-5">
                                
                            </div>
                            <div class="col-1">
                                
                            </div>
                            <div class="col-6">
                                
                            </div>
                        </div>
                    </div>
                    <div id="espaciado" class="container">
                        
                    </div>
                </section>
            </article>
        </main>

        <jsp:include page="./WEB-INF/paginas/comunes/footer.jsp" />
        
    </body>
    
    <script src="./assets/js/bootstrap.bundle.js"></script>
</html>
