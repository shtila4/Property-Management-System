package pro.gilglbaocuo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Baocuoimpl;
import pro.pojo.Baocuo;



@WebServlet("/GbaocuoxinxiServlet")
public class GbaocuoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Baocuo>baocuos=new Baocuoimpl().GetallBaocuos();
		if(baocuos.size()==0) {
			
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
 					"alert(\"No have the baocuoyewu!\");return true;}</script></body>");
		}
		else {
		req.setAttribute("baocuos", baocuos);
		   req.getRequestDispatcher("guanliyuanguanlibaocuo/Gbaocuoxinxi.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
