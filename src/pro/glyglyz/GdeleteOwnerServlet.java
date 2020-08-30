package pro.glyglyz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Ownerimpl;
import pro.pojo.Owner;
@WebServlet("/GdeleteyzServlet")
public class GdeleteOwnerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String yid=req.getParameter("yid");
		Owner owner=new Ownerimpl().getoneOwner(yid);
		if(owner!=null) {
			int i=new Ownerimpl().DeleteaOwner(yid);
			resp.sendRedirect("guanliyuanguanliyz/GdeleteownerCG.jsp");
		}else {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"No have the owner!\");return true;}</script></body>");
			
		}
		
	}

	

}
