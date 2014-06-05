<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Faça login para continuar</title>
	</head>
	<body>
		<% boolean erro = Boolean.valueOf(request.getParameter("error"));%>
		<%if (erro){ %>
			<p class="erro">Usuário e/ou senha incorretos. Por favor tente novamente</p>
		<%} %>
		<div class="login">
		<p class="mensagemLogin">Para continuar, faça o login</p>
		<form method="post" action="Login.do" class="formularioLogin">
			Insira o seu email:
			<input type="email" name="login">
			<br>
			Insira a sua senha:
			<input type="password" name="senha">
			<br>
			<input type="submit" value="Entrar">
		</form>
		<p class="cadastre-se">Ou <a href="cadastro.html">cadastre-se</a></p>
		</div><!-- /login -->		
	</body>
</html>