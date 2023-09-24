<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Image</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1 class="text-center">Upload Image</h1>
		<div class="alert alert-danger mt-4" role="alert">
			${msg }
		</div>
		<form  action="fileupload" method="post"
			enctype="multipart/form-data">
			<div class="mb-3">
				<label for="formFileMultiple" class="form-label">Upload Image</label> 
				<input class="form-control" type="file"
				name="profile"
					id="formFileMultiple" multiple>
			</div>
			<button class="btn btn-outline-success" type="submit">Upload</button>
		</form>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>