package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Articulo;

@Service
public interface ArticuloService {
	
	public List<Articulo> listarArticulo();
	public int insertarArticulo(Articulo articulo);
	public int GetNewIDArticulo();
	public List<Articulo> listarByCODART(String cod_art);
	public List<Articulo> listarFiltroArticulo(String nom_art);
}
