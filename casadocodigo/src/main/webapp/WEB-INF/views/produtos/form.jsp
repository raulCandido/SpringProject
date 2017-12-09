<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -	Casa do Código</title>
</head>
<body>
	<form:form action="${s:mvcUrl('PC#gravar').build() }" method="POST" commandName="produto">
		<div>
			<label>Titulo</label> 
			<form:input path="titulo"/>
			<form:errors path="titulo" />
		</div>
		<div>
			<label>Descricao</label>
			<form:textarea rows="10" cols="20"  path="descricao"/>
			<form:errors path="descricao" />
		</div>
		<div>
			<label>Paginas</label>
			<form:input path="paginas"/>
			<form:errors path="paginas" />
		</div>
		<div>
			<label>Data lançamento</label>
			<input type="text" name="dataLancamento"/>
			<form:errors path="dataLancamento"/>
		</div>

		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco.descricao}</label>
				 <input type="text" name="precos[${ status.index}].valor">
				 <input type="hidden" name="precos[${status.index}].tipoPreco" value="${tipoPreco}">
			</div>
		</c:forEach>
		<button type="submit">Cadastrar</button>
	</form:form>
</body>
</html>