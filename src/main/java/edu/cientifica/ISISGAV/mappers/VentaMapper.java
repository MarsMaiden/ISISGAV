package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Venta;

@Mapper
public interface VentaMapper {

	public int insertarVenta(Venta venta);
	public int GetLastIDVenta();
	public List<Venta> listarVentas();
}
