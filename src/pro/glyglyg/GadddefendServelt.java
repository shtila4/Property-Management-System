package pro.glyglyg;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pro.dao.impl.Defendimpl;


@WebServlet("/GfenpeiywServlet")
public class GadddefendServelt extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sr=req.getSession();
		String gid=(String)sr.getAttribute("gid");
		
		if(req.getParameterValues("id")==null) {
				
			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
					"alert(\"No have select xinxi!\");return true;}</script></body>");
			}
	         else 
	       {
	        	 String arr[]=req.getParameterValues("id");
	     		if(arr==null) 
	     		{
	     			resp.getWriter().print("<body onLoad=\"checkForm()\"><script language=\"JavaScript\" type=\"text/JavaScript\">function checkForm(){ \n" + 
	    					"alert(\"No have select xinxi!\");return true;}</script></body>");
	     		}
	            for(String ar:arr) 
	            {
	     			
	     			System.out.println(ar);
	     			int i=new Defendimpl().addDefend(gid, ar);
	     			
	     		}
	              
	            
	      	
	      		  resp.sendRedirect("guanliyuanguanliyg/GaddDefendCG.jsp");
	       }
			
			
		}


	



}
