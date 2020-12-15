package edu.cientifica.ISISGAV.model;

public class Persona_Juridica {

	private Cliente cliente;
	private String nombre_Comercial;

	public Persona_Juridica(Cliente cliente, String nombre_Comercial) {
		super();
		this.cliente = cliente;
		this.nombre_Comercial = nombre_Comercial;
	}

	public Persona_Juridica() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNombre_Comercial() {
		return nombre_Comercial;
	}

	public void setNombre_Comercial(String nombre_Comercial) {
		this.nombre_Comercial = nombre_Comercial;
	}

}
