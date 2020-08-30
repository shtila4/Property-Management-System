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
String gid=(String)request.getAttribute("gid");
HttpSession se=request.getSession();
se.setAttribute("gid", gid);


%>
<h1>添加成功，请为其分配负责区域</h1>
<hr>
<form action="./GfenpeiywServlet" method="post">
<table border=0 align="center" >
           <tr><td align="center">选择</td><td align="center">楼号</td><td align="center">楼名</td> <td align="center">层数</td><td align="center">建成日期</td></tr>
           <c:forEach items="${builds}" var="b">
           <tr>
           <td>
			 <input type=checkbox name="id" value="${b.lid }">
			</td>
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
           <tr>
       <td>
       <input type=submit value="提  交">
       </td>
       </tr>						
</table>
</form>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>

</html>