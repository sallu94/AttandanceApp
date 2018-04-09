<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" >
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" ></script>
<title>Attendance Management System | Add new Student</title>
</head>
<body>
<div class="container col-sm-6 text-center"
	style="width: 100%; height: 80%; overflow: auto; margin: auto; position: absolute; top: 0; left: 0; bottom: 0; right: 0;">
<form:form action="openAccount" method="post" modelAttribute="account">
	 First Name:<form:input path="firstNameOfStudent" class="form-control" /><form:errors path="firstNameOfStudent"/><br/>
	Last Name:<form:input path="holderName" class="form-control"/><form:errors path="holderName" class="has-error"/><br/>
	Enter Balance:<form:input path="accountBalance" class="form-control"/><form:errors path="accountBalance" class="error"/><br/>
	Select Account Type: <form:select path="accountType" items="${accountTypes}" class="form-control"/><br/>
	Enter Date:<form:input path="openingDate" class="form-control"/><form:errors path="openingDate" class="error"/><br/>
	Select Account Branch: <form:select path="branch" items="${branches}" class="form-control"/><br/>
	<input type ="submit" class="btn btn-lg btn-primary btn-block" />
</form:form>
</div>


</body>
</html>