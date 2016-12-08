package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HeroiDAO;

public class ExcluirHeroi extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		HeroiDAO dao = new HeroiDAO();
		dao.ExcluirHeroi(Long.parseLong(id));
		//dao.DeletarHeroi(Long.parseLong("4"));
		response.sendRedirect("ListaHerois.jsp");
		System.out.println("Chegou malucooo: " + request.getParameter("id"));
	}
}
