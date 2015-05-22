package learn.dao;

import java.sql.SQLException;

import learn.model.Contato;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
				
		Contato contato = new Contato();
		System.out.println("Conexao aberta!");
		
		contato.setNome("Arley");
		contato.setEmail("arleyprates");
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado!!");

	}
}
