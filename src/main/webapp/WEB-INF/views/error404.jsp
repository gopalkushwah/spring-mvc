<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
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
	<div class="row">
		<div class="col-sm-12 col-md-4 col-lg-5 offset-md-4 offset-lg-4">
			<div class="card mt-5 p-5 container text-center">
				<h1>Something Went Wrong!</h1>
				<h2>${msg}</h2>
				<p>
					<b>Please Try again later</b>
				</p>
				<div class="row">
					<div class="col">
						<a href="/springmvc/">Home</a>
					</div>
					<div class="col">
						<a href="/springmvc/contact">Contact</a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>