package pro.glyservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.dao.impl.Roomimpl;
import pro.pojo.Room;


@WebServlet("/glyfangjianguanliServlet")
public class glyfangjianglServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Room>rooms=new Roomimpl().GetallRooms();
        int i=new Roomimpl().GetRoomSum();
		req.setAttribute("rooms", rooms);
		req.setAttribute("count", i);
		System.out.println(i);
		   req.getRequestDispatcher("guanliyuan/glyfangjianxinxi.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	

}
