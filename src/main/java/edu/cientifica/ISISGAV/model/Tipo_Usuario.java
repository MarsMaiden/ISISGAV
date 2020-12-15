package edu.cientifica.ISISGAV.model;

public class Tipo_Usuario {

	private int id_tipouser;
	private String desc_user;

	public Tipo_Usuario(int id_tipouser, String desc_user) {
		super();
		this.id_tipouser = id_tipouser;
		this.desc_user = desc_user;
	}

	public Tipo_Usuario() {
		super();
	}

	public int getId_tipouser() {
		return id_tipouser;
	}

	public void setId_tipouser(int id_tipouser) {
		this.id_tipouser = id_tipouser;
	}

	public String getDesc_user() {
		return desc_user;
	}

	public void setDesc_user(String desc_user) {
		this.desc_user = desc_user;
	}

}
