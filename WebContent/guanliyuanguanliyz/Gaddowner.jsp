<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>请填写业主信息</h1>
<hr>
<form action="../GaddyzServlet" method="post">
<table border="0" align="center">

<tr>
<td>业主编号：</td>
<td><input type="text" id="yid" size="16" style="width:130px;" name="yid"/></td>
</tr>
<tr>
<td>业主姓名：</td>
<td><input type="text" id="name" size="16" style="width:130px;" name="name"/></td>
</tr>
<tr>
<td>业主性别：</td>
<td><input type="text" id="sex" size="16" style="width:130px;" name="sex"/></td>
</tr>
<tr>
<td>业主电话：</td>
<td><input type="text" id="tel" size="16" style="width:130px;" name="tel"/></td>
</tr>
<tr>
<td>入住时间：</td>
<td><input type="text" id="time" size="16" style="width:130px;" name="time"/></td>
</tr>
<tr>
<td>房间编号：</td>
<td><input type="text" id="room" size="16" style="width:130px;" name="room"/></td>
</tr>
<tr>
<td>楼宇编号：</td>
<td><input type="text" id="build" size="16" style="width:130px;" name="build"/></td>
</tr>
<tr>
<td colspan=2>
<center>
    <input name="submit" type="submit" value="提交" />
    <input type="reset" value="重填">
    
    </center>
    
</td>
</tr>






</table>


</form>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
<%@ include file="Gyztime.jsp" %>
</html>