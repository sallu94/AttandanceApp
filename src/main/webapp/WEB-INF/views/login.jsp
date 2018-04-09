<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body class="container"
	style="width: 100%; height: 50%; overflow: auto; margin: auto; position: absolute; top: 0; left: 0; bottom: 0; right: 0;">
	<div class="container col-sm-3 text-center">
		<form:form  action ="${pageContext.request.contextPath}/validate" method="POST" >
			<h1 class="form-signin-heading text-muted">Sign In</h1>
			
			<input type="text"  name = "username" class="form-control"/><br/>
			 <input type="text"  name = "password" class="form-control"/><br/>
			<button class="btn btn-lg btn-primary btn-block" type="submit">
				Sign In</button>
		</form:form>
			<br/>
			<c:if test="${param.error != null}">
			 <div class="alert alert-danger">
    				<strong>Login Failed!</strong>
 			 </div>
		</c:if>
			<c:if test="${param.logout != null}">
			 <div class="alert alert-success">
    				<strong>Logged out Successfully</strong>
 			 </div>
		</c:if>
		

	</div>
</body>
</html>