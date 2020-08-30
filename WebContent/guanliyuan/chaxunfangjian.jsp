<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../chaxunfangjianServlet" method="post">
<h1>请输入楼号和房号</h1>
<hr>
<table>
<tr>
<td>
楼号：

</td>
<td><input type="text" name="louhao" id="louhao" /></td>
<td>
房号:

</td>
<td>
<input type="text" name="fanghao" id="fanghao" /></td>

<td><input type="submit" name="chauxn" id="chaxun" value="查询"/></td>
</tr>








</table>
<%@ include file="time.jsp" %>

</form>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
</html>