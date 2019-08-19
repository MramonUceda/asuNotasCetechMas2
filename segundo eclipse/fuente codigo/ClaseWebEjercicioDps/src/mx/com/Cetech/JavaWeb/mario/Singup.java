package mx.com.Cetech.JavaWeb.mario;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Singup extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre,apellidoPaterno,apellidoMaterno;
		int edad;
		
		nombre = req.getParameter("name");
		apellidoPaterno = req.getParameter("FirstName");
		apellidoMaterno = req.getParameter("LastName");
		edad = Integer.parseInt(req.getParameter("age"));
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido Paterno: " + apellidoPaterno);
		System.out.println("Apellido Materno: " + apellidoMaterno);
		System.out.println("Edad: " + edad);
	}

}
