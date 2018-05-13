
<%-- 
    Document   : index
    Created on : 08-mar-2018, 12:40:16
    Author     : 6001018
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloFormulario.css">
        <link href="https://fonts.googleapis.com/css?family=Gugi" rel="stylesheet">
        <title>Listado Empleados</title>
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
            .containing-table {
                display: table;
                width: 80%;
                height: 80%;
                margin: 0 auto;
                border: 2.5px solid;
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
    <h1 style="margin-left: 65px;">Listado de Empleados</h1>
    <div class="containing-table">
        <div class="inf">
             <display:table style="text-align:center; margin:0 auto;" name="listaCliente" id="lista" class ="table table-hover" >
                 <display:column title="NOMBRE" property="nombre"></display:column>
                 <display:column  title="APELLIDO" property="apellido"/>
                 <display:column  title="TELEFONO" property="telefono"/>
                 <display:column  title="DIRECCION" property="direccion"/>
                 <display:column title="PROYECTO" property="proyecto"/>
             </display:table>
    </div>
</div>

</body>



</html>