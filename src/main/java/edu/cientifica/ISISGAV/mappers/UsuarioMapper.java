package edu.cientifica.ISISGAV.mappers;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Usuario;

@Mapper
public interface UsuarioMapper {

	public Usuario findbyUser(String usuario);
}
