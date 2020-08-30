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
<h1>报错信息单</h1>
<hr>
<center>
<form action="./GdeleteServlet" method="post">
<table border="1">
<tr><td>选择</td><td>报错号</td><td>身份证号</td><td>错误位置</td><td>正确应为</td><td>身份</td></tr>
							 <c:forEach items="${baocuos}" var="b">
								<tr>
								<td>
										  <input type=checkbox name="id" value="${b.bid }">
									</td>
									<td>
										${b.bid }
									</td>
									<td >
										${b.id}
									</td>
									<td >
										${b.wz }
									</td>
									<td >
										${b.zq }
									</td>
									<td >
										${b.sf }
									</td>
								</tr>
							</c:forEach>							
						</table>
						<input type="submit" name="shanchu" id="shanchu" value="删除"/>
						</form>
						</center>
						<a href="javascript:history.back(-1)">返回上一页</a>
						
</body>

</html>