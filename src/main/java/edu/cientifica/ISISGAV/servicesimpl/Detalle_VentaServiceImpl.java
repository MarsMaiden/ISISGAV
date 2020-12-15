package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.Detalle_VentaMapper;
import edu.cientifica.ISISGAV.model.Detalle_Venta;
import edu.cientifica.ISISGAV.model.Detalle_VentaResponse;
import edu.cientifica.ISISGAV.services.Detalle_VentaService;

@Service
public class Detalle_VentaServiceImpl implements Detalle_VentaService{
	protected final Log LOG =  LogFactory.getLog(this.getClass());
	
	@Autowired
	private Detalle_VentaMapper detalle_VentaMapper;

	@Override
	public int insertarDetalleVenta(List<Detalle_VentaResponse> listaDetalleVentaResponse) {

		int result = 0;
		
		if	(listaDetalleVentaResponse.size()>0) {
			result = detalle_VentaMapper.insertarDetalleVenta(listaDetalleVentaResponse);
		}
		return result;
	}

	@Override
	public List<Detalle_Venta> detalleVentabyID(int id_venta) {
		return detalle_VentaMapper.detalleVentabyID(id_venta);
	}
}