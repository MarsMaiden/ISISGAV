package edu.cientifica.ISISGAV.controller;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.ISISGAV.model.Categoria;
import edu.cientifica.ISISGAV.services.CategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping("/list")
	public String listaCategoria(Model model) {
		
		model.addAttribute("categorias", categoriaService.listarCategoria());
		return "categoria_list";
	}
	
	@GetMapping("/form")
	public String formCategoria(Model model) {
		
		Categoria categoria = new Categoria();		
		model.addAttribute("categorias", categoria);
		
		categoria.setId_Categoria(categoriaService.GetNewIDCategoria());
		
		return "categoria_form";		
	}
	
	@PostMapping("/registrar")
	public String registrarCategoria( @ModelAttribute("categorias") Categoria categoria,
			BindingResult errors, Model model, RedirectAttributes attribute) {
		
		int result = categoriaService.insertarCategoria(categoria);
		return "redirect:/categoria/list";		
	}	
}
