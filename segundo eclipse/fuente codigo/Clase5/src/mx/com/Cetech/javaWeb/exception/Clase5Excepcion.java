package mx.com.Cetech.javaWeb.exception;

public class Clase5Excepcion extends Exception {

	private final String personalMessage;
	private final int code;
	
	public Clase5Excepcion(Throwable e, String personalMessage, int code){
		super(e);
		this.personalMessage = personalMessage;
		this.code = code;
	}
	public String getPersonalMessage(){
		return personalMessage;
	}
	public int getCode(){
		return code;
	}
}
