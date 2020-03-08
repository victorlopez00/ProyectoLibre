<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" type="text/css" href="./res/index2.css">
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>

<body>
<h1>Menu, bienvenido <%= request.getParameter("nombre") %></h1>
<div>
<form name="menu" method="post" action="Menu">
<input type="submit" class="pornombre" name="pornombre" value="Consultar Pokemon por nombre"/></form>
<form name="porid" method="post" action="ConsultarId">
<input type="submit" class="porId" name="porid" value="Consultar Pokemon por Id"/></form>
<form name="loc" method="post" action="ConsultarLoc">
<input type="submit" class="loc" name="loc" value="Consultar Localizacion"/></form>

</div>
</body>
</html>