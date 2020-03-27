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
}
