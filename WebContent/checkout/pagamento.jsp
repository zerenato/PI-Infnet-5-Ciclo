<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insira os dados de Pagamento</title>
</head>
<body>
<form method="post" action="finalizacao.do" class="formularioPagamento">
<p>Insira os dados do cartão de <strong><c:out value="${formaPagamento}"/></strong></p>
<br/>
Bandeira: <input type="radio" name="bandeira" value="visa">Visa <input type="radio" name="bandeira" value="master">Master Card <input type="radio" name="bandeira" value="amex">American Express <input type="radio" name="bandeira" value="diners">Diners
<br/><br/>
Número do cartão de <c:out value="${formaPagamento}"/>: <input type="text" maxlength="16" required="required" name="numero" autocomplete="off" placeholder="Digite o número do cartão">
<br/>
Nome que consta no cartão: <input type="text"  required="required" name="nome">
<br/>
Validade: <input type="month"  required="required" name="validade">
<br/>
Dígitos de segurança: <input type="text" size="23" maxlength="4" autocomplete="off" required="required" name="digitosSeguranca" placeholder="Esses dígitos estão no verso">
<br/>
<input type="submit" value="Comprar">
</form>
</body>
</html>