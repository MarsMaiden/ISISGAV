package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.VentaMapper;
import edu.cientifica.ISISGAV.model.Venta;
import edu.cientifica.ISISGAV.services.VentaService;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaMapper ventaMapper;
	
	@Override
	public int insertarVenta(Venta venta) {
		return ventaMapper.insertarVenta(venta);
	}

	@Override
	public int GetLastIDVenta() {
		return ventaMapper.GetLastIDVenta();
	}

	@Override
	public List<Venta> listarVentas() {
		return ventaMapper.listarVentas();
	}

}