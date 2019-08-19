package mx.com.cetech.formularioCetech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class BaseDatos {
	
	private static final Logger LOG=Logger.getLogger(BaseDatos.class);
	
	private final String DB_DRIVER = "com.mysql.jdbc.Driver";// MYSQL
	private final String DB_CONNECTION = "jdbc:mysql://localhost:3306/cetech"; //jdbc:TIPOBD://IPBD:PUERTO/NOMBREBD
	private final String DB_USER = "root";
	private final String DB_PASSWORD = "12345678";
	Connection dbConnection = null;
	
	public Connection getDBConnection(){
		try {
			LOG.info("Cargando DRIVER...");
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver de la BD");
			e.printStackTrace();
		}
		try {
			LOG.info("Armando conexion....");
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD");
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}
	public void cerrarConexion()
	{
		if(dbConnection!=null)
		{
			try
			{
				dbConnection.close();
				dbConnection=null;
			}
			catch(Exception ex)
			{
				System.out.println("No se pudo cerrar la conexión");
			}
		}
	}
}
