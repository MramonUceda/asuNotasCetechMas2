package mx.com.Cetech.system.dao;

import java.util.List;

import javax.ejb.Local;

import mc.com.Cetech.system.model.CatOcupation;

@Local
public interface IOcupationDAO {
	
	void saveOcupation(CatOcupation entity);
	
	List<CatOcupation> findAll();
	List<CatOcupation> findByDescription(String description);
	
}

