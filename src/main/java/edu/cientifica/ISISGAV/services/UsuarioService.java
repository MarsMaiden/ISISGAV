package edu.cientifica.ISISGAV.services;

import edu.cientifica.ISISGAV.model.Usuario;

public interface UsuarioService {
	public Usuario findbyUser(String usuario);
	public boolean validarUsuario(Usuario usuario);
}
