package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Articulo;

@Mapper
public interface ArticuloMapper {

	public List<Articulo> listarArticulo();
	public int insertarArticulo(Articulo articulo);
	public int GetNewIDArticulo();
	public List<Articulo> listarByCODART(String cod_art);
	public List<Articulo> listarFiltroArticulo(String nom_art);

}