package mx.com.Cetech.Clase6.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import org.apache.log4j.Logger;

//import mx.com.cetech.javaWeb.exception.Clase5Exception;


/*	
 * Modelo para una clase del tipo Factory
 */


public final class ConnectionDBFactory {// con final esta clase no puede tener subclases.
	
	//private static final Logger LOG= Logger.getLogger(ConnectionDBFactory.class);
	
	private ConnectionDBFactory(){ //Se declara como privado el constructor default y se ofuzcan las instancias 
		//de la clase
		
		
	}
	
	
	public static Connection getConnection() throws Exception {// Se marca con static y publico para poder ser accedido sin instanciar al obj.
		
		
		Connection conn= null;
		//LOG.info("Entrando al metodo para generar una conexión a base de datos...");
		try {
			
			/*	
			 * 
			 *Para oracle la clase seria: oracle.jdbc.driver.OracleDriver
			 */
			Class.forName("com.mysql.jdbc.Driver");
			/*	
			 * Para Oracle  la url siguiente: jdbc:oracle:thin:@localhost:1521:xe
			 */
			
			conn=DriverManager.getConnection("jdbc:mysql://107.180.50.237:3306/gymControl", "adminSystem", "adminSystem91");
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
	

}
