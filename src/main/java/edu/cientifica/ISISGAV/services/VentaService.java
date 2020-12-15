package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Venta;


@Service
public interface VentaService {

	public int insertarVenta(Venta venta);
	public int GetLastIDVenta();
	public List<Venta> listarVentas();
}
