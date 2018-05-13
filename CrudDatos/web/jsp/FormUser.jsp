<%-- 
    Document   : formularioCliente
    Created on : 08-mar-2018, 13:21:08
    Author     : 6001018
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloFormulario.css">
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

        </style>
    <ul>
        <li>
            <form method="post" action="../index.jsp">
                <button type="submit">Inicio</button>
            </form>

        </li>
        <li>
            <form method="post" action="../FormCliServlet" >
                <button type="submit" >Añadir</button>
            </form>
        </li>
        <li>
            <form method="post" action="../pideNumSocioModificacionServlet">
                <button type="submit">Modificar</button>
            </form>
        </li>
        <li>
            <form method="post" action="../pideNumSocioServlet">
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
<h2 class=" text-center titulo">Introduzca los datos del nuevo Usuario:</h2>
<body>

    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="well well-sm">
                    <form class="form-horizontal" method="post" action="../Registro">
                        <fieldset>
                            <legend class="text-center header">Registro Nuevo Usuario</legend>

                            <div class="form-group centrado">
                                <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                                <div class="col-md-10">
                                    <input id="fname" name="usuario" type="text" autocomplete="off" placeholder="Usuario" class="form-control" >
                                </div>
                            </div>
                            <div class="form-group centrado">
                                <span class="col-md-1 col-md-offset-4 text-center"><i class="fa fa-user bigicon"></i></span>
                                <div class="col-md-10">
                                    <input id="lname" name="contrasena" type="text" autocomplete="off" placeholder="Contraseña" class="form-control">
                                </div>
                            </div>
                            <div class="form-group boton">
                                <div class="col-md-1 text-center">
                                    <button type="submit" class="btn btn-primary btn-lg">Aceptar</button>
                                    <input type="hidden" value=admin name="password"/>
                                    <input type="hidden" value=admin name="name"/> 
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>