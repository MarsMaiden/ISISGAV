package edu.cientifica.ISISGAV.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.ISISGAV.model.Articulo;
import edu.cientifica.ISISGAV.model.Categoria;
import edu.cientifica.ISISGAV.model.Detalle_Venta;
import edu.cientifica.ISISGAV.model.Detalle_VentaResponse;
import edu.cientifica.ISISGAV.model.Empleado;
import edu.cientifica.ISISGAV.model.Venta;
import edu.cientifica.ISISGAV.services.ArticuloService;
import edu.cientifica.ISISGAV.services.ClienteService;
import edu.cientifica.ISISGAV.services.Detalle_VentaService;
import edu.cientifica.ISISGAV.services.EmpleadoService;
import edu.cientifica.ISISGAV.services.Forma_PagoService;
import edu.cientifica.ISISGAV.services.VentaService;

@Controller
@RequestMapping("/venta")
public class VentaController {
	
	protected final Log LOG =  LogFactory.getLog(this.getClass());

	@Autowired
	private VentaService ventaService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private Forma_PagoService forma_pagoService;
	
	@Autowired
	private ArticuloService articuloService;
	
	@Autowired
	private Detalle_VentaService detalle_ventaService;
	
	
	@GetMapping("/list")
	public String listarVentas(Model model) {
				
		model.addAttribute("listarVenta", ventaService.listarVentas());		
		return "venta_list";		
	}
	
	@GetMapping("/{id_venta}/detalle")
	public String detalleVentabyID(Model model, @PathVariable (name = "id_venta") int id_venta ) {
		
		model.addAttribute("listarDetalleVentaID", detalle_ventaService.detalleVentabyID(id_venta));
		
		return "venta_DetallebyID";
	}
	
	
	@GetMapping("/form")
	public String formVenta(Model model) {
		
		
		Venta venta = new Venta();
		model.addAttribute("ventas", venta);
		
		List<Empleado> listarEmpleado = empleadoService.listarEmpleado();
		
		model.addAttribute("listarEmpleado", empleadoService.listarEmpleado());
		model.addAttribute("listarCliente", clienteService.listarCliente());
		model.addAttribute("listarFormapago",forma_pagoService.listarFormaPago());
		
		return "venta_form";
	}
	
	@PostMapping("/registrar")
	public String registraVenta(@ModelAttribute("ventas") Venta venta,
			BindingResult errors, Model model, RedirectAttributes attribute) {
		
		Venta id = new Venta();
		id.setId_Venta(ventaService.GetLastIDVenta());
		
		model.addAttribute("ids", id);		
		
		int result = ventaService.insertarVenta(venta);
		
		LOG.info("registros insertados: "+ result);
		
		return "venta_detalle";		
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String detalleVenta(Model model) {
		
		Articulo articulo = new Articulo();
		model.addAttribute("pruebas", articulo);
		return "venta_detalle";
	}
	
	@RequestMapping(value = "/details/{cod_art}", method = RequestMethod.GET)
	public String detalleVentaBuscar(Model model, @PathVariable("cod_art") String cod_art) {
		
		model.addAttribute("listarArticulo", articuloService.listarByCODART(cod_art));		
		return "results::buscar_cod_art";
	}
	
	
	@PostMapping(value = "/detalle", consumes="application/json")
	public String insertarDetalleVenta(@RequestBody List<Detalle_VentaResponse> detalleVenta) {
		
		int result = detalle_ventaService.insertarDetalleVenta(detalleVenta);
		
		LOG.info("registros insertados: "+ result);
		
		
		return "index";
		
	}	
}
