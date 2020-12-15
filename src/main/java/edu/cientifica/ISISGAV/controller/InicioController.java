package edu.cientifica.ISISGAV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	@RequestMapping("/index")
	public String Inicio() {
		return "index";
	}
	@GetMapping("/venta")
	public String Venta() {
		return "venta_form";
	}
}