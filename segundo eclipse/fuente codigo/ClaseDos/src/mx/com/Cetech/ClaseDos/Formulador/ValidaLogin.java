package mx.com.Cetech.ClaseDos.Formulador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class ValidaLogin
 */
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidaLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //si enviamos por get llega a estsa funcion
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("En el servlet valida login por metodo get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//si enviamos por post llega a esta funcion
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dentro del servlet validarlogin");
		System.out.println("Usuario :" + request.getParameter("usuario"));
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		if(usuario.equals("cetech") && password.equals("admin123")){
			System.out.println("Felicidades");
		}
		System.out.println(password);

		
	}

}
