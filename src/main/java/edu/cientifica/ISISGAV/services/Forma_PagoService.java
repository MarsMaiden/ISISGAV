package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Forma_Pago;

@Service
public interface Forma_PagoService {
	
	public List<Forma_Pago> listarFormaPago();
}
