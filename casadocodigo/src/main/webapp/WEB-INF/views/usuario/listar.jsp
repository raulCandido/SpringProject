<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>
</head>
<body>
	<h1>Listando usuarios</h1>
	<div>${msg}</div>
	<table>
		<tr>
			<td>Código usuário</td>
			<td>Nome</td>
			<td>Email</td>
		</tr>
		<c:forEach items="${listaUsuario}" var="usuario">
			<tr>
				<td>${usuario.id}</td>
				<td>${usuario.nome}</td>
				<td>${usuario.email}</td>
				<td>${endereco.enderecoId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>