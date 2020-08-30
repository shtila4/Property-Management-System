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
String y=(String)request.getAttribute("zhanghao");
HttpSession session1=request.getSession();
System.out.println(y);
if(session1.getAttribute("zhanghao")==null){
	
	session1.setAttribute("zhanghao", y);
	
}else{
	session1.setAttribute("zhanghao", null);
	session1.setAttribute("zhanghao", y);
}
%>
<center>
<a href="yzxinxichaxunServlet">信息查询</a><br>
<a href="file/yzjiaofeichaxun.jsp">缴费查询</a><br>
<a href="file/yezhujiaofei.jsp">物业缴费</a><br>
</center>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="yztime.jsp" %>
</html>