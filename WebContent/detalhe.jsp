<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:choose>
<c:when test="${produtoEncontrado}">
	<title><c:out value="${produto.getNome()}" /></title>
</c:when>
<c:otherwise>
	<title><c:out value="Produto não encontrado" /></title>
</c:otherwise>
</c:choose>
</head>
<body>
<c:choose>
<c:when test="${produtoEncontrado}">

<h1 class="nomeProduto"><c:out value="${produto.getNome()}" /></h1>
<p class="idProduto">Código: <c:out value="${produto.getId()}" /></p>
<br/>
<p class="categoria"><c:out value="${produto.getCategoria()}" /></p>
<p class="estado"><c:out value="${produto.getEstado()}" /></p>
<c:choose>
	<c:when test="${produto.getPrecoPor() lt produto.getPrecoDe()}">
		<p class="precoDe"><strike>De: <c:out value="${produto.getPrecoDe()}" /></strike></p>
		<p class="precoPor"><strong>Por: <c:out value="${produto.getPrecoPor()}" /></strong></p>
		<p class="valorDesconto">Economia de R$ <c:out value="${produto.getPrecoDe() - produto.getPrecoPor()}" /></p>
	</c:when>
	<c:otherwise>
		<p class="precoPor">Por: <c:out value="${produto.getPrecoPor()}" /></p>
	</c:otherwise>
</c:choose>
<p class="condicoes">Condições: <c:out value="${produto.getCondicoes()}" /></p>
<p class="dataLimite">Válido até: <c:out value="${produto.getDataLimite()}" /></p>
<c:url value="compra.do" var="urlCompra">
	<c:param name="id" value="${produto.getId()}" />
</c:url>
		
<strong><a class="linkDetalhe" href="${urlCompra}" >Comprar</a></strong>
</c:when>
<c:otherwise>
	<h1><c:out value="Produto não encontrado" /></h1>
	<p>Provavelmente o produto que você está procurando não existe mais. Clique <a href="/history.go(-1)">aqui</a> para voltar</p>
</c:otherwise>
</c:choose>
</body>
</html>