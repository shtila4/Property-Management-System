package pro.ygservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Defendimpl;

import pro.pojo.Gview;


@WebServlet("/yuangongyewuquyuServlet")
public class ygdefendchaxun extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session6=req.getSession();
		String gid=(String)session6.getAttribute("zhanghao");
		List<Gview>defends=new Defendimpl().getoneDefend(gid);
		if(defends.size()>1) {
			
		
		req.setAttribute("defend", defends);
	   req.getRequestDispatcher("hyuangong/yuangongdefchaxun.jsp").forward(req, resp);
		}
		else {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"no defend xinxi error!\");return true;}</script></body>");
		}
	
	
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
