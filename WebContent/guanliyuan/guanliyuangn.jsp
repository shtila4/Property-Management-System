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
<center>
<a href="xiaoquguanli.jsp">小区管理</a><br>
<a href="../GygxinxiServlet">员工管理</a><br>
<a href="../GyzxinxiServlet">业主管理</a><br>
<a href="../guanliyuanguanlijf/Gjiaofei.jsp">缴费信息查询</a><br>
<a href="../GbaocuoxinxiServlet">报错信息查询</a>
</center>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="time.jsp" %>
</html>