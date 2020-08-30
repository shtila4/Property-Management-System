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
<%
HttpSession s0=request.getSession();
String gid=(String )s0.getAttribute("gid");
System.out.println(gid);



%>
<h1>请填写错误信息</h1>
<hr>
<form action="../ygbaocuoServlet" method="post">
<table>
 <tr>
       <td>错误位置：</td>
       <td><input type="text" name="cuowu" id="cuowu"></td>
       </tr>
        <td>正确应为：</td>
       <td><input type="text" name="zhengque" id="zhengque"></td>
       </tr>
       <tr>
       <td>
       <input type=submit value="提  交">
       </td>
       </tr>



</table>


</form>
<a href="javascript:history.back(-1)">返回上一页</a>
</body>
</html>