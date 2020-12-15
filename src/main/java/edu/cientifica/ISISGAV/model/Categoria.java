package edu.cientifica.ISISGAV.model;

public class Categoria {

	private int id_Categoria;
	private String cod_cat;
	private String desc_cat;

	public Categoria(int id_Categoria, String cod_cat, String desc_cat) {
		super();
		this.id_Categoria = id_Categoria;
		this.cod_cat = cod_cat;
		this.desc_cat = desc_cat;
	}

	public Categoria() {
		super();
	}

	public int getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getCod_cat() {
		return cod_cat;
	}

	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}

	public String getDesc_cat() {
		return desc_cat;
	}

	public void setDesc_cat(String desc_cat) {
		this.desc_cat = desc_cat;
	}

}
