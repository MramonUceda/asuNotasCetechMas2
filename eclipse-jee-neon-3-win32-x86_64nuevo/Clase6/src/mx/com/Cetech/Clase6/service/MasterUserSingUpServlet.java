package mx.com.Cetech.Clase6.service;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class MasterUserSingUpServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
		MasterUserService service = new MasterUserService();
		boolean flog = service.saveMasterUser(req.getParameter("nickName"), req.getParameter("pass"));
		System.out.println(flog ? "Se guardo el usuario exitosamente" : "Ocurrio un error al guardar.");
	}

}
