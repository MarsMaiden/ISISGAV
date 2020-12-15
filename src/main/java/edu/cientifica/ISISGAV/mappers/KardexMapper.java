package edu.cientifica.ISISGAV.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KardexMapper {

	public int getStockActual(String cod_art);
}
