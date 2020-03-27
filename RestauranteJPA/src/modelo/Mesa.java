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
}
