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

<%
 Worker w=(Worker)request.getAttribute("worker");
String gid=w.getGid();


HttpSession sessionm=request.getSession();
if(sessionm.getAttribute("gid")==null  ){
	sessionm.setAttribute("gid", gid);
	
}

else
{
	sessionm.setAttribute("gid", gid);
	
}
//session11.setAttribute("lb", b);
String bt=(String)sessionm.getAttribute("gid");

System.out.println(bt);

%>
<h1>请填写修改信息</h1>
<hr>
<form action="./GupdateygServlet" method="post">
<table>
<tr>
<td>员工编号</td>
<td>
<input type="text" name="gid" id="gid" value="<%=w.getGid()%>" />
</td>

</tr>
<tr>
<td>员工姓名</td>
<td>
<input type="text" name="gname" id="gname" value="<%=w.getGname()%>"/>
</td>

</tr>
<tr>
<td>员工性别</td>
<td>
<input type="text" name="gsex" id="gsex" value="<%=w.getGsex()%>" />
</td>

</tr>
<tr>
<td>员工电话</td>
<td>
<input type="text" name="gtel" id="gtel" value="<%=w.getGtel()%>"/>
</td>
</tr>
<tr>
<td>入职时间</td>
<td>
<input type="text" name="gtim" id="gtim" value="<%=w.getGdate()%>"/>
</td>

</tr>
<tr>
<td>员工地址</td>
<td>
<input type="text" name="gads" id="gads" value="<%=w.getGads()%>"/>
</td>

</tr>
<tr>
<td>负责业务</td>
<td>
<input type="text" name="gyw" id="gyw" value="<%=w.getGword()%>"/>
</td>
<tr>
<td>员工工资</td>
<td>
<input type="text" name="ggz" id="ggz" value="<%=w.getSeleary()%>"/>
</td>
</tr>
<tr>
<td>所属部门</td>
<td>
<input type="text" name="dno" id="dno" value="<%=w.getDno()%>"/>
</td>
<td>
此项不可修改
</td>
</tr>
<tr>
<td align="center">
<input type="submit"  value="修改"/>
<input type="reset"  value="重填"/>
</td>
</tr>

</table>
</form>



<a href="javascript:history.back(-1)">返回上一页</a>
</body>

</html>