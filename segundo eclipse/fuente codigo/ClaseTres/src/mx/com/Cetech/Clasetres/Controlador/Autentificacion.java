package mx.com.Cetech.Clasetres.Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autentificacion
 */

public class Autentificacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autentificacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("usuario"));
		System.out.println(request.getParameter("password"));
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		if(usuario.equals("cetech") && password.equals("1234")){
			System.out.println("Entra");
			request.setAttribute("msg", "Log correcto");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			System.out.println("Autentificacion incorrecta");
			request.setAttribute("msg", "usuario y/o contraseña incorrecta.");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
