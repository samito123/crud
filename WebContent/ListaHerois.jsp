<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Heroi"%>
<%@page import="dao.HeroiDAO"%>
<%@ page
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Meus Heróis</title>
		<link rel="StyleSheet" type="text/css" href="CSS/bootstrap.min.css" media="screen" >
	</head>
	<body>
		
			<table class="table table-bordered">
	            <thead>
		            <tr class="tr-table-color"> 
		            	<th>ID</th>
		                <th>Nome</th>
		                <th>Força</th>
		                <th>Habilidade</th>
		                <th>Resistência</th>
		            </tr>
	            </thead>
                <tbody>
                	<% 
						HeroiDAO dao = new HeroiDAO(); 
						ArrayList<Heroi> herois = dao.ListarHerois();
						for (Heroi heroi : herois ) { 
					%>
                	<tr>
               			<td><a href="EditarOuExcluirHeroi.jsp?id=<%=heroi.getId() %>">
               				<%=heroi.getId() %>
             			</td> 
	            		<td><%=heroi.getNome() %></td> 
						<td><%=heroi.getForca() %></td> 
						<td><%=heroi.getHabilidade() %></td>
						<td><%=heroi.getResistencia() %></td>
       			 	</tr>     	
       			 	<%
						}	
					%> 
                 </tbody>
             </table>
		
			<center>
				<a href="AdicionarHeroi.jsp">
					<button type="button" class="btn btn-primary">
						Novo Herói
					</button>
				</a>
			</center>
		</div>
	</body>
</html>