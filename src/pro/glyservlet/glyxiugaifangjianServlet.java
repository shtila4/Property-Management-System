package pro.glyservlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Roomimpl;
import pro.pojo.Room;

@WebServlet("/xiugaifangjianServlet")
public class glyxiugaifangjianServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String lid=req.getParameter("louhao");
		String fid=req.getParameter("fanghao");
		

		String yn=req.getParameter("shifo");
		String yare=req.getParameter("mianji");
		String yid=req.getParameter("yezhu");
		
		HttpSession session14=req.getSession();
		
		String a=(String)session14.getAttribute("fid");
		String b=(String)session14.getAttribute("lid");
		System.out.println(a+" "+b);
		if(a.equals(fid) && b.equals(lid)) 
		{
			
			int i=new Roomimpl().XiugaiARoom(lid, fid, yn, yare,yid,a,b);
			resp.sendRedirect("guanliyuan/xiugaifangjianCG.jsp");
			
		}
		else
		{
			
			Room room =new Roomimpl().GetaARoom(lid, fid);
			
			if(room!=null) 
			{
				
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
						"alert(\"The room have exit!\");return true;}</script></body>");
			}
			else 
			{
				int i=new Roomimpl().XiugaiARoom(lid, fid, yn, yare,yid,a,b);
				int j=new Roomimpl().UpdateFid(lid, a, fid);
				resp.sendRedirect("guanliyuan/xiugaifangjianCG.jsp");
			}
			
		}
		
	
	}

	

}
