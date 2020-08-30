<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="pro.pojo.Build" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Build bo=(Build)request.getAttribute("build");

%>
<h1>楼宇信息</h1>
<hr>
<table align="center" border="1px">
		
				<tr>
					<td>楼号</td><td>楼名</td> <td>层数</td><td><center>建成日期</center></td>
					
				</tr>
				<tr>
				<td><center><%=bo.getLid()%></center></td>
					<td><%=bo.getLname() %></td>
					<td><%=bo.getLnum()%></td>
					<td><%=bo.getLdata() %></td>
					
					</tr>
		</table>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="time.jsp" %>
</html>