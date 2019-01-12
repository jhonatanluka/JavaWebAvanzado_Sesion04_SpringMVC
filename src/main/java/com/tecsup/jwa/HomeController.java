package com.tecsup.jwa;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	//@RequestMapping(value = "/pares", method = RequestMethod.GET)
	@GetMapping("/pares")
	public String pares(Locale locale, Model model) {
		logger.info("obtencion de numeros pares", locale);
		
		
		String cadNroPares = "1 2 4 6 8";
		
		model.addAttribute("nroPares", cadNroPares );
		
		return "pares";
	}
	//@RequestMapping(value = "/impares", method = RequestMethod.GET)
	@GetMapping("/impares")
	public String impares(Locale locale, Model model) {
		logger.info("obtencion de numeros impares", locale);
		
		
		String cadNroImpares = "1 3 5 7 9 11 13";
		
		model.addAttribute("nroImpares", cadNroImpares );
		
		return "impares";
	}
}
