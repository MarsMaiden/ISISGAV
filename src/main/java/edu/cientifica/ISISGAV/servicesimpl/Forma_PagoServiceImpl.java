package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.Forma_PagoMapper;
import edu.cientifica.ISISGAV.model.Forma_Pago;
import edu.cientifica.ISISGAV.services.Forma_PagoService;

@Service
public class Forma_PagoServiceImpl implements Forma_PagoService{

	@Autowired
	private Forma_PagoMapper forma_pagoMapper;
	
	@Override
	public List<Forma_Pago> listarFormaPago() {
		return forma_pagoMapper.listarFormaPago();
	}
	
}