<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Show</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 class="text-center text-danger">Show all Student</h1>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">id</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Mobile</th>
					<th scope="col">Address</th>
				</tr>
			</thead>
			<tbody id="table-body">	
			</tbody>
		</table>
		<a href="/spring-mvc-practice">Home</a>
	</div>
	<script>
		document.addEventListener("DOMContentLoaded",e => {
			const tablebody = document.getElementById("table-body");
			fetch("student/get-all-student",{
				method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                }
			}).then(response => response.json())
			.then(data => {
				data.forEach(student => {
					tablebody.innerHTML += "<tr><th>"+student.id+"</th><td>"+student.name+"</td><td>"+student.email+"</td><td>"+student.mobile+"</td><td>"+student.address+"</td><td><a href=student/update-student?id="+student.id+">Update</a></td><td><a href=student/delete-student?id="+student.id+">Delete</a></td></tr>";
				})
				
			}).catch(error => console.log(error));
		});
		
  	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>