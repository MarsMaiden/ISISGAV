package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Categoria;

@Mapper
public interface CategoriaMapper {

	public List<Categoria>listarCategoria();
	public int insertarCategoria(Categoria categoria);
	public int GetNewIDCategoria();
	
}
