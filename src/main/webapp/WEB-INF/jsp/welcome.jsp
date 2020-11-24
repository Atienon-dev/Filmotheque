<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
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
			<h1 style="text-align:center">
				Filmothèque
			</h1>
			<h2 style="text-align:center">Connexion</h2>
		</div>

		<h3>Formulaire de saisie :</h3>
		<form:form method="POST" action="connexion" modelAttribute="utilisateur">
			<div>
				<form:label path="pseudo">Pseudo :</form:label>
				<form:input path="pseudo" />
			</div>
			<div>
				<form:label path="motDePasse">Mot De Passe :</form:label>
				<form:password path="motDePasse" />
			</div>
			<input type="submit" value="Submit" />
		</form:form>

	</div>

	<jsp:include page="footer.jsp" />
</html>