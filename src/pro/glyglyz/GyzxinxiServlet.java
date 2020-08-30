package pro.glyglyz;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Ownerimpl;

import pro.pojo.Yzxinxi;
@WebServlet("/GyzxinxiServlet")
public class GyzxinxiServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Yzxinxi>owners=new Ownerimpl().GetALLowners();
		req.setAttribute("owners", owners);
		   req.getRequestDispatcher("guanliyuanguanliyz/Gyzxinxi.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
