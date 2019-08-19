package mc.com.Cetech.system.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
// lo que se hace en esta clase es como se MAPEA nuestro @Entity, 
@Entity
//@TABLE BUSCA LA TABLA EN LA BD
@Table(name="CAT_OCUPATION")   
@NamedQueries({
	@NamedQuery(name="CatOcupation.finAll",query="SELECT e from CatOcupation e"),//nombre de jquery debe ser único.
	@NamedQuery(name="CatOcupation.findByDescription",query="SELECT e FROM CatOcupation e "+" WHERE e.description LIKE :description "
	+ " ORDER BY e.id")
})
public class CatOcupation implements Serializable {
	
	/**
	 * 
	 */
	//serialVersionUID lo podemos ver como el nombre de la clase para viajar y no tenga tanta perdida de datos
	private static final long serialVersionUID = -4947036760858673773L;
	
	
	//primero
	//Integer es un wraper y su valor puede ser NULL
	@Id
	@Column(name="ID_OCUPATION")
	private Integer id;
	
	@Column(name="DESC_OCUPATION")
	private String description;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//que es un json¿?, 
		//haciendo una buena practica: es un objeto para construir cadenas
		StringBuffer builder = new StringBuffer();
		//se crea una cadena de esta forma, esta cadena es como si se estuviera haciendo con json(así es la forma en json):
		builder.append("{").append("\"id\" :").append(id).append(",").append("\"description\" :\"").append(description).append("\"}");
		
		
		return builder.toString();
	}
	
	

}
