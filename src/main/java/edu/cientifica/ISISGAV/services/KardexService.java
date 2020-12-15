package edu.cientifica.ISISGAV.services;

import org.springframework.stereotype.Service;

@Service
public interface KardexService {

	public int getStockActual(String cod_art);
}
