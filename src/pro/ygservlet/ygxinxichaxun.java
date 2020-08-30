package pro.ygservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Workerimpl;
import pro.pojo.Worker;


@WebServlet("/yuangongxinxiServlet")
public class ygxinxichaxun extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session5=req.getSession();
		String gid=(String)session5.getAttribute("zhanghao");
		System.out.println(gid);
		Worker work=new Workerimpl().getoneWorker(gid);
		if(work!=null) {
			req.setAttribute("work", work);
		    req.getRequestDispatcher("hyuangong/yuangongxinxi.jsp").forward(req, resp);
		
		}else {
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"No have this worker!\");return true;}</script></body>");
			
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
