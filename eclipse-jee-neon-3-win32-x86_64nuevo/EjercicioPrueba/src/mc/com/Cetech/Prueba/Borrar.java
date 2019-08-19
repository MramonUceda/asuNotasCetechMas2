package mc.com.Cetech.Prueba;
import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Logger;

import mx.com.cetech.javaWeb.servlet.DB;

public class Borrar {

	private static final Logger LOG= Logger.getLogger(Borrar.class);
	
	public void pruebaLogs(){
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("log de ejmplo");
		log.warn("un warning");
		log.error("error");
	}
	

}
