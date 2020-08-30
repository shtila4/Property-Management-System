<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="pro.pojo.Worker" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>请填写员工信息</h1>
<hr>
<form action="../GaddygServlet" method="post">
<table>
<tr>
<td>员工编号</td>
<td>
<input type="text" name="gid" id="gid" size="16" style="width:130px;" />
</td>

</tr>
<tr>
<td>员工姓名</td>
<td>
<input type="text" name="gname" id="gname" size="16" style="width:130px;"/>
</td>

</tr>
<tr>
<td>员工性别</td>
<td>
<input type="text" name="gsex" id="gsex" size="16" style="width:130px;" />
</td>

</tr>
<tr>
<td>员工电话</td>
<td>
<input type="text" name="gtel" id="gtel" size="16" style="width:130px;"/>
</td>
</tr>
<tr>
<td>入职时间</td>
<td>
<input type="text" name="gtim" id="gtim" size="16" style="width:130px;"/>
</td>

</tr>
<tr>
<td>员工地址</td>
<td>
<input type="text" name="gads" id="gads"size="16" style="width:130px;"/>
</td>

</tr>
<tr>
<td>负责业务</td>
<td>
<input type="text" name="gyw" id="gyw" size="16" style="width:130px;"/>
</td>
<tr>
<td>员工工资</td>
<td>
<input type="text" name="ggz" id="ggz" size="16" style="width:130px;"/>
</td>
</tr>
<tr>
<td>所属部门</td>
<td>
<input type="text" name="dno" id="dno"size="16" style="width:130px;"/>
</td>

</tr>
<tr>
<td align="center">
<input type="submit"  value="添加"/>
<input type="reset"  value="重填"/>
</td>
</tr>

</table>
</form>


<a href="javascript:history.back(-1)">返回上一页</a>

</body>

</html>