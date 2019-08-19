package mx.com.Cetech.Clase7Tomee.model;

public class UserType {
	private Integer id;
	private String descrition;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "-" + descrition;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	

}
