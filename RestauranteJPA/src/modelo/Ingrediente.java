package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredientes")
public class Ingrediente implements Serializable{

	private static final long serialVersionUID = 4183054479177243520L;

	@Id
	@GeneratedValue(generator = "ingrediente_gen")
	private Integer id;
	
	private String nombre;
	
	private Double precio;
	
	public Ingrediente() {
		super();
	}
}
