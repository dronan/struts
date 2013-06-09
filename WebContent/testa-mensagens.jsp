<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:message key="site.titulo"/></title>
</head>
<body>
<a href="mudaIdioma.do?idioma=en">EN</a> <br>
<a href="mudaIdioma.do?idioma=pt">PT</a> <br>
<bean:message key="menu.nome"/><br>
<bean:message key="menu.arquivo"/><br>
<bean:message key="menu.editar"/><br>
<bean:message key="menu.sair"/><br>
</body>
</html>