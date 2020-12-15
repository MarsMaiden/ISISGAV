package edu.cientifica.ISISGAV.model;

public class Boleta {

	private int id_Boleta;
	private String cod_bol;
	private Venta venta;

	public Boleta(int id_Boleta, String cod_bol, Venta venta) {
		super();
		this.id_Boleta = id_Boleta;
		this.cod_bol = cod_bol;
		this.venta = venta;
	}

	public Boleta() {
		super();
	}

	public int getId_Boleta() {
		return id_Boleta;
	}

	public void setId_Boleta(int id_Boleta) {
		this.id_Boleta = id_Boleta;
	}

	public String getCod_bol() {
		return cod_bol;
	}

	public void setCod_bol(String cod_bol) {
		this.cod_bol = cod_bol;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}
