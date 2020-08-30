package pro.yzservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Ownerimpl;
import pro.pojo.Owner;
@WebServlet("/yzxinxichaxunServlet")
public class YzServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session2=req.getSession();
		String yid=(String)session2.getAttribute("zhanghao");
		System.out.println(yid);
		Owner owner=new Ownerimpl().getoneOwner(yid);
		if(owner!=null) {
			req.setAttribute("owner", owner);
		    req.getRequestDispatcher("file/yezhuxinxi.jsp").forward(req, resp);
		
		}else {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"No have this owner!\");return true;}</script></body>");
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      super.doPost(req, resp);
			
	}

	

}
