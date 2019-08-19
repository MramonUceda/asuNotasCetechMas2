package mx.com.Cetech.javaWeb.Clase4;
//
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;

import org.apache.log4j.Logger;

public class ServletClase4 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6875250451306438084L;
	private static final Logger LOG = Logger.getLogger(ServletClase4.class);
       @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("Entrando a metodo get");
		LOG.info("Incoming info.. \nUsuario:\t" + getInitParameter("Usuario") + "\nPassword:\t"
				+ req.getParameter("Password"));	
	}

	

}
