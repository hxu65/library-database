<%@ page import="com.cs425.web.model.Copies"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Documents Information</title>
</head>
<body>
  
 <% Copies std = (Copies) request.getAttribute("Copy");  
    out.println(std);
    out.println("<html><body><pre>");
  %>
          

</body>
</html>