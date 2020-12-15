package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Detalle_Venta;
import edu.cientifica.ISISGAV.model.Detalle_VentaResponse;

@Service
public interface Detalle_VentaService {

	public int insertarDetalleVenta(@Param("listaDetalleVenta")List<Detalle_VentaResponse> listaDetalleVentaResponse);
	public List<Detalle_Venta> detalleVentabyID (int id_venta);
}
