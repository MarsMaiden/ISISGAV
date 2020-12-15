package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.CategoriaMapper;
import edu.cientifica.ISISGAV.model.Categoria;
import edu.cientifica.ISISGAV.services.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaMapper categoriaMapper;
	
	@Override
	public List<Categoria> listarCategoria() {
		return categoriaMapper.listarCategoria();
	}

	@Override
	public int insertarCategoria(Categoria categoria) {
		int result;
		result = categoriaMapper.insertarCategoria(categoria);
		return result;
	}

	@Override
	public int GetNewIDCategoria() {
		return categoriaMapper.GetNewIDCategoria();
	}
}
