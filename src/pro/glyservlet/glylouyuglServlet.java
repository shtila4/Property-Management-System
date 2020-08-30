package pro.glyservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Buildimpl;
import pro.pojo.Build;
@WebServlet("/glylouyuguanliServlet")
public class glylouyuglServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Build>builds=new Buildimpl().GetallBuilds();
		req.setAttribute("builds", builds);
		   req.getRequestDispatcher("guanliyuan/glylouyuxinxi.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
