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
<h1>业主信息单</h1>
<hr>
<a href="guanliyuanguanliyz/Ggetaowner.jsp">修改</a><br>
<a href="guanliyuanguanliyz/Gaddowner.jsp">新建</a><br>
<a href="guanliyuanguanliyz/Gdeleteowner.jsp">删除</a><br>
<hr>
<center>
<table border="1">
           <tr><td>身份证号</td><td>姓名</td> <td>性别</td><td>电话</td><td >入住时间</td><td >楼名</td><td >房号</td></tr>
           <c:forEach items="${owners}" var="o">
           <tr>
              <td>
              <center>${o.yid }</center>
              </td>
              <td>
              ${o.yname }
              </td>
              <td>
              ${o.ysex }
              </td>
              <td >
              ${o.ytel }
              </td>
              <td >
              ${o.ytim }
              </td>
               <td >
              ${o.lname }
              </td>
               <td >
              ${o.fid }
              </td>
              
           </tr>
           </c:forEach>							
</table>
</center>	
<a href="javascript:history.back(-1)">返回上一页</a>				
</body>
<%@ include file="Gyztime.jsp" %>
</html>