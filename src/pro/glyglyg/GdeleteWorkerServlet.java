package pro.glyglyg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Workerimpl;
import pro.pojo.Worker;

@WebServlet("/GdeleteygServlet")
public class GdeleteWorkerServlet extends HttpServlet {

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
			int i=new Workerimpl().DeleteaWorker(gid);
			resp.sendRedirect("guanliyuanguanliyg/GdeleteworkerCG.jsp");
		}
		else {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"No have the Worker!\");return true;}</script></body>");
		}
		
	}

	

}
