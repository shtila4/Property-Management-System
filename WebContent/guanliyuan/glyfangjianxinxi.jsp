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
<%

int count=(int)request.getAttribute("count");
System.out.println(count);
int counts=18-count;

%>
<h1>全区房间信息</h1>
<hr>


  <a href="guanliyuan/chaxunfangjian.jsp">查询房间</a><br>
  <a href="guanliyuan/xiugaifangjian1.jsp">修改房间</a>
  <hr>
  <table>
  <tr>
  <td>非空房间数量：</td>
  <td><input type="text" value="<%=counts %>" ></td>
  <tr>
  <td>剩余房间数量：</td>
  <td><input type="text" value="<%=count %>"></td>
  </tr>
  
  </table>
  <hr>
  <table border="1px" align="center" >
           <tr><td align="center">楼号</td><td align="center">房号</td> <td align="center">是否住人</td><td align="center">面积</td><td align="center">业主</td></tr>
           <c:forEach items="${rooms}" var="r">
           <tr>
              <td align="center">
              <center>${r.lid }</center>
              </td>
              <td align="center">
              ${r.fid }
              </td >
              <td align="center">
              ${r.yn }
              </td>
              <td align="center">
              ${r.yare }
              </td>
            <td align="center">
              ${r.yid }
              </td>
           </tr>
           </c:forEach>							
</table>

	<a href="javascript:history.back(-1)">返回上一页</a>			
</body>

<%@ include file="time.jsp" %>
</html>