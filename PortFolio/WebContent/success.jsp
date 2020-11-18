<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공의 냄새가 난다.</title>
<%
String id = (String)request.getAttribute("SessionID");
session.setAttribute("SessionID",id);
%>
</head>
<body>
<%= session.getAttribute("SessionID") %> 로그인 떵공~!
</body>
</html>