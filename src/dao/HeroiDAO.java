package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import controle.ConnectionFactory;
import modelo.Heroi;

public class HeroiDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	
	public ArrayList<Heroi> ListarHerois() throws ServletException{
		ArrayList<Heroi> herois = new ArrayList<>();
		try {	
			conn = new ConnectionFactory().getConnection();
			String sql = "select * from herois";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); 
			while (rs.next()) { 
				Heroi heroi = new Heroi();
				heroi.setId(rs.getLong("id")); 
				heroi.setNome(rs.getString("nome"));
				heroi.setForca(rs.getString("forca"));
				heroi.setHabilidade(rs.getString("habilidade"));
				heroi.setResistencia(rs.getString("resistencia"));
				herois.add(heroi); 
			}
			
			rs.close();
			ps.close();
			conn.close();
			
			System.out.println("Listando heróis!");
		}catch (Exception e) {
			System.out.print(e);
			throw new ServletException(e);
		}
		return herois;
	}
	
	public Heroi RecuperaHeroiPeloId(Long id) throws ServletException{	
		Heroi heroi = new Heroi();
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "select * from herois "
					+ "where id=?"; 
			
			ps = conn.prepareStatement(sql);	
			ps.setLong(1, id); 
			ResultSet rs = ps.executeQuery(); 
			while (rs.next()) { 
				heroi.setId(rs.getLong("id")); 
				heroi.setNome(rs.getString("nome"));
				heroi.setForca(rs.getString("forca"));
				heroi.setHabilidade(rs.getString("habilidade"));
				heroi.setResistencia(rs.getString("resistencia"));
			}
			
			System.out.println("Herói Recuperado!");
		} catch (Exception e) {
			System.out.print(e);
			throw new ServletException(e);
		}
		return heroi;
	}
	
	public void AdicionarHeroi(Heroi heroi) throws ServletException{	
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "insert into herois" + " "
					+ "(nome,forca,habilidade,resistencia)" + " "
					+ "values (?,?,?,?)"; 
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, heroi.getNome()); 
			ps.setString(2, heroi.getForca()); 
			ps.setString(3, heroi.getHabilidade()); 
			ps.setString(4, heroi.getResistencia()); 
			
			ps.execute(); 
			ps.close();
			conn.close();
			
			System.out.println("Herói Inserido!");
		} catch (Exception e) {
			System.out.print(e);
			throw new ServletException(e);
		}
		
	}
	
	public void EditarHeroi(Heroi heroi) throws ServletException{	
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "update herois set "
					+ "nome=?, forca=?, habilidade=?, resistencia=? "
					+ "where id=?"; 
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, heroi.getNome()); 
			ps.setString(2, heroi.getForca()); 
			ps.setString(3, heroi.getHabilidade()); 
			ps.setString(4, heroi.getResistencia()); 
			ps.setLong(5, heroi.getId()); 
			
			ps.execute(); 
			ps.close();
			conn.close();
			
			System.out.println("Cliente Editado!");
		} catch (Exception e) {
			System.out.print(e);
			throw new ServletException(e);
		}
		
	}
	
	public void ExcluirHeroi(Long idHeroi) throws ServletException{	
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = ("delete from herois where id=?");  
			ps = conn.prepareStatement(sql);
			ps.setLong(1, idHeroi); 
			
			ps.execute(); 
			ps.close();
			conn.close(); 
			
			System.out.println("Herói Excluir!");
		} catch (Exception e) {
			System.out.print(e);
			throw new ServletException(e);
		}
		
	}
}
