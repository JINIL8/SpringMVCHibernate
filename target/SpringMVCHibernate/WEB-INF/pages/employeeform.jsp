<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Employee Form</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Employee</div>
				</div>
				<div class="panel-body">
					<form:form action="saveEmployee" cssClass="form-horizontal" method="post"
						modelAttribute="employee">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="fname" class="col-md-3 control-label">First
								Name</label>
							<div class="col-md-9">
								<form:input path="fname" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="lname" class="col-md-3 control-label">Last
								Name</label>
							<div class="col-md-9">
								<form:input path="lname" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="emailid" class="col-md-3 control-label">Email</label>
							<div class="col-md-9">
								<form:input path="emailid" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="col-md-3 control-label">Address</label>
							<div class="col-md-9">
								<form:input path="address" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="joiningdate" class="col-md-3 control-label">JoiningDate</label>
							<div class="col-md-9">
								<form:input type="date" path="joiningdate" />
							</div>
						</div>
						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
	
	<div align="center">
		<h1>Employee List</h1>
		
		<table border="1">

			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Address</th>
			<th>Joinig Date</th>
			<th>Action</th>

			<c:forEach var="employee" items="${employees}">
				<tr>

					<td>${employee.fname}</td>
					<td>${employee.lname}</td>
					<td>${employee.emailid}</td>
					<td>${employee.address}</td>
					<td>${employee.joiningdate}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteEmployee?did=${employee.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="/SpringMVCHibernate/">here</a>
		</h4>
	</div>
</body>
</html>