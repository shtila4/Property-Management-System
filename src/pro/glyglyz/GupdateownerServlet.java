package pro.glyglyz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Ownerimpl;
import pro.pojo.Owner;


@WebServlet("/GupdateyzServlet")
public class GupdateownerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String yid=req.getParameter("yid");
		String yname=req.getParameter("yname");
		
		
		String ysex=req.getParameter("ysex");
		String ytel=req.getParameter("ytel");
		String ytim=req.getParameter("ytim");
		String fid=req.getParameter("room");
		String lid=req.getParameter("build");
		
		HttpSession sessionp=req.getSession();
		String id=(String)sessionp.getAttribute("yid");
		System.out.println(id);
		System.out.println(yid);
		if(yid.equals(id)) 
		{
			int i=new Ownerimpl().UpdateaOwner(yid, yname, ysex, ytel, ytim, fid, lid, id);
			
			resp.sendRedirect("guanliyuanguanliyz/GupdateCG.jsp");
			
			
			
			
			
		}
		else 
		{
			Owner wo=new Ownerimpl().getoneOwner(yid);
			if(wo!=null) 
			{
				
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
						"alert(\"The owner have exit!\");return true;}</script></body>");
				
			}else 
			{
				
				int i=new Ownerimpl().UpdateaOwner(yid, yname, ysex, ytel, ytim, fid, lid, id);
				
				resp.sendRedirect("guanliyuanguanliyz/GupdateCG.jsp");
				
			}
			
			
		
			
	 }
	}

	

}
