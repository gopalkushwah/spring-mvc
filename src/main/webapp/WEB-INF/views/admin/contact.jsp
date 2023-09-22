<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Contact</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
  <h1>${discription }</h1>
<h1>${Header }</h1>
  
    <h1 class="text-center">Welcome to Admin Contact</h1>
    <div class="container border-4 mt-5">
	    <form action="sendmessage" method="post" class="p-4">
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Email address</label>
			    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
			  </div>
			  <div class="mb-3">
			    <label for="nameInput" class="form-label">Your Name</label>
			    <input type="text" class="form-control" id="nameInput" name="name">
			  </div>
			  <div class="mb-3">
			    <label for="passwordInput" class="form-label">Your Password</label>
			    <input type="password" class="form-control" id="passwordInput" name="password" >
			  </div>
			  <button type="submit" class="btn btn-primary">Send Message</button>
		</form>
    </div>
    
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>