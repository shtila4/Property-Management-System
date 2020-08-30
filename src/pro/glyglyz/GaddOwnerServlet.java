package pro.glyglyz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Ownerimpl;
import pro.dao.impl.Roomimpl;
import pro.pojo.Owner;
import pro.pojo.Room;
@WebServlet("/GaddyzServlet")
public class GaddOwnerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.setCharacterEncoding("utf-8");
		String yid=req.getParameter("yid");
		String yname=req.getParameter("name");
		String ysex=req.getParameter("sex");
		String ytel=req.getParameter("tel");
		String ytim=req.getParameter("time");
		String fid=req.getParameter("room");
		String lid=req.getParameter("build");
		if(req.getParameter("yid")==""||req.getParameter("name")==""||req.getParameter("sex")==""||
				req.getParameter("tel")==""||req.getParameter("time")==""||req.getParameter("room")==""||req.getParameter("build")=="")
		{
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"no can empty!\");return true;}</script></body>");
		}
		else
		{
		    Owner owner=new Ownerimpl().getoneOwner(yid);
		   Room room=new Roomimpl().GetaARoom(lid, fid);
		
		   if(owner!=null) 
		   {
			
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"The owner have exit!\");return true;}</script></body>");
			
		   }
		   else 
		  {
		      if(room!=null) 
		      {
		    	  String yn=room.getYn();
				  System.out.println(yn);
			     if(yn.equals("·ñ"))
			     {
				    System.out.println(yid);
				    int i=new Ownerimpl().AddaOwner(yid, yname, ysex, ytel, ytim, fid, lid); 
				    resp.sendRedirect("guanliyuanguanliyz/GaddownerCG.jsp");
			     }
			     else
			     {
				   resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
							"alert(\"The room have owner!\");return true;}</script></body>");
			     }
			  
			  
		     }
		     else 
		     {
		    	 resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
							"alert(\"No have the room!\");return true;}</script></body>");
		     }
		    
				
				
			
		 }
		}
		
	}

	

}
