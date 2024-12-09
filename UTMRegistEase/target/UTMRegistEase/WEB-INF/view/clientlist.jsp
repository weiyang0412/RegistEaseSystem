<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home jsp page...</h1>
	<p>Message : ${message}</p>
	<ul>
		<li>Name : ${clients[0].name}</li>
		<li>Name : ${clients[0].weight}</li>
		<li>Name : ${clients[0].height}</li>
		<br />
		<li>Name : ${clients[1].name}</li>
		<li>Name : ${clients[1].weight}</li>
		<li>Name : ${clients[1].height}</li>
		<br />
		<li>Name : ${clients[7].name}</li>
		<li>Name : ${clients[7].weight}</li>
		<li>Name : ${clients[7].height}</li>
		<br />
	</ul>

	<h2>Disp Clients using JSTL</h2>
	<ul>
		<c:forEach var="client" items="${clients}" begin="0" end="7">
			<li>Name: ${client.name}</li>
			<li>Weight: ${client.weight}</li>
			<li>Height: ${client.height}</li>
			<c:if test="${client.height > 1.7 }">
				<li>Tall</li>
			</c:if>
			<c:choose>
				<c:when test="${client.weight < 60}">
					<li>Underweight</li>
				</c:when>
				<c:otherwise>
					<li>Not Under</li>
				</c:otherwise>
			</c:choose>
			<br />
			<br />
		</c:forEach>
	</ul>
</body>
</html>