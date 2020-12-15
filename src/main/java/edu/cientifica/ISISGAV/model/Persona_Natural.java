package edu.cientifica.ISISGAV.model;

public class Persona_Natural {

	private Cliente cliente;
	private String nom_cli;
	private String ape_cli;
	private int dni_cli;

	public Persona_Natural(Cliente cliente, String nom_cli, String ape_cli, int dni_cli) {
		super();
		this.cliente = cliente;
		this.nom_cli = nom_cli;
		this.ape_cli = ape_cli;
		this.dni_cli = dni_cli;
	}

	public Persona_Natural() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNom_cli() {
		return nom_cli;
	}

	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}

	public String getApe_cli() {
		return ape_cli;
	}

	public void setApe_cli(String ape_cli) {
		this.ape_cli = ape_cli;
	}

	public int getDni_cli() {
		return dni_cli;
	}

	public void setDni_cli(int dni_cli) {
		this.dni_cli = dni_cli;
	}

}
