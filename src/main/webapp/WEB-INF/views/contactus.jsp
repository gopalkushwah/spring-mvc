<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Contact us</h1>
<%
	List<String> contactList =(List<String>)request.getAttribute("contactList");

	for(String list : contactList){
%>

<h1>contact : <%= list %></h1>
<%} %>
</body>
</html>