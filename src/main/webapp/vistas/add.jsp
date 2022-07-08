<%-- 
    Document   : add
    Created on : 5 jul. 2022, 18:38:28
    Author     : Homa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Persona</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Persona</h1>
                <form action="Controlador">

                    <!-- ID:<br> --> 
                    Nombre<br>
                    <input class="form-control" type="text" name="txtNom">  
                    <br>
                    DNI<br>
                    <input class="form-control" type="text" name="txtDni">
                    <br>
                    <input class="btn btn-info" type="submit" name="accion" value="Agregar" >
                    <br>
                    <a href="Controlador?accion=listar"> regresar</a>
                </form>


            </div>
        </div>

    </body>
</html>
