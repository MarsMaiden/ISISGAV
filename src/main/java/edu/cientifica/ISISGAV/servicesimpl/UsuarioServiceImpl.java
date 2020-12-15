package edu.cientifica.ISISGAV.servicesimpl;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Usuario;
import edu.cientifica.ISISGAV.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public boolean validarUsuario(Usuario usuario) {
		if(usuario.getUsuario().equals("Eduardo")) {
			if(usuario.getPass().equals("edu")) {
				return true;
			}
		}
		return false;
	}
}