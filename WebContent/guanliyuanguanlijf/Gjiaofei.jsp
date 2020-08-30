<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>请输入业主身份证号！</h1>
<form name="jiaofeiformi" action="../guanliyuanjiaofeichauxnServlet" method="post">
   
      <table>
       <tr>
       <td>业主身份证号：</td>
       <td><input type="text" name="yid" id="yid"></td>
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