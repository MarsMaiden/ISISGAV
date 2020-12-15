package edu.cientifica.ISISGAV.model;

import java.sql.Date;

public class Venta {

	private int id_Venta;
	private String cod_ven;
	private Empleado empleado;
	private Cliente cliente;
	private Forma_Pago forma_Pago;
	private int id_comprobante_pago;
	private String desc_comprobante;
	private Date fecha_venta;
	private double sub_total;
	private double igv;
	private double importe_venta;

	public Venta(int id_Venta, String cod_ven, Empleado empleado, Cliente cliente, Forma_Pago forma_Pago,
			int id_comprobante_pago, String desc_comprobante, Date fecha_venta, double sub_total, double igv,
			double importe_venta) {
		super();
		this.id_Venta = id_Venta;
		this.cod_ven = cod_ven;
		this.empleado = empleado;
		this.cliente = cliente;
		this.forma_Pago = forma_Pago;
		this.id_comprobante_pago = id_comprobante_pago;
		this.desc_comprobante = desc_comprobante;
		this.fecha_venta = fecha_venta;
		this.sub_total = sub_total;
		this.igv = igv;
		this.importe_venta = importe_venta;
	}

	public Venta() {
		super();
	}

	public int getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(int id_Venta) {
		this.id_Venta = id_Venta;
	}

	public String getCod_ven() {
		return cod_ven;
	}

	public void setCod_ven(String cod_ven) {
		this.cod_ven = cod_ven;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Forma_Pago getForma_Pago() {
		return forma_Pago;
	}

	public void setForma_Pago(Forma_Pago forma_Pago) {
		this.forma_Pago = forma_Pago;
	}

	public int getId_comprobante_pago() {
		return id_comprobante_pago;
	}

	public void setId_comprobante_pago(int id_comprobante_pago) {
		this.id_comprobante_pago = id_comprobante_pago;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public double getSub_total() {
		return sub_total;
	}

	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getImporte_venta() {
		return importe_venta;
	}

	public void setImporte_venta(double importe_venta) {
		this.importe_venta = importe_venta;
	}

	public String getDesc_comprobante() {
		return desc_comprobante;
	}

	public void setDesc_comprobante(String desc_comprobante) {
		this.desc_comprobante = desc_comprobante;
	}

}
