package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Categoria;

@Service
public interface CategoriaService {
	
	public List<Categoria> listarCategoria();
	public int insertarCategoria(Categoria categoria);
	public int GetNewIDCategoria();
	
}
