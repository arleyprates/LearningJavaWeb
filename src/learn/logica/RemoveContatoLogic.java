package learn.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.dao.ContatoDao;
import learn.model.Contato;

public class RemoveContatoLogic implements Logica {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub

		try {
			
			long id = Long.parseLong(req.getParameter("id"));
			Contato contato = new Contato();
			contato.setId(id);
			
			ContatoDao dao = new ContatoDao();
			dao.exclui(contato);
			
			System.out.println("Excluidando contato... ");
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("RemoveContatoLogic... " + e);
		}
		return "lista-contatos.jsp";
	}

}
