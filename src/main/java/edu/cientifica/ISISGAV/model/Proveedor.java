package edu.cientifica.ISISGAV.model;

public class Proveedor {

	private int id_Proveedor;
	private String cod_prov;
	private long ruc_prov;
	private String razon_social;
	private String dir_prov;
	private String tel_prov;
	private String correo_prov;

	public Proveedor(int id_Proveedor, String cod_prov, long ruc_prov, String razon_social, String dir_prov,
			String tel_prov, String correo_prov) {
		super();
		this.id_Proveedor = id_Proveedor;
		this.cod_prov = cod_prov;
		this.ruc_prov = ruc_prov;
		this.razon_social = razon_social;
		this.dir_prov = dir_prov;
		this.tel_prov = tel_prov;
		this.correo_prov = correo_prov;
	}

	public Proveedor() {
		super();
	}

	public int getId_Proveedor() {
		return id_Proveedor;
	}

	public void setId_Proveedor(int id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}

	public String getCod_prov() {
		return cod_prov;
	}

	public void setCod_prov(String cod_prov) {
		this.cod_prov = cod_prov;
	}

	public long getRuc_prov() {
		return ruc_prov;
	}

	public void setRuc_prov(long ruc_prov) {
		this.ruc_prov = ruc_prov;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDir_prov() {
		return dir_prov;
	}

	public void setDir_prov(String dir_prov) {
		this.dir_prov = dir_prov;
	}

	public String getTel_prov() {
		return tel_prov;
	}

	public void setTel_prov(String tel_prov) {
		this.tel_prov = tel_prov;
	}

	public String getCorreo_prov() {
		return correo_prov;
	}

	public void setCorreo_prov(String correo_prov) {
		this.correo_prov = correo_prov;
	}

}
