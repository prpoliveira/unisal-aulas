<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../pages/template/header.jsp" />

<form action="controlador-geral?execute=Logout" method="post">
    <input type="submit" value="Logout" />
</form>
<hr/>
<form action="controlador-geral?execute=CalculaFrete" method="post">
    <input type="submit" value="Calcular Frete" />
</form>

<c:import url="../pages/template/footer.jsp" />