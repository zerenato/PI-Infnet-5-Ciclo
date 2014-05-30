<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Compras Coletivas</title>
</head>
<body>
	<div class="busca">	
		<form class="formularioBusca" action="busca.do" method="get">
			<h2 class="tituloBusca">Faça uma busca por:</h2>
			<p>Estado:
			<select name="estado">
				<option selected="selected" disabled="disabled">Selecione</option>
    			<option value="AC">Acre</option>
    			<option value="AL">Alagoas</option>
    			<option value="AM">Amazonas</option>
    			<option value="AP">Amapá</option>
    			<option value="BA">Bahia</option>
    			<option value="CE">Ceará</option>
    			<option value="DF">Distrito Federal</option>
    			<option value="ES">Espirito Santo</option>
    			<option value="GO">Goiás</option>
    			<option value="MA">Maranhão</option>
    			<option value="MG">Minas Gerais</option>
    			<option value="MS">Mato Grosso do Sul</option>
    			<option value="MT">Mato Grosso</option>
    			<option value="PA">Pará</option>
    			<option value="PB">Paraíba</option>
    			<option value="PE">Pernambuco</option>
    			<option value="PI">Piauí</option>
    			<option value="PR">Paraná</option>
    			<option value="RJ">Rio de Janeiro</option>
    			<option value="RN">Rio Grande do Norte</option>
    			<option value="RO">Rondônia</option>
    			<option value="RR">Roraima</option>
    			<option value="RS">Rio Grande do Sul</option>
    			<option value="SC">Santa Catarina</option>
    			<option value="SE">Sergipe</option>
    			<option value="SP">São Paulo</option>
    			<option value="TO">Tocantins</option>
			</select></p>
			<p>Categoria: 
				<select name="categoria">
					<option selected="selected" disabled="disabled">Selecione</option>
					<option value="Produtos">Produtos</option>
    				<option value="Viagem">Viagem</option>
    				<option value="Diversao">Diversão</option>
    				<option value="Estetica">Estética</option>
				</select>
			</p>
			<p>Nome: <input name="nome" type="text" size="30" placeholder="Digite um termo a ser buscado"/></p>
			<input type="submit" class="btnBuscar" value="Buscar">
		</form>
	</div> <!-- /busca -->
	<div class="ofertasDestaque">
	<h2>Ofertas em Destaque</h2>
	<ul>
		<c:forEach items="${produtos}" var="produto">
			<li>
				<div class="informacoesProduto">
					<p class="nomeproduto"><c:out value="${produto.getNome()}" /></p>
					<p class="categoria"><c:out value="${produto.getCategoria()}" /></p>
					<p class="estado"><c:out value="${produto.getEstado()}" /></p>
					<c:choose>
						<c:when test="${produto.getPrecoPor() lt produto.getPrecoDe()}">
							<p class="precoDe">De: R$<c:out value="${produto.getPrecoDe()}" /></p>
							<p class="precoPor">Por: R$<c:out value="${produto.getPrecoPor()}" /></p>
							<p class="valorDesconto">Economia de R$ <c:out value="${produto.getPrecoDe() - produto.getPrecoPor()}" /></p></c:when>
						<c:otherwise>
							<p class="precoPor">Por: R$ <c:out value="${produto.getPrecoPor()}" /></p>
						</c:otherwise>
					</c:choose>
					<c:url value="detalhe.do" var="urlDetalhe">
						<c:param name="id" value="${produto.getId()}" />
					</c:url>
		
					<a class="linkDetalhe" href="${urlDetalhe}" >
						Veja mais
					</a>
				</div> <!-- /informacoesProduto -->
			</li>
		</c:forEach>
	</ul>
	</div><!-- /ofertasDestaque -->
</body>
</html>