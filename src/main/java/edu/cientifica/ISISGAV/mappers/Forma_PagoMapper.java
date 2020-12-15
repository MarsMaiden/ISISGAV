package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Forma_Pago;

@Mapper
public interface Forma_PagoMapper {

	public List<Forma_Pago> listarFormaPago();
	
}
