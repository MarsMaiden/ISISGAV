package edu.cientifica.ISISGAV.model;

import java.sql.Date;

public class Kardex {

	private int id_Kardex;
	private Date fecha_kardex;
	private int stock_actual;
	private double valor_stock_actual;
	private Articulo articulo;
	private Compra compra;
	private Venta venta;

	public Kardex(int id_Kardex, Date fecha_kardex, int stock_actual, double valor_stock_actual, Articulo articulo,
			Compra compra, Venta venta) {
		super();
		this.id_Kardex = id_Kardex;
		this.fecha_kardex = fecha_kardex;
		this.stock_actual = stock_actual;
		this.valor_stock_actual = valor_stock_actual;
		this.articulo = articulo;
		this.compra = compra;
		this.venta = venta;
	}

	public Kardex() {
		super();
	}

	public int getId_Kardex() {
		return id_Kardex;
	}

	public void setId_Kardex(int id_Kardex) {
		this.id_Kardex = id_Kardex;
	}

	public Date getFecha_kardex() {
		return fecha_kardex;
	}

	public void setFecha_kardex(Date fecha_kardex) {
		this.fecha_kardex = fecha_kardex;
	}

	public int getStock_actual() {
		return stock_actual;
	}

	public void setStock_actual(int stock_actual) {
		this.stock_actual = stock_actual;
	}

	public double getValor_stock_actual() {
		return valor_stock_actual;
	}

	public void setValor_stock_actual(double valor_stock_actual) {
		this.valor_stock_actual = valor_stock_actual;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}
