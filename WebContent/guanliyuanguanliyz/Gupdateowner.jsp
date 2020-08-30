<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="pro.pojo.Owner" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 Owner wo=(Owner)request.getAttribute("owner");
String yid=wo.getYid();


HttpSession sessionu=request.getSession();
if(sessionu.getAttribute("yid")==null  ){
	sessionu.setAttribute("yid", yid);
	
}

else
{
	sessionu.setAttribute("yid", yid);
	
}
//session11.setAttribute("lb", b);
String bt=(String)sessionu.getAttribute("yid");

System.out.println(bt);

%>
<h1>请填写修改信息</h1>
<hr>
<form action="./GupdateyzServlet" method="post">
<table>
<tr>
<td>业主编号</td>
<td>
<input type="text" name="yid" id="yid" value="<%=wo.getYid()%>" />
</td>

</tr>
<tr>
<td>业主姓名</td>
<td>
<input type="text" name="yname" id="yname" value="<%=wo.getYname()%>"/>
</td>

</tr>
<tr>
<td>业主性别</td>
<td>
<input type="text" name="ysex" id="ysex" value="<%=wo.getYsex()%>" />
</td>

</tr>
<tr>
<td>业主电话</td>
<td>
<input type="text" name="ytel" id="ytel" value="<%=wo.getYtel()%>"/>
</td>
</tr>
<tr>
<td>入住时间</td>
<td>
<input type="text" name="ytim" id="ytim" value="<%=wo.getYtim()%>"/>
</td>

</tr>
<tr>
<td>业主房号</td>
<td>
<input type="text" name="room" id="room" value="<%=wo.getFid()%>"/>
</td>
<td>
此项不可修改
</td>
</tr>
<tr>
<td>所在楼号</td>
<td>
<input type="text" name="build" id="build" value="<%=wo.getLid()%>"/>
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
<%@ include file="Gyztime.jsp" %>
</html>