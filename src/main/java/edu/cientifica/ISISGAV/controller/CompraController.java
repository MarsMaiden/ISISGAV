package edu.cientifica.ISISGAV.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cientifica.ISISGAV.model.Compra;
import edu.cientifica.ISISGAV.services.CompraService;
import edu.cientifica.ISISGAV.services.EmpleadoService;

@Controller
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/form")
	public String formCompra(Model model) {
		
		Compra compra = new Compra();
		model.addAttribute("compras", compra);		
		
		return null;
		
	}

}
