<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="pro.pojo.Build" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Build bo=(Build)request.getAttribute("build");
String b=bo.getLid();

HttpSession session11=request.getSession();
if(session11.getAttribute("lb")==null){
	session11.setAttribute("lb", b);
}

else
{
	session11.setAttribute("lb", b);	
}
//session11.setAttribute("lb", b);
String bt=(String)session11.getAttribute("lb");
System.out.println(bt);
%>
<h1>请填写修改信息</h1>
<hr>
<form action="./xiugailoyuServlet" method="post">
<table>
<tr>
<td>楼号</td>
<td>
<input type="text" name="louhao" id="louhao" value="<%=bo.getLid()%>"/>
</td>

</tr>
<tr>
<td>楼名</td>
<td>
<input type="text" name="louming" id="louming" value="<%=bo.getLname() %>"/>
</td>
</tr>
<tr>
<td>层数</td>
<td>
<input type="text" name="cengshu" id="cengshu" value="<%=bo.getLnum()%>" />
</td>
</tr>
<tr>
<td>建成日期</td>
<td>
<input type="text" name="riqi" id="riqi" value="<%=bo.getLdata() %>" />
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
<%@ include file="time.jsp" %>
</html>