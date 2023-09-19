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
<h1>Services</h1>
<%
	List<String> serviceList =(List<String>)request.getAttribute("serviceList");

	for(String list : serviceList){
%>

<h1>Service : <%= list %></h1>
<%} %>
</body>
</html>