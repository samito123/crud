<%@page import="modelo.Heroi"%>
<%@page import="dao.HeroiDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Editar Ou Excluir Herói</title>
		<link rel="StyleSheet" type="text/css" href="CSS/bootstrap.min.css" media="screen" >
	</head>
	<body>
		<% 
			String id = request.getParameter("id");
			HeroiDAO dao = new HeroiDAO(); 
			Heroi heroi = dao.RecuperaHeroiPeloId(Long.parseLong(id));
		%>
		<form action="EditarHeroi" method="post">
			
		  <div style="padding-left: 5px; display:none" class="form-group">
		    <input style="width:30%;" type="text" class="form-control" name="id" value="<%=heroi.getId() %>">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Nome:</label>
		    <input style="width:30%;" type="text" class="form-control" name="nome" value="<%=heroi.getNome() %>">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Força</label>
		    <input style="width:30%;" type="text" class="form-control" name="forca" value="<%=heroi.getForca() %>">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Habilidade</label>
		    <input style="width:30%;" type="text" class="form-control" name="habilidade" value="<%=heroi.getHabilidade() %>">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Resistência</label>
		    <input style="width:30%;" type="text" class="form-control" name="resistencia" value="<%=heroi.getResistencia() %>">
		  </div>
		  
		  <button style="margin-left: 5px; display:inline-block;" type="submit" class="btn btn-primary">
			 Editar Herói
		  </button>
		  
		  <a href="ExcluirHeroi?id=<%=heroi.getId() %>">
			<button type="button" class="btn btn-danger">
				Excluir
			</button>
		  </a>
		  
		  <a href="ListaHerois.jsp">
			<button type="button" class="btn btn-info">
				Voltar
			</button>
		  </a>
	
		</form>
		
	</body>
</html>