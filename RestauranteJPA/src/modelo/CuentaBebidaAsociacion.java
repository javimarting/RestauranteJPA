package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_bebida")
@IdClass(CuentaBebidaAsociacionId.class)
public class CuentaBebidaAsociacion implements Serializable{

	private static final long serialVersionUID = -7412627671640482444L;

	@Id
	private Integer cuenta_id;
	
	@Id
	private Integer bebida_id;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "cuenta_id", referencedColumnName = "id")
	private Cuenta cuenta;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "bebida_id", referencedColumnName = "id")
	private Bebida bebida;
	
	public CuentaBebidaAsociacion() {
		super();
	}
}
