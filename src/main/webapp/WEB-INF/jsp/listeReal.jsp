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
			<h1 style="text-align:center">Filmoth�que</h1>
			<h2 style="text-align:center">${film.getTitre()}</h2>
			<a href="/Filmotheque/deconnexion">d�connexion</a>
		</div>
		
		<a href="/Filmotheque/film/${film.getId()}">Retour � la fiche du film</a>
		<h3>Modifier R�alisateur</h3>		
		
		<form:form method="POST" action="modifierReal" modelAttribute="film" >
			<c:forEach items="${realisateur}" var="realisateur">			
					<div>
						<form:radiobutton path="realisateur.id" value="${realisateur.getId()}" />
						<form:label path="realisateur.id">
							<a href="/Filmotheque/personne/${realisateur.getId()}">${realisateur.getNom()} ${realisateur.getPrenom()}</a>
						</form:label>
					</div>				
		    </c:forEach>	
	    	<input type="submit" value="Submit" />
		</form:form>	

	</div>

	<jsp:include page="footer.jsp" />
</html>