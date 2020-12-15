package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.cientifica.ISISGAV.model.Detalle_Venta;
import edu.cientifica.ISISGAV.model.Detalle_VentaResponse;

@Mapper
public interface Detalle_VentaMapper {
	
	public int insertarDetalleVenta(@Param("listaDetalleVenta")List<Detalle_VentaResponse> listaDetalleVenta);
	public List<Detalle_Venta> detalleVentabyID (int id_venta);
	
}
