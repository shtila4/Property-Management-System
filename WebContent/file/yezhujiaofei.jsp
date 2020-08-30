<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>缴费</h1>

<%
HttpSession session7=request.getSession();
System.out.println(session7.getAttribute("zhanghao"));
Date d = new Date();
SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String now = df.format(d);
session.setAttribute("now", now);	
%>
	

<form name="jiaofeiform" action="../yezhujiaofeiServlet" method="post">
     <input type=radio name=type value="水费" checked>水费
      <input type=radio name=type value="电费">电费
      <input type=radio name=type value="清洁费">清洁费
      <input type=radio name=type value="管理费">管理费
      <hr> 
      <table>
       <tr>
       <td>金额：</td>
       <td><input type="text" name="money" id="money"></td>
       </tr>
       <tr>
       <td>
       <input type=submit value="提  交">
       </td>
       </tr>
      </table>
</form>

<a href="javascript:history.back(-1)">返回上一页</a>
		
</body>
<%@ include file="yztime.jsp" %>
</html>