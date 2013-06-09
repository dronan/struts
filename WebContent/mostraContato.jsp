<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html>
	<head>
		<title>Sistema de teste do struts</title>
	</head>
	<!-- 
	<html:errors/>
	 -->
	<html:form action="/alteraContato" focus="contato.nome">
		<html:hidden property="contato.id" value="${contato.id}"  />
		Nome: <html:text property="contato.nome" value="${contato.nome}" /><br>
		Email: <html:text property="contato.email"  value="${contato.email}"/><br>	
		Endereço: <html:text property="contato.endereco"  value="${contato.endereco}"/><br>
		<html:submit>alterar dados</html:submit>
	</html:form>

</html:html>
