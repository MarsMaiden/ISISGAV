package edu.cientifica.ISISGAV.model;

public class Cliente {

	private int id_Cliente;
	private String cod_cli;
	private long ruc_cli;
	private String dir_cli;
	private String correo_cli;
	private String tel_cli;

	public Cliente(int id_Cliente, String cod_cli, long ruc_cli, String dir_cli, String correo_cli, String tel_cli) {
		super();
		this.id_Cliente = id_Cliente;
		this.cod_cli = cod_cli;
		this.ruc_cli = ruc_cli;
		this.dir_cli = dir_cli;
		this.correo_cli = correo_cli;
		this.tel_cli = tel_cli;
	}

	public Cliente() {
		super();
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}

	public long getRuc_cli() {
		return ruc_cli;
	}

	public void setRuc_cli(long ruc_cli) {
		this.ruc_cli = ruc_cli;
	}

	public String getDir_cli() {
		return dir_cli;
	}

	public void setDir_cli(String dir_cli) {
		this.dir_cli = dir_cli;
	}

	public String getCorreo_cli() {
		return correo_cli;
	}

	public void setCorreo_cli(String correo_cli) {
		this.correo_cli = correo_cli;
	}

	public String getTel_cli() {
		return tel_cli;
	}

	public void setTel_cli(String tel_cli) {
		this.tel_cli = tel_cli;
	}

}
