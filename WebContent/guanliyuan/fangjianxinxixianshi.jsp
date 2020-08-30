<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="pro.pojo.Room" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Room ro=(Room)request.getAttribute("room");

%>
<h1>房间信息</h1>
<hr>
<table align="center" border="1px">
		
				<tr>
					<td>楼号</td><td>房名</td> <td>是否住人</td><td><center>面积</center></td><td><center>业主</center></td>
					
				</tr>
				<tr>
				<td><center><%=ro.getLid()%></center></td>
					<td><%=ro.getFid() %></td>
					<td><center><%=ro.getYn()%></center></td>
					<td><%=ro.getYare() %></td>
						<td><%=ro.getYid() %></td>
					</tr>
		</table>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>

<%@ include file="time.jsp" %>

</html>