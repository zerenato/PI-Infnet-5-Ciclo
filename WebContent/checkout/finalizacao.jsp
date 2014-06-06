<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:choose>
<c:when test="${compraDeferida}">
	<title>Compra Deferida</title>
</c:when>
<c:otherwise>
	<title>Compra Indeferida</title>
</c:otherwise>
</c:choose>
</head>
<body>
<div class="detalhesCompra">
<h1>Detalhes da compra</h1>
<p class="nomeProduto"><strong>Nome da promoção:</strong> <c:out value="${produtoComprado.getNome()}" /></p>
<p class="categoria"><strong>Categoria:</strong><c:out value="${produtoComprado.getCategoria()}" /></p>
<p class="estado"><strong>Estado:</strong><c:out value="${produtoComprado.getEstado()}" /></p>
<c:choose>
	<c:when test="${produtoComprado.getPrecoPor() lt produtoComprado.getPrecoDe()}">
		<p class="precoDe"><strike>De: R$ <c:out value="${produtoComprado.getPrecoDe()}" /></strike></p>
		<p class="precoPor"><strong>Por:</strong> R$ <c:out value="${produtoComprado.getPrecoPor()}" /></p>
		<p class="valorDesconto">Economia de R$ <c:out value="${produtoComprado.getPrecoDe() - produtoComprado.getPrecoPor()}" /></p>
	</c:when>
	<c:otherwise>
		<p class="precoPor"><strong>Por:</strong> R$ <c:out value="${produtoComprado.getPrecoPor()}" /></p>
	</c:otherwise>
</c:choose>
<p class="condicoes"><strong>Condições:</strong> <c:out value="${produtoComprado.getCondicoes()}" /></p>
<p class="dataLimite"><strong>Válido até:</strong> <c:out value="${produtoComprado.getDataLimite()}" /></p>
</div> <!-- /detalhesCompra -->
<br>
<div class="deferimento">
<c:choose>
<c:when test="${compraDeferida}">
	<p class="mensagemDeferimento">Sua compra foi <strong>DEFERIDA</strong>
	Em breve você receberá informações sobre a validação dos dados junto à operadora.</p>
</c:when>
<c:otherwise>
	<p class="mensagemDeferimento">Sua compra foi INDEFERIDA</p>
	<p class="motivosErro">Motivos do indeferimento</p>
	<div class="erros">
	<c:forEach items="${erros}" var="erro">
			<c:out value="${erro}"/>
			<br/>
	</c:forEach>
	</div> <!-- /erros -->
	<c:url value="../detalhe.do" var="urlDetalhe">
	<c:param name="id" value="${produtoComprado.getId()}" />
	</c:url>
	<p class="tenteNovamente">Para tentar comprar o produto novamente, clique <a href="${urlDetalhe}">aqui</a></p>
</c:otherwise>
</c:choose>
</div> <!-- /deferimento -->
</body>
</html>