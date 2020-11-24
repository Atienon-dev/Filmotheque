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
			<h1 style="text-align:center">
				Filmothèque
			</h1>
			<h2 style="text-align:center">Avis Film</h2>
		</div>
		
		
		<h2 style="text-align:center">${film.getTitre()}</a></h2>
		<p>${film.getDescription()}</p>	
		
		<p>Réalisateur :
			<c:choose>
	            <c:when test="${empty film.getRealisateur()}">
	              <a href="ajout_real"> ajouter un réalisateur</a>
	            </c:when>
	            <c:otherwise>
	                ${film.getRealisateur().getNom()}	${film.getRealisateur().getPrenom()}
	            </c:otherwise>
	        </c:choose> 
        </p>
        
		<p>Acteurs :
			<c:choose>
				<c:when test="${empty film.getActeurs()}">
	              <a href="ajout_acteurs"> ajouter des acteurs</a>
	            </c:when>
	            <c:otherwise>
	                <ol style="list-style:none;">
		                <c:forEach items="${film.getActeurs()}" var="acteur">
		                <li>${acteur.getNom()} ${acteur.getPrenom()}</li>
			    		</c:forEach>
		    		</ol>
	            </c:otherwise>
	        </c:choose> 
		</p>

	</div>

	<jsp:include page="footer.jsp" />
</html>