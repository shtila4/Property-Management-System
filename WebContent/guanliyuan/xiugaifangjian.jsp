<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="pro.pojo.Room" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 Room ro=(Room)request.getAttribute("room");
String l=ro.getLid();
String f=ro.getFid();

HttpSession session13=request.getSession();
if(session13.getAttribute("fid")==null || session13.getAttribute("lid")==null ){
	session13.setAttribute("fid", f);
	session13.setAttribute("lid", l);
}

else
{
	session13.setAttribute("fid", f);
	session13.setAttribute("lid", l);
}
//session11.setAttribute("lb", b);
String bt=(String)session13.getAttribute("fid");
String bt1=(String)session13.getAttribute("lid");
System.out.println(bt);
System.out.println(bt1);
%>
<h1>请填写修改信息</h1>
<hr>
<form action="./xiugaifangjianServlet" method="post">
<table>
<tr>
<td>楼号</td>
<td>
<input type="text" name="louhao" id="louhao" value="<%=ro.getLid()%>" />
</td>
<td>
此项不可修改
</td>
</tr>
<tr>
<td>房号</td>
<td>
<input type="text" name="fanghao" id="fanghao" value="<%=ro.getFid()%>"/>
</td>

</tr>
<tr>
<td>是否住人</td>
<td>
<input type="text" name="shifo" id="shifo" value="<%=ro.getYn()%>" />
</td>
<td>
此项不可修改
</td>
</tr>
<tr>
<td>面积</td>
<td>
<input type="text" name="mianji" id="mianji" value="<%=ro.getYare()%>"/>
</td>
</tr>
<tr>
<td>业主</td>
<td>
<input type="text" name="yezhu" id="yezhu" value="<%=ro.getYid()%>"/>
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
<%@ include file="time.jsp" %>
</html>