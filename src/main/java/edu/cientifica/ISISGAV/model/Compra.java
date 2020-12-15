package edu.cientifica.ISISGAV.model;

import java.sql.Date;

public class Compra {

	private int id_Compra;
	private String cod_compra;
	private Empleado empleado;
	private Proveedor proveedor;
	private String id_factura;
	private Date fecha_compra;
	private double importe_compra;

	public Compra(int id_Compra, String cod_compra, Empleado empleado, Proveedor proveedor, String id_factura,
			Date fecha_compra, double importe_compra) {
		super();
		this.id_Compra = id_Compra;
		this.cod_compra = cod_compra;
		this.empleado = empleado;
		this.proveedor = proveedor;
		this.id_factura = id_factura;
		this.fecha_compra = fecha_compra;
		this.importe_compra = importe_compra;
	}

	public Compra() {
		super();
	}

	public int getId_Compra() {
		return id_Compra;
	}

	public void setId_Compra(int id_Compra) {
		this.id_Compra = id_Compra;
	}

	public String getCod_compra() {
		return cod_compra;
	}

	public void setCod_compra(String cod_compra) {
		this.cod_compra = cod_compra;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public String getId_factura() {
		return id_factura;
	}

	public void setId_factura(String id_factura) {
		this.id_factura = id_factura;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public double getImporte_compra() {
		return importe_compra;
	}

	public void setImporte_compra(double importe_compra) {
		this.importe_compra = importe_compra;
	}

}
