package edu.cientifica.ISISGAV.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.ISISGAV.model.Usuario;
import edu.cientifica.ISISGAV.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("/validar")
	public String validarUsuario(Model model, @RequestParam (name="username") String username,
			@RequestParam (name="pass") String pass) {
		Usuario usuario=new Usuario (null,username, pass,null);
		
		if(usuarioService.validarUsuario(usuario)) {
			return "redirect:/venta/form";
		}
		return "index";		
	}
}