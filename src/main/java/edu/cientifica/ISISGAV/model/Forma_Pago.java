package edu.cientifica.ISISGAV.model;

public class Forma_Pago {

	private int id_Pago;
	private String desc_pago;

	public Forma_Pago(int id_Pago, String desc_pago) {
		super();
		this.id_Pago = id_Pago;
		this.desc_pago = desc_pago;
	}

	public Forma_Pago() {
		super();
	}

	public int getId_Pago() {
		return id_Pago;
	}

	public void setId_Pago(int id_Pago) {
		this.id_Pago = id_Pago;
	}

	public String getDesc_pago() {
		return desc_pago;
	}

	public void setDesc_pago(String desc_pago) {
		this.desc_pago = desc_pago;
	}

}
