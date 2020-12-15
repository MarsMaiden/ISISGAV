package edu.cientifica.ISISGAV.model;

public class Detalle_Venta {

	private int id_Detalle_Venta;
	private Venta venta;
	private Articulo articulo;
	private int cant_venta;

	public Detalle_Venta(int id_Detalle_Venta, Venta venta, Articulo articulo, int cant_venta) {
		super();
		this.id_Detalle_Venta = id_Detalle_Venta;
		this.venta = venta;
		this.articulo = articulo;
		this.cant_venta = cant_venta;
	}

	public Detalle_Venta(Venta venta, Articulo articulo, int cant_venta) {
		super();
		this.venta = venta;
		this.articulo = articulo;
		this.cant_venta = cant_venta;
	}

	public Detalle_Venta() {
		super();
	}

	public int getId_Detalle_Venta() {
		return id_Detalle_Venta;
	}

	public void setId_Detalle_Venta(int id_Detalle_Venta) {
		this.id_Detalle_Venta = id_Detalle_Venta;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCant_venta() {
		return cant_venta;
	}

	public void setCant_venta(int cant_venta) {
		this.cant_venta = cant_venta;
	}

}
