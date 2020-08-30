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
<a href="guanliyuanguanliyg/Ggetaworker.jsp">修改</a><br>
<a href="guanliyuanguanliyg/Gaddworker.jsp">新建</a><br>
<a href="guanliyuanguanliyg/Gdeleteworker.jsp">删除</a><br>
<hr>
<center>
<table border="1">
           <tr><td>身份证号</td><td>姓名</td> <td>性别</td><td>电话</td><td >入职时间</td><td >地址</td><td >业务</td><td >工资</td><td >部门</td></tr>
           <c:forEach items="${workers}" var="w">
           <tr>
              <td>
              <center>${w.gid }</center>
              </td>
              <td>
              ${w.gname }
              </td>
              <td>
              ${w.gsex }
              </td>
              <td >
              ${w.gtel }
              </td>
              <td >
              ${w.gdate }
              </td>
               <td >
              ${w.gads }
              </td>
               <td >
              ${w.gword }
              </td>
                <td >
              ${w.seleary }
              </td>
                <td >
              ${w.dno }
              </td>
           </tr>
           </c:forEach>							
</table>
</center>	
<a href="javascript:history.back(-1)">返回上一页</a>				
</body>

</html>