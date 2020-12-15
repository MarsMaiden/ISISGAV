package edu.cientifica.ISISGAV.model;

public class Detalle_VentaResponse {

	private int ventaid;
	private int articuloid;
	private int cant;
	private int id;

	public int getVentaid() {
		return ventaid;
	}

	public void setVentaid(int ventaid) {
		this.ventaid = ventaid;
	}

	public int getArticuloid() {
		return articuloid;
	}

	public void setArticuloid(int articuloid) {
		this.articuloid = articuloid;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Detalle_VentaResponse() {
		super();
	}

	public Detalle_VentaResponse(int ventaid, int articuloid, int cant, int id) {
		super();
		this.ventaid = ventaid;
		this.articuloid = articuloid;
		this.cant = cant;
		this.id = id;
	}

}
