<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="UTF-8">
<title>JSP Directives</title>
</head>
<body>

This is content from the main file.
<%@ include file="included.jsp" %>
<hr>
Example of using JSTLtaglibs for formatting output<br>
<p>
        Currency = <fmt:formatNumbervalue = "145" type = "currency"/>
<p>
<p>
