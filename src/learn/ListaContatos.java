package learn;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.dao.ContatoDao;
import learn.logica.Logica;
import learn.model.Contato;

/**
 * Servlet implementation class ListaContatos
 */
@WebServlet("/listaContatos")
public class ListaContatos implements Logica {	
	
	public String executa (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Contato> contatos = new ContatoDao().getList();
		
		request.setAttribute("contatos", contatos);
		
		return "lista-contatos.jsp";
	}

}
