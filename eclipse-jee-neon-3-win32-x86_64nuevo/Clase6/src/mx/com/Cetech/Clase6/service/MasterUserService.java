package mx.com.Cetech.Clase6.service;

import java.util.Calendar;

import mx.com.Cetech.Clase6.DAO.IMasterDAO;
import mx.com.Cetech.Clase6.DAO.MasterUserDAOimpl;
import mx.com.Cetech.Clase6.Model.MasrterUserDO;


public class MasterUserService {
	private IMasterDAO dao;
	
	public MasterUserService(){
		dao = new MasterUserDAOimpl();
	}
	
	public boolean saveMasterUser(String nickName, String passwd){
		MasrterUserDO entity = null;
		entity = new MasrterUserDO();
		entity.setNickName(nickName);
		entity.setPasswd(String.valueOf(passwd.hashCode()));
		Calendar calendar = Calendar.getInstance();
		entity.setLastEdit(calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		entity.setFinisherDate(calendar.getTime());
		return dao.saveMasterUser(entity);
	}

}
