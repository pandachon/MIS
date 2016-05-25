<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="Dao.guitardao" %>
    <%@page import="DB.DbUtil" %>
    <%@page import="SearchMethod.guitarsearch" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>吉他搜索结果</title>
</head>
<body>
<table border=3>
<c:forEach var="list" items="${ guitarsearch.Query(param.keyword)}">
	<tr>
		<td>${list.serialNumber}</td>
		<td>${list.price}</td>
		<td>${list.builder}</td>
		<td>${list.model}</td>
		<td>${list.type}</td>
		<td>${list.backWood}</td>
		<td>${list.topWood}</td>
</tr>
</c:forEach>
</table>
</body>
</html>