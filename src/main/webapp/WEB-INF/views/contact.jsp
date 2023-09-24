<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

</head>
<body>
	<h1 class="text-center">Contact Us</h1>
	<div class="container border">
		<div class="alert alert-danger mt-4" role="alert">
			<form:errors path="user.*" />
		</div>
		<form class="p-4" method="post" action="sendmessage">
			<div class="mb-3">
				<label for="userId" class="form-label">Enter ID</label> <input
					type="text" class="form-control" id="userId" name="id">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" name="email">
			</div>
			<div class="mb-3">
				<label for="username" class="form-label">Your Name</label> <input
					type="text" class="form-control" id="username" name="name">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Your
					Password</label> <input type="password" class="form-control"
					id="exampleInputPassword1" name="password">
			</div>
			<div class="mb-3">
				<label for="textMessage" class="form-label">Your Message</label>
				<textarea class="form-control" id="textMessage" name="message"
					rows="10"></textarea>
			</div>
			<div class="mb-3">
				<label for="addressStreet" class="form-label">Your Street</label> <input
					class="form-control" id="addressStreet" name="address.street" />
			</div>
			<div class="mb-3">
				<label for="addressCity" class="form-label">Your City</label> <input
					class="form-control" id="addressCity" name="address.city" />
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>