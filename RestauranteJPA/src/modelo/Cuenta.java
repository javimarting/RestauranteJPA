package modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "cuentas")
public class Cuenta implements Serializable{

	private static final long serialVersionUID = 930108660018575486L;

	@Id
	@GeneratedValue(generator="cuenta_gen")
	@TableGenerator(name="cuenta_gen", table="sqlite_sequence", pkColumnName="name", valueColumnName="seq", pkColumnValue="cuentas")
	private Integer id;
	
	private Date fecha;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="camarero_id")
	private Camarero camarero;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mesa_id")
	private Mesa mesa;
	
	public Cuenta() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
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
		Cuenta other = (Cuenta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", fecha=" + fecha + ", camarero=" + camarero + ", mesa=" + mesa + "]";
	}
	
}
