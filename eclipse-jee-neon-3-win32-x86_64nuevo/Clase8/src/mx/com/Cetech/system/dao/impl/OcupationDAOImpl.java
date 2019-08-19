package mx.com.Cetech.system.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import mc.com.Cetech.system.model.CatOcupation;
import mx.com.Cetech.system.dao.IOcupationDAO;

@Stateless
public class OcupationDAOImpl implements IOcupationDAO {
	
	@PersistenceContext(unitName="cetechUnit")
	protected EntityManager em;
	
	@Override
	public void saveOcupation(CatOcupation entity) {
		
		em.persist(entity);
		
	}

	@Override
	public List<CatOcupation> findAll() {
		List<CatOcupation> list = new ArrayList<>();
		try {
			TypedQuery<CatOcupation> query = em.createNamedQuery("CatOcupation.finAll", CatOcupation.class);  //SELECT e from CatOcupation e ES JPQL
			list = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<CatOcupation> findByDescription(String description) {
		List<CatOcupation> result = new ArrayList<>();
		
		try {
			TypedQuery<CatOcupation> 
			query = em.createNamedQuery("CatOcupation.findByDescription", CatOcupation.class);
			
			query.setParameter("description", description);
			result = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
