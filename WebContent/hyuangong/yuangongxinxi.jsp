<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="pro.pojo.Worker" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Worker  wo=(Worker)request.getAttribute("work");
String gid=wo.getGid();
HttpSession s1=request.getSession();

if(s1.getAttribute("gid")==null){
	
	s1.setAttribute("gid", gid);
	
}else{
	s1.setAttribute("gid", null);
	s1.setAttribute("gid", gid);
}

%>
<h1>个人信息</h1>
<hr>
<table align="center" border="1px">
		
				<tr>
					<td>身份证号</td><td>姓名</td> <td>性别</td><td><center>电话号</center></td><td>入职时间</td><td>住址</td><td>项目</td>
					<td>薪水</td><td>部门号</td>
				</tr>
				<tr>
				<td><center><%=wo.getGid()%></center></td>
					<td><%=wo.getGname() %></td>
					<td><%=wo.getGsex()%></td>
					<td><%=wo.getGtel() %></td>
					<td><center><%=wo.getGdate() %></center></td>
					<td><%=wo.getGads() %></td>	
					<td><center><%=wo.getGword()%></center></td>
					<td><center><%=wo.getSeleary() %></center></td>
					<td><center><%=wo.getDno()%></center></td>
					</tr>
		</table>
<center><a href="hyuangong/ygxinxibaocuo.jsp" ><h2>信息报错</h2></a></center>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="ygtime.jsp" %>
</html>