package pro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guanliyuanlogin")
public class UserGly extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String zhanghao=req.getParameter("zhanghao");
		String password=req.getParameter("password");
		if(zhanghao.equals("88888888")&&password.equals("123456"))
		{
			resp.sendRedirect("guanliyuan/guanliyuangn.jsp");
		}
		else {
			
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"account or password error!\");return true;}</script></body>");
		
			//resp.sendRedirect("guanliyuanlogin.html");
		}
	}

}
