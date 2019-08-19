package mx.com.Cetech.Clase7Tomee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.jstl.sql.Result;

import mx.com.Cetech.Clase7Tomee.model.UserType;

public class UserTypeDAO {
	
	//conexion de tipo java SQL
	private Connection obtanConnection() throws Exception{
		Connection conn = null;
try {
			
			/*	
			 * 
			 *Para oracle la clase seria: oracle.jdbc.driver.OracleDriver
			 */
			Class.forName("com.mysql.jdbc.Driver");
			/*	
			 * Para Oracle  la url siguiente: jdbc:oracle:thin:@localhost:1521:xe
			 */
			
			conn=DriverManager.getConnection("jdbc:mysql://107.180.50.237:3306/cetech_sys_db", "cetech_sys_root", "RTe-cJx-Ypm-3kH");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception

			e.printStackTrace();
			throw new Exception("No se encontro el driver dentro de la libreria)");
			
		}
		
		catch (SQLException e) {
			// TODO: handle exception
			
			e.printStackTrace();
			throw new Exception("Tus datos son como clarita (son invalidos)");

		}
		
		return conn;
	}
	
	public void createUserType(UserType entity){
		//TODO guardar la infomación
		try{
			Connection conn = obtanConnection();
			PreparedStatement st = conn.prepareStatement("INSERT INTO CAT_USER_TYPE (ID_USER_TYPE, DESC_USER_TYPE) VALUE(?,?)");
			st.setInt(1, entity.getId());
			st.setString(2, entity.getDescrition());
			
			
			st.executeUpdate();
			st.close();
			conn.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public List<UserType> findAll(){
		List<UserType> list = null;
		try {
			list = new ArrayList<>();
			Connection conn = obtanConnection();
			Statement st = conn.createStatement();
			ResultSet rs = null;
			
			rs = st.executeQuery("SELECT * FROM CAT_USER_TYPE ORDER BY ID_USER_TYPE");
			while(rs.next()){
				UserType element = new UserType();
				element.setId(rs.getInt("ID_USER_TYPE"));
				element.setDescrition(rs.getString("DESC_USER_TYPE"));
				list.add(element);				
			}
			rs.close();
			st.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
