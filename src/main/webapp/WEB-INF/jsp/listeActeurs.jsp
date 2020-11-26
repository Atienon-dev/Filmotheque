<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<%! // déclaration de l'objet compteur 
class Cpt { private int val=0;} %>

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
			<h1 style="text-align:center">
				Filmothèque
			</h1>
			<h2 style="text-align:center">Ajout Acteurs</h2>
		</div>
		<a href="/Filmotheque/film/${film.getId()}">Retour à la fiche du film</a>
		<form:form method="POST" action="ajoutActeur" modelAttribute="film" >
		 
			<c:forEach items="${personnes}" var="personne" varStatus="vs">						
					<div>
						<form:checkbox path="acteurs[${vs.count-1}].id" value="${personne.getId()}" />
						<form:label path="acteurs[${vs.count-1}].id" >
							<a href="/Filmotheque/personne/${personne.getId()}">${personne.getNom()} ${personne.getPrenom()}</a>
						</form:label>
					</div>	
							
		    </c:forEach>	
	    	<input type="submit" value="Submit" />
		</form:form>	

	</div>

	<jsp:include page="footer.jsp" />
</html>