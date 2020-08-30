<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>全区楼宇信息</h1>
<hr>


 

  <a href="guanliyuan/chaxunloyu.jsp">查询楼宇</a><br>
  <a href="guanliyuan/xiugailouyu.jsp">修改楼宇</a>
  <hr>
  <table border=0 align="center" >
           <tr><td align="center">楼号</td><td align="center">楼名</td> <td align="center">层数</td><td align="center">建成日期</td></tr>
           <c:forEach items="${builds}" var="b">
           <tr>
              <td align="center">
              <center>${b.lid }</center>
              </td>
              <td align="center">
              ${b.lname }
              </td >
              <td align="center">
              ${b.lnum }
              </td>
              <td align="center">
              ${b.ldata }
              </td>
            
           </tr>
           </c:forEach>							
</table>

<a href="javascript:history.back(-1)">返回上一页</a>				
</body>
<%@ include file="time.jsp" %>
</html>