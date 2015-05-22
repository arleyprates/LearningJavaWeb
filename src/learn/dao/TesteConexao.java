package learn.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;

import learn.model.Contato;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		
		System.out.println("Conexao aberta!");
		
		Contato contato = new Contato();
		
		contato.setNome("Arley");
		contato.setEmail("arleyprates");
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado!!");
		
		
		connection.close();
		
	}
}
