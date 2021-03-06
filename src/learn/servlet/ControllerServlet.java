package learn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.logica.Logica;

@WebServlet("/learn")
public class ControllerServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String parametro = request.getParameter("logica");
		String nomeClass = "learn.logica." + parametro;
		
		try {
			Class classe = Class.forName(nomeClass);
			
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);
			
			request.getRequestDispatcher(pagina).forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException("A Logica retornou alguma excecao", e);
		}
	} 
}
