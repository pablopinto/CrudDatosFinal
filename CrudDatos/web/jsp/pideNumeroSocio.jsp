<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloFormulario.css" />
        <link href="https://fonts.googleapis.com/css?family=Gugi" rel="stylesheet">
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333333;
            }

            li {
                float: left;
            }

            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 16px;
                text-decoration: none;
            }

            li a:hover {
                background-color: #111111;
            }
            button{
                background-color: #333333;
                border: none;
                color: white;
                padding: 16px;
                text-decoration: none;
            }
            button:hover{
                background-color: #111111;
            }
            *{
                font-family: 'Gugi', cursive;
            }
            h1{
                font-family: 'Gugi', cursive;
            }
            body{
                background:url(img/prueba.jpg) repeat;
            }
            .containing-table {
                display: table;
                width: 80%;
                height: 80%;
                margin: 0 auto;
                border: 2.5px solid;
            }

        </style>
    <ul>
        <li>
            <form method="post" action="index.jsp">
                <button type="submit">Inicio</button>
            </form>

        </li>
        <li>
            <form method="post" action="FormCliServlet" >
                <button type="submit" >Añadir</button>
            </form>
        </li>
        <li>
            <form method="post" action="pideNumSocioModificacionServlet">
                <button type="submit">Modificar</button>
            </form>
        </li>
        <li>
            <form method="post" action="pideNumSocioServlet">
                <button type=" submit">Eliminar</button>
            </form>
        </li>
        <li>
            <form method="post" action="listaProyectos.jsp">
                <button type=" submit">Lista de Proyectos</button>
            </form>
        </li>
    </ul>
</head>

<body>
    <table class ="table table-hover">
        <tr><th>Código</th><th>Nombre</th><th>Apellido</th><th>Telefono</th><th>Direccion</th></tr>
                <c:forEach items="${salida}" var="alo" >
            <tr><td>
                    <c:out value="${alo.codigoCliente}"/></td>  
                <td><c:out value="${alo.nombre}"/></td>
                <td><c:out value="${alo.apellido}"/></td>  
                <td><c:out value="${alo.telefono}"/></td>  
                <td><c:out value="${alo.direccion}"/></td>

                <td>
                    <form method="post" action="FormCliBajaServlet">
                        <input type="hidden" name="codigo" value="${alo.codigoCliente}"/>
                        <button type="button submit" class="btn btn-danger btn-sm boton">Borrar</button>
                    </form>
                </td></tr>
            </c:forEach>
    </table>

    <form method ="post" action="jsp/Baja.jsp">
        <button type="button submit" class="btn btn-success boton">Aceptar</button>
         <input type="hidden" value=admin name="password"/>
        <input type="hidden" value=admin name="name"/> 
    </form>
</body>
</html>