package mx.com.Cetech.Clase7Tomee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.Cetech.Clase7Tomee.dao.UserTypeDAO;
import mx.com.Cetech.Clase7Tomee.model.UserType;

//como es un controlador sera entonces un servlet (extiende httpServlet)
public class SaveUserTypeController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserTypeDAO dao = new  UserTypeDAO();
		UserType user = new UserType();
		
		user.setDescrition(req.getParameter("description"));
		user.setId(Integer.parseInt(req.getParameter("id")));
		
		// a mi dao
		dao.createUserType(user);
		
	}
}
