package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException, ServletException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					 "jdbc:mysql://localhost/crud", "sam", "123"); 
		}catch(SQLException e){
			throw new ServletException(e);
		}
		
	}
}
