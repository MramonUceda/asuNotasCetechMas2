package mx.com.Cetech.Clase6.DAO;

public class Clase5Exception extends Exception{

	private final String personalMessage;
	private final int code;
	
	public Clase5Exception(Throwable e,String personalMessage, int code){
		
		super (e);
		this.personalMessage= personalMessage;
		this.code=code;
	}
	
	public String getPersonalMessage(){
		
		return personalMessage;
	}
	
	public int getCode(){
		
		return code;
	}
}
