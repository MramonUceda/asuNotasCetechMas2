package mx.com.Cetech.javaWeb.Clase4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.StatementEvent;

import org.apache.log4j.Logger;


public class Clase4DBConnection extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4517292704202706589L;
	private static final Logger LOG = Logger.getLogger(Clase4DBConnection.class);
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = DataBaseConnectionFactory.obtainConnection();
		if(conn == null){
			req.setAttribute("Error",true);
		}else{
			req.setAttribute("succes",true);
			try{
				StatementEvent st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Usuarios");
				while(){
					int size = rs.getInt(1);
					bulder.append(size).append(" - ");
				}
				
				req.setAttribute("message",size);
				rs.close();
				st.close();
				conn.colse();
			}catch{
				LOG.error(e.getMessage(),e);
				req.setAttribute("error",true);
				req.setAttribute("message",e.getLocalizedMessage());
			}
		}
		req.getRequestDispatcher("\info.jsp").forward(req,resp);
	}


}
