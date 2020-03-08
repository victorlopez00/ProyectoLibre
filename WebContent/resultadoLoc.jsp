<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./res/index7.css">
<meta charset="ISO-8859-1">
<title>Resultado buscar Localizacion:</title>
</head>
<body>
<h1>Resultado buscar Localizacion:</h1>
<br>
<br>
Pokemon: <%= request.getParameter("nombreLoc") %> <br>
Id: <%= request.getParameter("IdLoc") %>
<br>
<br>
<form name="volver" method="post" action="Volver">
<input type="submit" class="volver" name="submit" value="Volver"/>
</body>
</html>