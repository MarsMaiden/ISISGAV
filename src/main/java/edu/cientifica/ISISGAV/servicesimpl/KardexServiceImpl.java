package edu.cientifica.ISISGAV.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.KardexMapper;
import edu.cientifica.ISISGAV.services.KardexService;

@Service
public class KardexServiceImpl implements KardexService {
	
	@Autowired
	private KardexMapper kardexMapper;

	@Override
	public int getStockActual(String cod_art) {
		return kardexMapper.getStockActual(cod_art);
	}

}
