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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
