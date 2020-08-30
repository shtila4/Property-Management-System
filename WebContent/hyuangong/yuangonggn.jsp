<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>功能选择</h1>
<hr>
<%
String w=(String)request.getAttribute("zhanghao");
HttpSession session4=request.getSession();
System.out.println(w);
if(session4.getAttribute("zhanghao")==null){
	
	session4.setAttribute("zhanghao", w);
	
}else{
	session4.setAttribute("zhanghao", null);
	session4.setAttribute("zhanghao", w);
}
%>
<center>
<a href="yuangongxinxiServlet">信息查询</a><br>
<a href="yuangongyewuquyuServlet">区域查询</a><br>
</center>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="ygtime.jsp" %>
</html>