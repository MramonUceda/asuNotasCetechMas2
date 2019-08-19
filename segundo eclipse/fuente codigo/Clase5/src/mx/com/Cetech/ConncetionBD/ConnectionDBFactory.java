package mx.com.Cetech.ConncetionBD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.

public final class ConnectionDBFactory { //Con final esta clase no puede tener subclases
	private ConnectionDBFactory(){
		
	}// Se declara como private el constructor default y se ofusca las instancias de la clase
	public static Connection getConnection(){ // Se marca con static y publico para poder ser accedido sin instanciar el objecto.
		
		
		Connection conn = null;

		/*
		 * Para oracle clase seria: oracle.jdbc.driver.OracleDriver
		 */
		Class.forName("com.mysql.jdbc.Driver");
		/*
		 * para oracle seria la siguiente: jdbc:oracle:thin:@localhost:1521:xe
		 */
		conn = DriverManager.getConnection("jdbc:mysql://107.189.50.237:3306/gymControl","adminSystem",password);
		return null;
	}
}