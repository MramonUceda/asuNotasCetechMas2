package mx.com.Cetech.Clase7Tomee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.Cetech.Clase7Tomee.dao.UserTypeDAO;
import mx.com.Cetech.Clase7Tomee.model.UserType;

public class FindAllUserTypeController  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<UserType> list = null;
		UserTypeDAO dao = new UserTypeDAO();
		
		list = dao.findAll();
		
		for(UserType iterator : list){
			System.out.println(iterator);
		}
		
		req.setAttribute("result", list);
		
		req.getRequestDispatcher("/result.jsp").forward(req, resp); // es un redirect
	}

}
