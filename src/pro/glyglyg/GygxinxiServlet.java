package pro.glyglyg;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Workerimpl;
import pro.pojo.Worker;



@WebServlet("/GygxinxiServlet")
public class GygxinxiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Worker>workers=new Workerimpl().GetallWorkers();
		req.setAttribute("workers", workers);
		   req.getRequestDispatcher("guanliyuanguanliyg/Gygxinxi.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}



}
