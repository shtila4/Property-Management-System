package pro.yzservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Fbillimpl;
import pro.pojo.Fbill;
import pro.pojo.Yzview;


@WebServlet("/yezhujiaofeichaxunServlet")
public class yzjfcxServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session3=req.getSession();
		String yid=(String)session3.getAttribute("zhanghao");
		
		List<Yzview>fbills=new Fbillimpl().getoneFbill(yid);
		if(fbills.size()==0) {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"no fbill xinxi error!\");return true;}</script></body>");
		
		
		}
		else {
			req.setAttribute("fbill", fbills);
			   req.getRequestDispatcher("file/yzlishijiaofeixinxi.jsp").forward(req, resp);
		}
	
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	

}
