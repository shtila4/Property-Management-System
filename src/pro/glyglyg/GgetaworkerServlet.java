package pro.glyglyg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Workerimpl;
import pro.pojo.Worker;


@WebServlet("/GgetaoworkerServlet")
public class GgetaworkerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String gid=req.getParameter("gid");
		Worker worker=new Workerimpl().getoneWorker(gid);
		if(worker!=null) {
			req.setAttribute("worker", worker);
  		   req.getRequestDispatcher("guanliyuanguanliyg/Gupdateworker.jsp").forward(req, resp);
		}else {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"No have the worker!\");return true;}</script></body>");
		}
	}


}
