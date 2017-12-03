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
	<form action="/casadocodigo/usuario" method="post">
		<div>
			<label>Nome</label> <input type="text" name="nome">
		</div>
		<div>
			<label>Email</label> <input type="email" name="email">
		</div>
		<div>
			<label>Senha</label> <input type="password" name="senha">
		</div>
		<div>
			<label>Logradouro</label> <input type="text" name="endereco.logradouro">
		</div>
		<div>
			<label>CEP</label> <input type="number" name="endereco.cep">
		</div>
		<div>
			<label>Numero</label> <input type="text" name="endereco.numeroCasa">
		</div>
		<button type="submit">Cadastrar</button>

	</form>
</body>
</html>