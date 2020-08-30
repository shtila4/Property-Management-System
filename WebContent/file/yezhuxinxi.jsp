<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="pro.pojo.Owner" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

Owner ou=(Owner)request.getAttribute("owner");
String yid=ou.getYid();
HttpSession s3=request.getSession();

if(s3.getAttribute("yid")==null){
	
	s3.setAttribute("yid", yid);
	
}else{
	s3.setAttribute("yid", null);
	s3.setAttribute("yid", yid);
}
%>
<h1>个人信息</h1>
<hr>
<table align="center" border="1px">
		
				<tr>
					<td>身份证号</td><td>姓名</td> <td>性别</td><td><center>电话号</center></td><td>入住时间</td><td>房间号</td><td>小区号</td>
				</tr>
				<tr>
				<td><center><%=ou.getYid()%></center></td>
					<td><%=ou.getYname() %></td>
					<td><%=ou.getYsex() %></td>
					<td><%=ou.getYtel() %></td>
					<td><%=ou.getYtim() %></td>
					<td><center><%=ou.getFid() %></center></td>
					<td><center><%=ou.getLid()%></center></td>
					</tr>
		</table>
		<center><a href="file/yzxinxibaocuo.jsp" ><h2>信息报错</h2></a></center>
       
</body>
<a href="javascript:history.back(-1)">返回上一页</a>
<%@ include file="yztime.jsp" %>
</html>