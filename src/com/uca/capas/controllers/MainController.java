package com.uca.capas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
			
		mav.setViewName("index");
		mav.addObject("message", "Ingrese un nuevo producto");
		mav.addObject("product", new Product());
		
		return mav;
	}
	
	@RequestMapping("/pushProduct")
	public ModelAndView processData(@Valid Product product, BindingResult result) {
		ModelAndView mav =  new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
			mav.addObject("message", "Error en el producto");
			mav.addObject("product", product);
		}else {
			mav.setViewName("result");
			mav.addObject("message", "Producto anadido correctamente");
			mav.addObject("product", new Product());
		}
		
		return mav;
	}
	
}
