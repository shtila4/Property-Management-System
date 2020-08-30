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
@WebServlet("/yzxinxichaxun1Servlet")
public class YzjiaofeichaxunServlet extends HttpServlet{

	

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			HttpSession sessionw=req.getSession();
			String yid=(String)sessionw.getAttribute("zhanghao");
			
			String time=(String)sessionw.getAttribute("now");
			//String time="2017-01-01 00:00:00";
			String time1="2020";
			System.out.println(yid);
			System.out.println(time);
			
			List<Yzview>fbills=new Fbillimpl().GetamonFbill(yid, time, time1);
			if(fbills.size()>0) {
				
			
			req.setAttribute("fbill", fbills);
		   req.getRequestDispatcher("file/yzyigeyejioafeixinxi.jsp").forward(req, resp);
			}
			else {
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
						"alert(\"no fbill xinxi error!\");return true;}</script></body>");
			}
		
		
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doPost(req, resp);
		}

		
		

	


}
