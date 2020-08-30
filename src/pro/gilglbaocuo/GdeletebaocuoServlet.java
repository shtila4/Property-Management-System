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


@WebServlet("/GdeleteServlet")
public class GdeletebaocuoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
         if(req.getParameterValues("id")==null) {
			
			resp.sendRedirect("guanliyuanguanlibaocuo/GdeleteBCshibai.jsp");
		}
         else 
       {
        	 String arr[]=req.getParameterValues("id");
     		if(arr==null) {
     			
     			resp.sendRedirect("guanliyuanguanlibaocuo/GdeleteBCshibai.jsp");
     		}
              for(String ar:arr) {
     			
     			System.out.println(ar);
     			int i=new Baocuoimpl().Deletebaocuo(ar);
     			
     			
     		}
              
              List<Baocuo>baocuos=new Baocuoimpl().GetallBaocuos();
      		req.setAttribute("baocuos", baocuos);
      		   req.getRequestDispatcher("guanliyuanguanlibaocuo/Gbaocuoxinxi.jsp").forward(req, resp);		 
       }
		
		
	}



}
