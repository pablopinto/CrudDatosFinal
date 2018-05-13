<%-- 
    Document   : listaProyectos
    Created on : 13-may-2018, 17:49:36
    Author     : Pablo
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <%
            HashMap<String, String> listaProyectos = new HashMap();
            listaProyectos.put("1", "Crud");
            listaProyectos.put("2", "Uno");
            listaProyectos.put("3", "Dos");
            listaProyectos.put("4", "Tres");
            listaProyectos.put("5", "Cuatro");
            listaProyectos.put("6", "Cinco");
            listaProyectos.put("7", "Seis");
            listaProyectos.put("8", "Siete");
            listaProyectos.put("9", "Ocho");
        %>
        <table>
            <tr>
                <th>Numero de Proyecto</th>
                <th>Nombre de Proyecto</th>
            </tr>
            <tr>
                <td>1</td> 
                <td><%= listaProyectos.get("1")%></td>
            </tr>
            <tr>
                <td>2</td> 
                <td><%= listaProyectos.get("2")%></td>
            </tr>
            <tr>
                <td>3</td> 
                <td><%= listaProyectos.get("3")%></td>
            </tr>
            <tr>
                <td>4</td> 
                <td><%= listaProyectos.get("4")%></td>
            </tr>
            <tr>
                <td>5</td> 
                <td><%= listaProyectos.get("5")%></td>
            </tr>
            <tr>
                <td>6</td> 
                <td><%= listaProyectos.get("6")%></td>
            </tr>
            <tr>
                <td>7</td> 
                <td><%= listaProyectos.get("7")%></td>
            </tr>
            <tr>
                <td>8</td> 
                <td><%= listaProyectos.get("8")%></td>
            </tr>
            <tr>
                <td>9</td> 
                <td><%= listaProyectos.get("9")%></td>
            </tr>
        </tr>
    </table>
</body>
</html>
