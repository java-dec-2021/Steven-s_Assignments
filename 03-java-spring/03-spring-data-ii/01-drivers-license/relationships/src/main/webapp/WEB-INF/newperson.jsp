<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Relationships</title>
</head>
<body>
	<div class="container">
		<h2>New Person</h2>
		<form:form action="/" method="POST" modelAttribute="person">
			<div class="form-group">
		        <form:label path="firstName">First Name</form:label>
		        <form:errors path="firstName"/>
		        <form:input class="form-control" path="firstName"/>
		    </div>
		    <div class="form-group">
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:input class="form-control" path="lastName"/>
		    </div>
		    <button>Add Person</button>
		</form:form>
	</div>
</body>
</html>