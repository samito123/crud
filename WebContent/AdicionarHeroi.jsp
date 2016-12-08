<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Adicionar Herói</title>
		<link rel="StyleSheet" type="text/css" href="CSS/bootstrap.min.css" media="screen" >
	</head>
	<body>
		<form action="AdicionarHeroi" method="post">
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Nome:</label>
		    <input style="width:30%;" type="text" class="form-control" name="nome">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Força</label>
		    <input style="width:30%;" type="text" class="form-control" name="forca">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Habilidade</label>
		    <input style="width:30%;" type="text" class="form-control" name="habilidade">
		  </div>
		  <div style="padding-left: 5px;" class="form-group">
		    <label>Resistência</label>
		    <input style="width:30%;" type="text" class="form-control" name="resistencia">
		  </div>
		  
		  <button style="margin-left: 11%;" type="submit" class="btn btn-primary">
			 Salvar Herói
		  </button>
	
		</form>
	</body>
</html>