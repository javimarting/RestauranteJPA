package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "platos")
public class Plato implements Serializable{

	private static final long serialVersionUID = -4988912168152948299L;

	@Id
	@GeneratedValue(generator = "plato_gen")
	private Integer id;
	
	private String nombre;
	
	private Double precio;
	
	public Plato() {
		super();
	}
}
