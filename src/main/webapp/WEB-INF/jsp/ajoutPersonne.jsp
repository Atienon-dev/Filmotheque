<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
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
			<h1>
				Ajouter une Personne
			</h1>
		</div>

		<h2>Formulaire de saisie :</h2>
		<form:form method="POST" action="/demoJPA/ajoutPersonne" modelAttribute="personne">
			<div>
				<form:label path="nom">Nom :</form:label>
				<form:input path="nom" />
			</div>
			<div>
				<form:label path="prenom">Prenom :</form:label>
				<form:input path="prenom" />
			</div>
			<div>
				<form:label path="filmJoue">Films joués :</form:label>
				<form:input path="filmJoue" />
			</div><div>
				<form:label path="filmRealise">Films réalisés :</form:label>
				<form:input path="filmRealise" />
			</div>
			
			<input type="submit" value="Submit" />
		</form:form>

	</div>

	<jsp:include page="footer.jsp" />
</html>