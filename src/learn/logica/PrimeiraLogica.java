package learn.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrimeiraLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executando primeira Logica!");
			
		System.out.println("Retornando pagina JSP !");
		return "primeira-logica.jsp";
	}
	

}
