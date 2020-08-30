package pro.glyglyg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Workerimpl;
import pro.pojo.Worker;



@WebServlet("/GupdateygServlet")
public class GupdateworkerServlet extends HttpServlet{

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
		
		HttpSession sessionb=req.getSession();
		String id=(String)sessionb.getAttribute("gid");
		System.out.println(id);
		System.out.println(gid);
		if(gid.equals(id)) 
		{
			
			int i=new Workerimpl().UpdateaWorker(gid, gname, gsex, gtel, gdate, gads, gword, seleary, dno, id);
			resp.sendRedirect("guanliyuanguanliyg/GupdateygCG.jsp");
			
			
			
			
			
		}
		else 
		{
			Worker wo=new Workerimpl().getoneWorker(gid);
			if(wo!=null) 
			{
				
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
						"alert(\"The worker have exit!\");return true;}</script></body>");
				
			}else 
			{
				
				
				int i=new Workerimpl().UpdateaWorker(gid, gname, gsex, gtel, gdate, gads, gword, seleary, dno, id);
				resp.sendRedirect("guanliyuanguanliyg/GupdateygCG.jsp");
				
			}
			
			
		
			
	 }
	}

	

}
