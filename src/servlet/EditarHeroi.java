package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Heroi;
import dao.HeroiDAO;

public class EditarHeroi extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		Heroi heroi = new Heroi();
		heroi.setId(Long.parseLong(id));
	 	heroi.setNome(request.getParameter("nome"));
	 	heroi.setForca(request.getParameter("forca"));
	 	heroi.setHabilidade(request.getParameter("habilidade"));
	 	heroi.setResistencia(request.getParameter("resistencia"));
	 	
	 	HeroiDAO dao = new HeroiDAO();
	 	dao.EditarHeroi(heroi);
	 	
	 	response.sendRedirect("ListaHerois.jsp");
	}
}
