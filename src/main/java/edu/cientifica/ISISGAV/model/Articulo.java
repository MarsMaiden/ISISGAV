package edu.cientifica.ISISGAV.model;

public class Articulo {

	private int id_Articulo;
	private String cod_art;
	private String nom_art;
	private String marca_art;
	private String desc_art;
	private double precio_venta;
	private Categoria categoria;
	private int stock_actual;

	public Articulo(int id_Articulo, String cod_art, String nom_art, String marca_art, String desc_art,
			double precio_venta, Categoria categoria, int stock_actual) {
		super();
		this.id_Articulo = id_Articulo;
		this.cod_art = cod_art;
		this.nom_art = nom_art;
		this.marca_art = marca_art;
		this.desc_art = desc_art;
		this.precio_venta = precio_venta;
		this.categoria = categoria;
		this.stock_actual = stock_actual;
	}

	public Articulo() {
		super();
	}

	public int getId_Articulo() {
		return id_Articulo;
	}

	public void setId_Articulo(int id_Articulo) {
		this.id_Articulo = id_Articulo;
	}

	public String getCod_art() {
		return cod_art;
	}

	public void setCod_art(String cod_art) {
		this.cod_art = cod_art;
	}

	public String getNom_art() {
		return nom_art;
	}

	public void setNom_art(String nom_art) {
		this.nom_art = nom_art;
	}

	public String getMarca_art() {
		return marca_art;
	}

	public void setMarca_art(String marca_art) {
		this.marca_art = marca_art;
	}

	public String getDesc_art() {
		return desc_art;
	}

	public void setDesc_art(String desc_art) {
		this.desc_art = desc_art;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getStock_actual() {
		return stock_actual;
	}

	public void setStock_actual(int stock_actual) {
		this.stock_actual = stock_actual;
	}

}
