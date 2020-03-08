<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./res/index8.css">
<meta charset="ISO-8859-1">
<title>Resultado buscar Pokemon por Id:</title>
</head>
<body>
<h1>Resultado buscar Pokemon por Id:</h1>
<br>
<br>
Pokemon: <%= request.getParameter("nombrePok") %> <br>
Id: <%= request.getParameter("IdPok") %>
<br>
<br>
<form name="volver" method="post" action="Volver">
<input type="submit" class="volver" name="submit" value="Volver"/>
</body>
</html>