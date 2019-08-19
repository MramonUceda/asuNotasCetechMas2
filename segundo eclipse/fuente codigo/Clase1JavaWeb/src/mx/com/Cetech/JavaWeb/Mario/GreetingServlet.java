package mx.com.Cetech.JavaWeb.Mario;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String param = req.getParameter("name");
		//GetParamet trabaja con la llave (aqui viajan dos ista 1.key 2.Valor)
		//te regresa el 2.valor
		System.out.println("Hola " + param);
	}
}
