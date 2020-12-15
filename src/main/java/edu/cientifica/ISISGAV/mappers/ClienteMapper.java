package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Cliente;

@Mapper
public interface ClienteMapper {

	public List<Cliente> listarCliente();
	
}
