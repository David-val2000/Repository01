

<%@page import="Modelo.Persona"%>
<%@page import="ModeloDao.PersonaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Modificar Persona</title>
    </head>
    <body>

        <div class="container">
            <div class="col-lg-6">
                <h1>Modificar Persona</h1>
                <%
                    PersonaDao dao = new PersonaDao();
                    int id = Integer.parseInt((String) request.getAttribute("idper"));
                    Persona p = (Persona) dao.list(id);
                %>
                <form action="Controlador">
                    <div>
                        <!-- ID:<br> -->
                        <input type="hidden" name="txtId" value="<%=  p.getId()%>" >
                        Nombre:<br>
                        <input class="form-control" type="text" name="txtNom" value="<%= p.getNom()%>" >
                        <br>
                        DNI:<br>
                        <input class="form-control" type="text" name="txtDni" value="<%= p.getDni()%> " >
                        <br>
                        <input class="btn btn-info" type="submit" name="accion" value="Actualizar" >
                        <br>
                        <a href="Controlador?accion=listar"> regresar</a>
                </form>



            </div>

        </div>


    </body>
</html>
