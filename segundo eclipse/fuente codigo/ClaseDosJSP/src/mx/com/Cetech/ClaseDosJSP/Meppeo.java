package mx.com.Cetech.ClaseDosJSP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Meppeo
 */
@WebServlet("/Meppeo")
public class Meppeo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Meppeo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ingresa al metodo get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("passwrod");
		if(usuario.equals("cetech") && pass.equals("1234")){
			System.out.println("Entra");
			request.setAttribute("msg", "Log correcto");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			System.out.println("Autentificacion incorrecta");
			request.setAttribute("msg", "usuario y/o contraseņa incorrecta.");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
