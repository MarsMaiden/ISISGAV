package edu.cientifica.ISISGAV.model;

public class Empleado {

	private int id_Empleado;
	private String cod_emp;
	private int dni_emp;
	private String nom_emp;
	private String ape_emp;
	private String tel_emp;
	private String correo_emp;
	private String dir_emp;

	public Empleado(int id_Empleado, String cod_emp, int dni_emp, String nom_emp, String ape_emp, String tel_emp,
			String correo_emp, String dir_emp) {
		super();
		this.id_Empleado = id_Empleado;
		this.cod_emp = cod_emp;
		this.dni_emp = dni_emp;
		this.nom_emp = nom_emp;
		this.ape_emp = ape_emp;
		this.tel_emp = tel_emp;
		this.correo_emp = correo_emp;
		this.dir_emp = dir_emp;
	}

	public Empleado() {
		super();
	}

	public int getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(int id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public String getCod_emp() {
		return cod_emp;
	}

	public void setCod_emp(String cod_emp) {
		this.cod_emp = cod_emp;
	}

	public int getDni_emp() {
		return dni_emp;
	}

	public void setDni_emp(int dni_emp) {
		this.dni_emp = dni_emp;
	}

	public String getNom_emp() {
		return nom_emp;
	}

	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}

	public String getApe_emp() {
		return ape_emp;
	}

	public void setApe_emp(String ape_emp) {
		this.ape_emp = ape_emp;
	}

	public String getTel_emp() {
		return tel_emp;
	}

	public void setTel_emp(String tel_emp) {
		this.tel_emp = tel_emp;
	}

	public String getCorreo_emp() {
		return correo_emp;
	}

	public void setCorreo_emp(String correo_emp) {
		this.correo_emp = correo_emp;
	}

	public String getDir_emp() {
		return dir_emp;
	}

	public void setDir_emp(String dir_emp) {
		this.dir_emp = dir_emp;
	}

}
