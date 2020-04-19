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
@Table(name = "mesas")
public class Mesa implements Serializable{

	private static final long serialVersionUID = 2516606407659363888L;

	@Id
	@GeneratedValue(generator="mesa_gen")
	@TableGenerator(name="mesa_gen", table="sqlite_sequence", pkColumnName="name", valueColumnName="seq", pkColumnValue="mesas")
	private Integer id;
	
	private Integer num_personas;
	
	@OneToMany(mappedBy="mesa")
	private ArrayList<Cuenta> cuentas;
	
	public Mesa() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum_personas() {
		return num_personas;
	}

	public void setNum_personas(Integer num_personas) {
		this.num_personas = num_personas;
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
		Mesa other = (Mesa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", num_personas=" + num_personas + ", cuentas=" + cuentas + "]";
	}
	
}
