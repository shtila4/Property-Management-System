package pro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Userimpl;
import pro.pojo.User;
@WebServlet("/yuangonglogin")
public class UserYg extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String zhanghao=req.getParameter("zhanghao");
		String password=req.getParameter("password");
		String identity="Ա��";
	
         User user = new Userimpl().getUser(zhanghao,password,identity);
		
		if(user!=null) {

			req.setAttribute("zhanghao", zhanghao);
		    req.getRequestDispatcher("hyuangong/yuangonggn.jsp").forward(req, resp);
			//resp.sendRedirect("file/yuangonggn.jsp");
			
		}else {
			
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"account or password error!\");return true;}</script></body>");
			
		}
	

	}

	

}
