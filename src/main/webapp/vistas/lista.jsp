<%-- 
    Document   : lista
    Created on : 5 jul. 2022, 18:21:05
    Author     : Homa
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDao.PersonaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>LISTAR PERSONAS</title>
    </head>
    <body>
        <div class="container" >
            <h1>Personas</h1>
            <a class="btn btn-success" href="Controlador?accion=add"> Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRES</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PersonaDao dao = new PersonaDao();
                    List<Persona> list = dao.lista();
                    Iterator<Persona> iter = list.iterator();
                    Persona per = null;
                    while (iter.hasNext()) {
                        per = iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%= per.getId()%></td>
                        <td><%= per.getDni()%></td>
                        <td> <%= per.getNom()%> </td>
                        <td>
                            <a class="btn btn-danger" href="Controlador?accion=editar&id=<%= per.getId()%>"> Editar </a>
                            <a class="btn btn-warning" href="Controlador?accion=eliminar&id=<%= per.getId()%>"> Eliminar </a>
                        </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
