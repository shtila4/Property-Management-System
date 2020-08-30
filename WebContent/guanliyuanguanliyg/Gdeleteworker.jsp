<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>请输入员工身份证号</h1>
<hr>
<form action="../GdeleteygServlet" method="post">
<table border="0" align="center">

<tr>
<td>员工身份证号：</td>
<td><input type="text" id="gid" size="16" style="width:130px;" name="gid"/></td>
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

</html>