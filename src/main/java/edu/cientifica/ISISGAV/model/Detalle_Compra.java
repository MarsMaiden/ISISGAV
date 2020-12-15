package edu.cientifica.ISISGAV.model;

public class Detalle_Compra {

	private int id_Detalle_Compra;
	private Compra compra;
	private Articulo articulo;
	private int cant_compra;
	private double precio_compra;
	
	public Detalle_Compra(int id_Detalle_Compra, Compra compra, Articulo articulo, int cant_compra,
			double precio_compra) {
		super();
		this.id_Detalle_Compra = id_Detalle_Compra;
		this.compra = compra;
		this.articulo = articulo;
		this.cant_compra = cant_compra;
		this.precio_compra = precio_compra;
	}
	public Detalle_Compra() {
		super();
	}
	public int getId_Detalle_Compra() {
		return id_Detalle_Compra;
	}
	public void setId_Detalle_Compra(int id_Detalle_Compra) {
		this.id_Detalle_Compra = id_Detalle_Compra;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCant_compra() {
		return cant_compra;
	}
	public void setCant_compra(int cant_compra) {
		this.cant_compra = cant_compra;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	
}
