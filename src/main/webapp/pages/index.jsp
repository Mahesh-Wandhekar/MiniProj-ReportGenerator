<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class='container'>
		<h1 class="pt=3 pb=3 mt-3 bg-danger text-white">Report
			Application</h1>
		<form:form modelAttribute="search" action="search" method="post"
			class="form-control mt-3">
			<table class="table">
				<tr>
					<td>Plan Name :</td>
					<td><form:select path="planName">
							<form:option value="">-select-</form:option>
							<form:options items='${plan}' />

						</form:select></td>
					<td>Status Name :</td>
					<td><form:select path="planStatus">
							<form:option value="">-select-</form:option>
							<form:options items='${status}' />

						</form:select></td>
					<td>Gender :</td>
					<td><form:select path="gender">
							<form:option value="">-select-</form:option>
							<form:option value="Male">Male</form:option>
							<form:option value="Fe-Male">Female</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>Start Date</td>
					<td><input type="date" path="startDate"></td>
					<td>End Date</td>
					<td><input type="date" path="endDate"></td>
				</tr>
			</table>
			<center>
				<a href="/" class="btn btn-secondary me-4">Reset</a>
				<input type="submit" value="search" class="btn btn-primary" />
			</center>
		</form:form>
		<hr />
		<table class='table table-striped'>
			<thead>
				<tr>
					<td class="fw-bold">Id</td>
					<td class="fw-bold">Name</td>
					<td class="fw-bold">Gender</td>
					<td class="fw-bold">Plan</td>
					<td class="fw-bold">Status</td>
					<td class="fw-bold">StartDate</td>
					<td class="fw-bold">EndDate</td>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${plans}" var="plan">
					<tr>
						<td>${plan.citizenId}</td>
						<td>${plan.citizenName}</td>
						<td>${plan.gender}</td>
						<td>${plan.planName}</td>
						<td>${plan.planStatus}</td>
						<td>${plan.startDate}</td>
						<td>${plan.endDate}</td>
					</tr>

				</c:forEach>
				<tr>

					<c:if test="${empty plans}">
					<td colspan="7" style="text-align: center ">Record Not Found</td>

					</c:if>

				</tr>
			</tbody>
		</table>
		<hr />
		<p>${msg}</p>
		<strong class="me-4"> Export :</strong> <a href="excel" class="btn btn-warning me-4">Excel With Email</a> <a href="pdf" class="btn btn-info">PDF With Email</a>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
