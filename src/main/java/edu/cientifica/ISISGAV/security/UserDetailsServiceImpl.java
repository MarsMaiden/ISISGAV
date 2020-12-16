package edu.cientifica.ISISGAV.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.UsuarioMapper;
import edu.cientifica.ISISGAV.model.Tipo_Usuario;
import edu.cientifica.ISISGAV.model.Usuario;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioMapper usuarioMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioMapper.findbyUser(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(usuario.getUsuario(), usuario.getPass(), roles); 
		
		return userDet;
	}
}
