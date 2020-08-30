package pro.glyservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Buildimpl;
import pro.pojo.Build;
@WebServlet("/chaxunloyuServlet")
public class glychanxunlyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	            String lid=req.getParameter("louhao");
	            Build build=new Buildimpl().GetaABuilds(lid);
	            if(build!=null) {
	            	req.setAttribute("build", build);
	     		   req.getRequestDispatcher("guanliyuan/louyuxinxixianshi.jsp").forward(req, resp);
	            }
	            else {
	            	resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
	    					"alert(\"No have the build!\");return true;}</script></body>");
	            }
	}

	
}
