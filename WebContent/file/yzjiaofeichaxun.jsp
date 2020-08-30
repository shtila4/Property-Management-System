<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession sessionq=request.getSession();
System.out.println(sessionq.getAttribute("zhanghao"));
Date d = new Date();
SimpleDateFormat df = new SimpleDateFormat("yyyy");
String now = df.format(d);
sessionq.setAttribute("now", now);	
%>
<h1>缴费查询！</h1>
<hr>
<center>
<a href="../yezhujiaofeichaxunServlet">历史缴费</a><br>
<a href="../yzxinxichaxun1Servlet">近一年缴费</a><br>
</center>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="yztime.jsp" %>
</html>