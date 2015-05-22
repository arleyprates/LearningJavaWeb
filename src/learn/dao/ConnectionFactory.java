package learn.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
			return DriverManager.getConnection("jdbc:mysql://localhost/learnJavaWeb", "root", "123");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
