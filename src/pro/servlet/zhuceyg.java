package pro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Userimpl;
import pro.pojo.User;
@WebServlet("/zhucec")
public class zhuceyg extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String zhanghao=req.getParameter("zhanghao");
		String password=req.getParameter("pass1");
		String identity="Ô±¹¤";
		if(req.getParameter("zhanghao")==null || req.getParameter("pass1")==null)
		{
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"NO can null!\");return true;}</script></body>");
			
			
		}
		else {
			 User user = new Userimpl().getcUser(zhanghao);
				
				if(user!=null) {
					
					resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
							"alert(\"Registration failed!\");return true;}</script></body>");
					
				}else {
				int i=	new Userimpl().addUser(zhanghao, password, identity);
					
					resp.sendRedirect("zhucechengong1.html");
				}
		}
         
	

	}

	

}
