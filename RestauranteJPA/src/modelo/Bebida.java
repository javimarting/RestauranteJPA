package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "bebida")
	private List<CuentaBebidaAsociacion> cuentas;
	
	private String nombre;
	
	private Double precio;
	
	public Bebida() {
		super();
	}
}
