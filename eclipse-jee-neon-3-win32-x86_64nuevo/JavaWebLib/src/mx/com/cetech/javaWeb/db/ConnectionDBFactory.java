package mx.com.cetech.javaWeb.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import mx.com.cetech.javaWeb.exception.Clase5Exception;


/*	
 * Modelo para una clase del tipo Factory
 */


public final class ConnectionDBFactory {// con final esta clase no puede tener subclases.
	
	private static final Logger LOG= Logger.getLogger(ConnectionDBFactory.class);
	
	private ConnectionDBFactory(){ //Se declara como privado el constructor default y se ofuzcan las instancias 
		//de la clase
		
		
	}
	
	public static Connection getConnection() throws Clase5Exception{
		return getConnection("107.180.237","3306","gymControl","adminSystem","adminSystem91");
	}
	
	
	
	
	public static Connection getConnection(String host,String port,String schema,String user,String pwd) throws Clase5Exception {// Se marca con static y publico para poder ser accedido sin instanciar al obj.
		
		
		Connection conn= null;
		LOG.info("Entrando al metodo para generar una conexión a base de datos...");
		try {
			
			/*	
			 * 
			 *Para oracle la clase seria: oracle.jdbc.driver.OracleDriver
			 */
			Class.forName("com.mysql.jdbc.Driver");
			/*	
			 * Para Oracle  la url siguiente: jdbc:oracle:thin:@localhost:1521:xe
			 */
			
			conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+schema,user,pwd);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception

			LOG.debug("Exception al instaciar al driver",e);
			throw new Clase5Exception(e, "No se encontro el driver dentro de la libreria)", 400);
			
		}
		
		catch (SQLException e) {
			// TODO: handle exception
			
			LOG.debug("Error al realizar la conexión a base de datos",e);
			throw new Clase5Exception(e, "Tus datos son como clarita (son invalidos)", 500);

		}
	
		
		
		return conn;
		
	}
	

}
