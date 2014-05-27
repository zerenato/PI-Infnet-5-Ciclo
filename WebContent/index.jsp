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
	<table border="1">
		<tr>
			<td>Nome</td>
			<td>Preço</td>
		</tr>
		<c:forEach items="${produtos}" var="produto">
			<tr>
				<c:choose>
					<c:when test="${produto.isDestaque()}">
						<td><c:out value="${produto.getNome()}" /></td>
						<td><c:out value="${produto.getPrecoPor()}" /></td>
					</c:when>
				</c:choose>
			</tr>
		</c:forEach>
	</table>
</body>
</html>