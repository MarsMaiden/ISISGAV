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

		Usuario user = usuarioMapper.findbyUser(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		
		List grantList = new ArrayList<>();
		for (Tipo_Usuario rol: user.getTipo_Usuario()) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(rol.getDesc_user());
			grantList.add(grantedAuthority);
		}		

		UserDetails usuario = (UserDetails) new User(user.getUsuario(), user.getPass(), grantList);

		return usuario;
	}
}
