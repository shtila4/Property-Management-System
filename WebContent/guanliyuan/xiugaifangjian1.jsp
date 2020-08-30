<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../chaxunfangjian1Servlet" method="post">
<h1>请输入楼号、房号</h1>
<hr>
<table>
<tr>
<td>
<input type="text" name="louhao" id="louhao" />
</td>
<td>
<input type="text" name="fanghao" id="fanghao" />
</td>
<td><input type="submit" name="修改 " id="修改" value="修改"/></td>
</tr>








</table>


</form>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="time.jsp" %>
</html>