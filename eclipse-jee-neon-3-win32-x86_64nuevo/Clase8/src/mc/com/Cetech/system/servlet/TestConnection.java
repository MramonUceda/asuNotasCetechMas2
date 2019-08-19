package mc.com.Cetech.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mc.com.Cetech.system.model.CatOcupation;
import mx.com.Cetech.system.dao.IOcupationDAO;

public class TestConnection extends HttpServlet {
	
	@EJB
	private IOcupationDAO dao;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cetechUnit");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Is null ??" + (em==null));
		
		if(em!= null && req.getParameter("name") != null){
			CatOcupation ocup = new CatOcupation();
			ocup.setDescription(req.getParameter("name"));
			dao.saveOcupation(ocup);
			System.out.println("save");
		}
		List<CatOcupation> list = dao.findAll();
		if(list != null){
			for(CatOcupation iterator : list){
				System.out.println(iterator.getId() + "-" + iterator.getDescription());
			}
		}
	}

}
