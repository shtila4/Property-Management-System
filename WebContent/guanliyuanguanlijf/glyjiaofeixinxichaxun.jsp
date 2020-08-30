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
<h1>个人缴费信息单</h1>
<hr>
<center>
<table border="1">
           <tr><td>缴费单号</td><td>身份证号</td> <td>姓名</td><td>类型</td><td>日期</td><td>电话号</td><td >金额</td><td>单元名</td><td>房号</td></tr>
           <c:forEach items="${fbill}" var="f">
           <tr>
              <td>
              <center>${f.jid }</center>
              </td>
              <td>
              ${f.yid }
              </td>
               <td>
              ${f.yanme }
              </td>
              <td>
              ${f.type }
              </td>
              <td >
              ${f.date }
              </td>
               <td>
              ${f.ytel }
              </td>
              <td >
              ${f.mon }
              </td>
               <td>
              ${f.lname }
              </td>
               <td>
              ${f.fid }
              </td>
           </tr>
           </c:forEach>							
</table>
</center>
<a href="javascript:history.back(-1)">返回上一页</a>					
</body>

</html>