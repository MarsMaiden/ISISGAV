package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.UsuarioMapper;
import edu.cientifica.ISISGAV.model.Usuario;
import edu.cientifica.ISISGAV.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioMapper usuarioMapper;

	@Override
	public boolean validarUsuario(Usuario usuario) {
		if(usuario.getUsuario().equals("Eduardo")) {
			if(usuario.getPass().equals("edu")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Usuario findbyUser(String usuario) {
		// TODO Auto-generated method stub
		return usuarioMapper.findbyUser(usuario);
	}

	
	
}