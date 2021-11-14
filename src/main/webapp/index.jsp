<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title> Registro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="principal/css/style.css" />
</head>

<body>
    <div class="container">
        <div class="content">
            <!--FORMULÁRIO DE LOGIN-->
            <div id="login">
                <form action="serveletLogin" method="post"><!-- aponta para a servelet que vai interceptar este formulario -->
                                             <!-- o metodo padrão sempre é o get -->
                    <div class="div-login-u">
                        <h1>Login</h1>
                    </div>
                    <p>
                        <label for="nome_login">Nome </label>
                        <input id="nome_login" name="nome" required="required" type="text"
                            placeholder="Digite o Usuario" />
                    </p>
                    <p>
                        <label for="email_login">Senha</label>
                        <input id="email_login" name="senha" required="required" type="password"
                            placeholder="Digite a Senha" />
                    </p>
                    <p>
                        <input type="submit" value="Logar" />
                    </p>
                    <p class="link">
                        Ainda não tem conta?
                        <a href="#paracadastro">Cadastre-se</a>
                    </p>
                </form>
            </div>
            
  

        </div>
        <!--Container-->
</body>
</html>