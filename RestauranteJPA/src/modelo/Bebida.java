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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<CuentaBebidaAsociacion> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<CuentaBebidaAsociacion> cuentas) {
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
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
		Bebida other = (Bebida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bebida [id=" + id + ", cuentas=" + cuentas + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
