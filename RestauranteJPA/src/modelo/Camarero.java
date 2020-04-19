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
		cuentas = new ArrayList<>();
	}
	
	public void addCuenta(Cuenta cuenta) {
		if(!cuentas.contains(cuenta)) {
		cuentas.add(cuenta);
		}
	}
	
	public void removeCuenta(Cuenta cuenta) {
		cuentas.remove(cuenta);
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camarero other = (Camarero) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Camarero [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo
				+ ", cuentas=" + cuentas + "]";
	}
	
	
}
