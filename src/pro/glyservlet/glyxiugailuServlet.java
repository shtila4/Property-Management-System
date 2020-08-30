package pro.glyservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Buildimpl;
import pro.pojo.Build;
@WebServlet("/xiugailoyuServlet")
public class glyxiugailuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String lid=req.getParameter("louhao");
		String lname=req.getParameter("louming");
		
		System.out.println(lname);
		String lnum=req.getParameter("cengshu");
		String ldata=req.getParameter("riqi");
		
		HttpSession session12=req.getSession();
		String id=(String)session12.getAttribute("lb");
		System.out.println(id);
		System.out.println(lid);
		if(lid.equals(id)) 
		{
			int i=new Buildimpl().XiugaiABuild(lid, lname, lnum, ldata,id);
			resp.sendRedirect("guanliyuan/xiugailouyuCG.jsp");
			
			
			
			
			
		}
		else 
		{
			Build bu=new Buildimpl().GetaABuilds(lid);
			if(bu!=null) 
			{
				
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
						"alert(\"The build have exit!\");return true;}</script></body>");
				
			}else 
			{
				
				int i=new Buildimpl().XiugaiABuild(lid, lname, lnum, ldata,id);
				resp.sendRedirect("guanliyuan/xiugailouyuCG.jsp");
				
			}
			
			
		
			
	 }
		
		
	}



}
