package pro.yzservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Baocuoimpl;
import pro.pojo.Baocuo;

@WebServlet("/yzbaocuoServlet")
public class yzbaocuoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.setCharacterEncoding("utf-8");
			int i=0;
			HttpSession s5=req.getSession();

			String yid=(String)s5.getAttribute("yid");
			String cuowu=req.getParameter("cuowu");
			String zhengque=req.getParameter("zhengque");
			String shenfen="ҵ��";
			
			if(req.getParameter("cuowu")==""|| req.getParameter("zhengque")=="" )
			{
				
				resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
	 					"alert(\"No xinxi!\");return true;}</script></body>");
			}
			else {
				
				
				String bid=String.valueOf(i);
				Baocuo bo=new Baocuoimpl().GetaBaocuo(bid);
					
				while(bo!=null) {
				     i++;	
				     bid=String.valueOf(i);
				  bo=new Baocuoimpl().GetaBaocuo(bid);
						
					
					}
					 bid=String.valueOf(i);
					System.out.println(bid);
					int j=new Baocuoimpl().insertaBaocuo(bid, yid, cuowu,zhengque,shenfen);
					resp.sendRedirect("file/yzbaocuoCG.jsp");
				
			}
		
				
			
	}

	
}
