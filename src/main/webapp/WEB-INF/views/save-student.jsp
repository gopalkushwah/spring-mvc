<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Contact</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
     
  <!-- SweetAlert2 CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.20/dist/sweetalert2.min.css">
    
  </head>
  <body>
    <h1 class="text-center text-danger">Save Student</h1>
    
    <div class="container">
    	<form>
    		<div class="mb-3">
			    <label for="nameInput" class="form-label">Enter Student Name</label>
			    <input type="text" class="form-control" id="nameInput" name="name" >
		  	</div>
		 	<div class="mb-3">
			    <label for="emailInput" class="form-label">Student Email address</label>
			    <input type="email" class="form-control" id="emailInput" name="email">
		  	</div>
		  	<div class="mb-3">
			    <label for="mobileInput" class="form-label">Student Mobile Number</label>
			    <input type="text" class="form-control" id="mobileInput" name="mobile" >
		  	</div>
		  	<div class="mb-3">
			    <label for="addressInput" class="form-label">Student Address</label>
			    <input type="text" class="form-control" id="addressInput" name="address" >
		  	</div>
		  	
		  	<div class="container text-center">
		  		<button type="button" class="btn btn-success" id="saveStudentBtn">Save</button>
			</div>
		  
		</form>
    </div>
    <script>
	    document.addEventListener("DOMContentLoaded", e => {
		    document.getElementById("saveStudentBtn").addEventListener("click", e => {
				const name= document.getElementById("nameInput").value,
				email= document.getElementById("emailInput").value,
				address= document.getElementById("addressInput").value,
				mobile= document.getElementById("mobileInput").value;
				console.log(name);
				console.log(email);
				console.log(address);
				console.log(mobile);
				
			    
		    	const data = {
	                    name: name,
	                    email: email,
	                    address: address,
	                    mobile: mobile
	             };
				
	             const formData = new URLSearchParams();
	             for (const key in data) {
	                 formData.append(key, data[key]);
	             };
		    	console.log(formData);
	   
		    	fetch('student/save-student',{
						method:'POST',
						header : {
							'Content-Type': 'application/x-www-form-urlencoded'
						},
						body : formData
			    })
	            .then(response => response.text())
	            .then(data => {
	            	Swal.fire({
		            		icon : "success",
		            		position : "top",
		            		title : data,
		            		timer : 2000
		            	});
	            })
	            .catch(error => {
	                console.error('Error:', error);
	            });
		    				
		    });	
	    });	
    </script>
    <!-- SweetAlert2 JS -->
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.20/dist/sweetalert2.all.min.js"></script>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>