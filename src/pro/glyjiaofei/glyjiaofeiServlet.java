package pro.glyjiaofei;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Fbillimpl;

import pro.pojo.FandOandB;
import pro.pojo.Fbill;
@WebServlet("/guanliyuanjiaofeichauxnServlet")
public class glyjiaofeiServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String yid=req.getParameter("yid");
		List<FandOandB>fbills=new Fbillimpl().GetoneFbill(yid);
		
		if(fbills.size()>0) {
		req.setAttribute("fbill", fbills);
	   req.getRequestDispatcher("guanliyuanguanlijf/glyjiaofeixinxichaxun.jsp").forward(req, resp);
		}else {
			
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"no fbill xinxi error!\");return true;}</script></body>");
			
		}
		
	}

	

}
