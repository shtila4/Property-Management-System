package pro.yzservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Fbillimpl;
import pro.pojo.Fbill;

@WebServlet("/yezhujiaofeiServlet")
public class YzjiaofeiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 req.setCharacterEncoding("utf-8");
		int i=0;
		HttpSession session8=req.getSession();
		String yid=(String)session8.getAttribute("zhanghao");
		String type=req.getParameter("type");
		String date=(String)session8.getAttribute("now");
		String money=req.getParameter("money");
		System.out.println(yid);
		System.out.println(type);
		System.out.println(date);
		System.out.println(money);
		System.out.println(date);
		if(req.getParameter("type")==""||req.getParameter("money")=="")
		{
			
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"no can empty!\");return true;}</script></body>");
		}
		else
		{
			String jid=String.valueOf(i);
			Fbill fbill=new Fbillimpl().getonejiaofeijilu(jid);;
			while(fbill!=null) 
			{
		     i++;	
		     jid=String.valueOf(i);
			 fbill=new Fbillimpl().getonejiaofeijilu(jid);
				
			
			}
			 jid=String.valueOf(i);
			System.out.println(jid);
			int j=new Fbillimpl().addFbill(jid, yid, type, date, money);
			resp.sendRedirect("file/yezhujiaofeichenggong.jsp");	
		}
		
	}

	

}
