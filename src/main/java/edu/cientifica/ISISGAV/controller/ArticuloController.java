package edu.cientifica.ISISGAV.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.ISISGAV.model.Articulo;
import edu.cientifica.ISISGAV.model.Categoria;
import edu.cientifica.ISISGAV.services.ArticuloService;
import edu.cientifica.ISISGAV.services.CategoriaService;
import edu.cientifica.ISISGAV.services.KardexService;

@Controller
@RequestMapping("/articulo")
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;

	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private KardexService kardexService;

	@GetMapping("/list")
	public String listarArticulo(Model model) {

		Articulo articulo = new Articulo();
		model.addAttribute("articulos", articulo);

		model.addAttribute("listarArticulo", articuloService.listarArticulo());
		return "articulo_list";
	}

	@GetMapping("/form")
	public String formArticulo(Model model) {

		Articulo articulo = new Articulo();
		List<Categoria> listarCategoria = categoriaService.listarCategoria();

		articulo.setId_Articulo(articuloService.GetNewIDArticulo());

		model.addAttribute("articulos", articulo);
		model.addAttribute("listarCategoria", listarCategoria);

		return "articulo_form";
	}

	@PostMapping("/registrar")
	public String registrarArticulo(@ModelAttribute("articulos") Articulo articulo, 
		BindingResult errors, Model model, RedirectAttributes attribute) {

		List<Categoria> listarCategoria = categoriaService.listarCategoria();

		model.addAttribute("listarCategoria", listarCategoria);
		int result = articuloService.insertarArticulo(articulo);

		return "redirect:/articulo/list";
	}

	@GetMapping("/searchform")
	public String buscarArticulo(Model model) {

		Articulo articulo = new Articulo();
		model.addAttribute("articulos", articulo);
		return "articulo_search";
	}

	@GetMapping("/search")
	public String listarFiltroArticulo(Model model, @RequestParam String nom_art,
			@ModelAttribute("articulos") Articulo articulo, BindingResult errors) {

		List<Articulo> listarfiltrarArticulo = articuloService.listarFiltroArticulo(nom_art);

		model.addAttribute("listarFiltrar", listarfiltrarArticulo);
		return "articulo_search";
	}

	@RequestMapping(value = "/{cod_art}", method = RequestMethod.GET)
	public String prueba3buscar(Model model, @PathVariable("cod_art") String cod_art) {
		
		List<Articulo> listArticulos = articuloService.listarByCODART(cod_art);
		model.addAttribute("listarArticulo", listArticulos);
		return "results::buscar_cod_art";
	}
}