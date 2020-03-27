package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "camareros")
public class Camarero implements Serializable{

	private static final long serialVersionUID = 3647161695443149225L;
	
	@Id
	@GeneratedValue(generator="camarero_gen")
	@TableGenerator(name="camarero_gen", table="sqlite_sequence", pkColumnName="name", valueColumnName="seq", pkColumnValue="empleados")
	private Integer id;
	
	public Camarero() {
		super();
	}
}
