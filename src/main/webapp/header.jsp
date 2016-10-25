<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, ie.rccourse.*" %>
<head>
	<link rel="stylesheet" href="static/js/jquery-ui-1.12.1.custom/jquery-ui.min.css">
	<link rel="stylesheet" href="static/font-awesome-4.6.3/css/font-awesome.min.css">
	<link rel="stylesheet" href="static/css/rccourse.css"/>
</head>

<div id="rcHeader">
Header
<% SimpleCms cms = new SimpleCms(); 
ArrayList<String> names = cms.getNames();
%>

<%
for (String name : names){
%>
<a href="<%=name.toLowerCase()%>.jsp"><%=name %></a>
<%
}
%>
</div>