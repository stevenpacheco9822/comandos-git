package com.rspacheco.apijava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@GetMapping("/saludo/{nombre}")
	public String saludar(@PathVariable String nombre) {
		return "Hola " + nombre;
	}
	
	@PostMapping("/api")
	public String saludoMejorado(@RequestBody String nombre) {
		return "Hola " + nombre;
	}
}
