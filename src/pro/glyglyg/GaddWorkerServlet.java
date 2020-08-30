package pro.glyglyg;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Buildimpl;
import pro.dao.impl.Departmentimpl;
import pro.dao.impl.Workerimpl;
import pro.pojo.Build;
import pro.pojo.Department;
import pro.pojo.Worker;
@WebServlet("/GaddygServlet")
public class GaddWorkerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String gid=req.getParameter("gid");
		String gname=req.getParameter("gname");
		String gsex=req.getParameter("gsex");
		String gtel=req.getParameter("gtel");
		String gdate=req.getParameter("gtim");
		String gads=req.getParameter("gads");
		String gword=req.getParameter("gyw");
		String seleary=req.getParameter("ggz");
		String dno=req.getParameter("dno");
		if(req.getParameter("gid")==""||req.getParameter("gname")==""||req.getParameter("gsex")==""||req.getParameter("gtel")==""||
				req.getParameter("gtim")==""||req.getParameter("gads")==""||req.getParameter("gyw")==""||req.getParameter("ggz")==""||
				req.getParameter("dno")=="") {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"no can empty!\");return true;}</script></body>");
		}
		else {
			
			Worker worker=new Workerimpl().getoneWorker(gid);
			if(worker!=null) {
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
						"alert(\"The worker have exit!\");return true;}</script></body>");
			}
			else {
				Department department=new Departmentimpl().GetaDepartment(dno);
				if(department!=null) {
					
					int i=new Workerimpl().Addaworker(gid, gname, gsex, gtel, gdate, gads, gword, seleary, dno);
					List<Build>builds=new Buildimpl().GetallBuilds();
					req.setAttribute("builds", builds);
					req.setAttribute("gid", gid);
					   req.getRequestDispatcher("guanliyuanguanliyg/GaddworkerCG.jsp").forward(req, resp);
					//resp.sendRedirect("guanliyuanguanliyg/GaddworkerCG.jsp");
					
				}
				else {
					
					
					 resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
								"alert(\"No have the department!\");return true;}</script></body>");
				}
				
				
			}
		}
		
	}

	

}
