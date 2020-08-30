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
<h1>个人负责区信息单</h1>
<hr>
<center>
<table border="1">
<tr><td>员工身份证号</td><td>员工姓名</td><td>员工业务</td><td>楼号</td></tr>
							 <c:forEach items="${defend}" var="d">
								<tr>
									<td>
										${d.gid }
									</td>
									<td >
										${d.gname }
									</td>
									<td >
										${d.gword }
									</td>
									<td >
										${d.lid }
									</td>
									
								</tr>
							</c:forEach>							
						</table>
						</center>
						<a href="javascript:history.back(-1)">返回上一页</a>
						
</body>
<%@ include file="ygtime.jsp" %>
</html>