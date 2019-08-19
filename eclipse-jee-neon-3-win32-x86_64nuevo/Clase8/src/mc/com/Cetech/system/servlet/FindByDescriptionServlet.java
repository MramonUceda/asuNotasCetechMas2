package mc.com.Cetech.system.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mc.com.Cetech.system.model.CatOcupation;
import mx.com.Cetech.system.dao.IOcupationDAO;

public class FindByDescriptionServlet extends HttpServlet { // 1 extend de http
	// paso 2
	
	@EJB
	private IOcupationDAO dao;
	
	
	//paso3 y se cambia de protected a public
	@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.doGet(req, resp); <-- se borra para crear nuestro metodo y también el TODO
			String description = null;
			List<CatOcupation> result = null;
			
			//paso 3
			
			description = req.getParameter("description");
			result = dao.findByDescription("%"+description+"%");
			
			PrintWriter out = resp.getWriter();
			//con esto le estas diciendo al metodo get que te va a regresar un json
			resp.setContentType("application/json");
			out.print(result);
			
			//con fin infomativo
			for(CatOcupation e:result){
				System.out.println(e);
				
			}
		
		}

}
