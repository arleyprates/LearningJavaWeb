package learn.logica;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.dao.ConnectionFactory;
import learn.dao.ContatoDao;
import learn.logica.Logica;
import learn.model.Contato;

public class ListaContatos implements Logica {	
	
	public String executa (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection connection = (Connection) request.getAttribute("connection");
		
		List<Contato> contatos = new ContatoDao(connection).getList();
		
		request.setAttribute("contatos", contatos);
		
		return "lista-contatos.jsp";
	}

}
