package mx.com.Cetech.Clase6.Model;

import java.io.Serializable;
import java.util.Date;
 
public class MasrterUserDO implements Serializable {
	
	private Integer idMasterUser;
	private String nickName;
	private String passwd;
	private Date lastEdit;
	private Date finisherDate;
	
	
	public Integer getIdMasterUser() {
		return idMasterUser;
	}
	public void setIdMasterUser(Integer idMasterUser) {
		this.idMasterUser = idMasterUser;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Date getLastEdit() {
		return lastEdit;
	}
	public void setLastEdit(Date lastEdit) {
		this.lastEdit = lastEdit;
	}
	public Date getFinisherDate() {
		return finisherDate;
	}
	public void setFinisherDate(Date finisherDate) {
		this.finisherDate = finisherDate;
	}
	

}
