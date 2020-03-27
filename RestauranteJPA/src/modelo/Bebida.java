package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "bebidas")
public class Bebida implements Serializable{

	private static final long serialVersionUID = -3060722791995903586L;

	@Id
	@GeneratedValue(generator="bebida_gen")
	@TableGenerator(name="bebida_gen", table="sqlite_sequence", pkColumnName="name", valueColumnName="seq", pkColumnValue="bebidas")
	private Integer id;
	
	private String nombre;
	
	private Double precio;
	
	public Bebida() {
		super();
	}
}
