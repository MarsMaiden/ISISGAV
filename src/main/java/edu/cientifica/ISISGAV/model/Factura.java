package edu.cientifica.ISISGAV.model;

public class Factura {

	private int id_Factura;
	private String cod_fac;
	private Venta venta;

	public Factura(int id_Factura, String cod_fac, Venta venta) {
		super();
		this.id_Factura = id_Factura;
		this.cod_fac = cod_fac;
		this.venta = venta;
	}

	public Factura() {
		super();
	}

	public int getId_Factura() {
		return id_Factura;
	}

	public void setId_Factura(int id_Factura) {
		this.id_Factura = id_Factura;
	}

	public String getCod_fac() {
		return cod_fac;
	}

	public void setCod_fac(String cod_fac) {
		this.cod_fac = cod_fac;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}
