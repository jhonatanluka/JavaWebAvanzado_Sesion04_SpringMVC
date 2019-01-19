package com.tecsup.jwa.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.jwa.Sesion04.modelo.*;

@Controller
@RequestMapping("/grupo")
public class GrupoController {
//spring-mvc-showcase
	private static final Logger logger = LoggerFactory.getLogger(GrupoController.class);
//https://github.com/jgomezm-tecsup/JavaWebAvanzado-Sesion04-SpringMVC-CRUD/tree/master/src/test/resources
	
	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView t = 
				new ModelAndView("grupo/formulario", "grupo", new Grupo());

		return t;
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute Grupo grupo, ModelMap model) {

		model.addAttribute("codigo",grupo.getcodigo());
		model.addAttribute("nombre", grupo.getnombre());
		model.addAttribute("descripcion", grupo.getDescripcion());

		return "grupo/resultado";
	}

}
