package edu.cientifica.ISISGAV.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import edu.cientifica.ISISGAV.model.Usuario;
import edu.cientifica.ISISGAV.services.UsuarioService;

@Controller
public class InicioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping({"/","/login"})
	public String Inicio() {
		return "index";
	}	
	
	@GetMapping("/home")
	public String Home() {		
		return "home";
	}
}