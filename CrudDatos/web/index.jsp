<!DOCTYPE html>


<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="css/login.css" type="text/css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

        <title>Logueando</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 18px;
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
                padding: 13px;
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
                background:transparent repeat;
            }
            html,body{
                background: #efefef;
                padding: 0px;
                font-family: 'Varela Round';
                /* padding-top: 5px; */
                /* height: 758px; */
            }


        </style>
    <ul>
        <li>
            <form method="post" action="../index.jsp">
                "
            </form>

        </li>
        <li>
            <form method="post" action="../FormCliServlet" >

            </form>
        </li>
        <li>
            <form method="post" action="../pideNumSocioModificacionServlet">

            </form>
        </li>
        <li>
            <form method="post" action="../pideNumSocioServlet">

            </form>
        </li>
    </ul>
</head>

<body>
    <script type="text/javascript" src="js/login.js"></script>
    <div class="text-center" style="padding:10%">
        <div class="logo">Inicio Sesion</div>
        <div class="login-form-1">
            <form id="login-form" class="text-left" action="InicioServlet" method="post">
                <div class="login-form-main-message"></div>
                <div class="main-login-form">
                    <div class="login-group">
                        <div class="form-group">
                            <label for="text" class="sr-only">Usuario</label>
                            <input type="text" class="form-control" autocomplete ="off" id="name" name="name" placeholder="usuario">
                        </div>
                        <div class="form-group">
                            <label for="pwd" class="sr-only">Contraseña</label>
                            <input type="password" class="form-control" id="pwd" name="password" placeholder="contraseña">
                        </div>
                    </div>
                    <button type="submit" class="login-button"><i class="fa fa-chevron-right"></i></button>
                </div>
                <div class="etc-login-form">
                    <p>Registro <a href="jsp/FormUser.jsp">Create una nueva cuenta</a></p>
                </div>
            </form>
        </div>
    </div>
</body>
</html>





<!--<!DOCTYPE html>

To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.

<html>  
<head>  
<link rel="stylesheet" type="text/css" href="css/estiloFormulario.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">  
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Login Crud</title>  


</head>  
<body background="img/fondo.jpg">

<h1 class="text-center titulo centrado"></h1>  
<a href="jsp/login.jsp" class="text-center titulo centrado">Login</a>
<a href="LogoutServlet" class="text-center titulo centrado">Logout</a> 
<a href="ProfileServlet" class=" text-center header centrado">Profile</a>  

</body>  
</html>  -->

