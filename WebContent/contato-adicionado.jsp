<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Atividade Servlet</title>
</head>
<body>
	<h1>Contato Salvo</h1>
	${param.nome} ${param.email} adiconado com sucesso!
	<p><a href="learn?logica=ListaContatos">Lista Contatos</a></p>
	<p><a href="index.html">Adiciona outro contato</a></p>
</body>
</html>