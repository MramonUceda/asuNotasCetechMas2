package mx.com.Cetech.Clase6.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import mx.com.Cetech.Clase6.Model.MasrterUserDO;

public class MasterUserDAOimpl implements IMasterDAO {

	@Override
	public boolean saveMasterUser(MasrterUserDO entity) {
		try{
		Connection conn = ConnectionDBFactory.getConnection();
		String query = "INSERT INTO MASTER_USER (NICK_NAME,LAST_EDIT_DATE, FINISHED_DATE,PASS) VALUES (?,?,?,?)";
		/*StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append(query);
		queryBuilder.append(entity.getIdMasterUser()).append(",");
		queryBuilder.append(entity.getNickName()).append(",");
		queryBuilder.append(entity.getLastEdit()).append(",");
		queryBuilder.append(entity.getFinisherDate()).append(",");
		queryBuilder.append(entity.getPasswd()).append(")");*/
		
		//Statement st = conn.createStatement();
		//st.executeQuery(queryBuilder.toString());
		
		//st.close();
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setString(1, entity.getNickName());
		pst.setDate(2, new Date(entity.getLastEdit().getTime()));
		pst.setDate(3, new Date(entity.getFinisherDate().getTime()));
		pst.setString(4, entity.getPasswd());
		pst.executeUpdate();
		
		conn.close();
		return true;
		
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		
		
		// TODO Auto-generated method stub
	}

}
