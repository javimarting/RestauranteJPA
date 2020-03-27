package modelo;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "camareros")
public class Camarero implements Serializable{

	private static final long serialVersionUID = 3647161695443149225L;
	
	@Id
	@GeneratedValue(generator="camarero_gen")
	@TableGenerator(name="camarero_gen", table="sqlite_sequence", pkColumnName="name", valueColumnName="seq", pkColumnValue="camareros")
	private Integer id;
	private String nombre;
	private String apellido;
	private Double sueldo;
	
	@OneToMany(mappedBy="camarero")
	private ArrayList<Cuenta> cuentas;
	public Camarero() {
		super();
	}
}
