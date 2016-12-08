package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Heroi;
import dao.HeroiDAO;

public class AdicionarHeroi extends HttpServlet{
 
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	 	Heroi heroi = new Heroi();
	 	heroi.setNome(request.getParameter("nome"));
	 	heroi.setForca(request.getParameter("forca"));
	 	heroi.setHabilidade(request.getParameter("habilidade"));
	 	heroi.setResistencia(request.getParameter("resistencia"));
	 	
	 	HeroiDAO dao = new HeroiDAO();
	 	dao.AdicionarHeroi(heroi);
	 	
	 	response.sendRedirect("ListaHerois.jsp");
	}
}
