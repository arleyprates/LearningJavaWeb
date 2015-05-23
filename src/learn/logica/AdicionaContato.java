package learn.logica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.dao.ContatoDao;
import learn.logica.Logica;
import learn.model.Contato;

public class AdicionaContato implements Logica {	

	@Override
	public String executa (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		try {
			Contato contato = new Contato();
			
			contato.setNome(nome);
			contato.setEmail(email);
			
			ContatoDao dao = new ContatoDao();
			dao.adiciona(contato);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao adicionar " + e);
		}
		
		
		return "/WEB-INF/jsp/contato-adicionado.jsp";
	}

}