package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.ArticuloMapper;
import edu.cientifica.ISISGAV.model.Articulo;
import edu.cientifica.ISISGAV.services.ArticuloService;

@Service
public class ArticuloServiceImpl implements ArticuloService {
	
	@Autowired
	private ArticuloMapper articuloMapper;

	@Override
	public List<Articulo> listarArticulo() {
		return articuloMapper.listarArticulo();
	}

	@Override
	public int insertarArticulo(Articulo articulo) {
		int result = articuloMapper.insertarArticulo(articulo);
		return result;
	}

	@Override
	public int GetNewIDArticulo() {
		return articuloMapper.GetNewIDArticulo();
	}

	@Override
	public List<Articulo> listarByCODART(String cod_art) {
		return articuloMapper.listarByCODART(cod_art);
	}

	@Override
	public List<Articulo> listarFiltroArticulo(String nom_art) {
		return articuloMapper.listarFiltroArticulo(nom_art);
	}
}
