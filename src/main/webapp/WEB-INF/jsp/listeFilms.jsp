<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste Films</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="bootstrap-3.3.7/css/bootstrap-theme.min.css">
<script src="js/jquery.min.js"></script>
<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/commun.css">
<link rel="icon" href="img/favicon.ico" />
</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container"></div>
	</nav>

	<div class="container">
	
		<div class="jumbotron">
			<h1 style="text-align:center">Filmothèque</h1>
			<h2 style="text-align:center">Liste de Films</h2>
			<a href="/Filmotheque/deconnexion">déconnexion</a>
		</div>
		
		<c:forEach items="${films}" var="film">
		<h3><a href="/Filmotheque/film/${film.getId()}">${film.getTitre()}</a></h3>
		<p>${film.getDescription()}</p>
	    </c:forEach>		

	</div>

	<jsp:include page="footer.jsp" />
</html>