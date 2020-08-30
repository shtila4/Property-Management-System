package pro.glyservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Roomimpl;
import pro.pojo.Room;



@WebServlet("/chaxunfangjianServlet")
public class giychaxunfangjianServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String lid=req.getParameter("louhao");
		 String fid=req.getParameter("fanghao");
         Room room=new Roomimpl().GetaARoom(lid, fid);

         if(room!=null) {
         	req.setAttribute("room", room);
  		   req.getRequestDispatcher("guanliyuan/fangjianxinxixianshi.jsp").forward(req, resp);
         }
         else {
         	resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
 					"alert(\"No have the room!\");return true;}</script></body>");
         }
	}

	
}
