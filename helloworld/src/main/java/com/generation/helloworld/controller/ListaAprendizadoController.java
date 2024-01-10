package com.generation.helloworld.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/lista-aprendizado")
public class ListaAprendizadoController {
	@GetMapping
	public List<String> listaAprendizado() {
		return Arrays.asList(
	            "Melhorar minhas habilidades ténicas",
	            "Dominar o Java e suas funcionalidades",
	            "Conseguir manter uma rotina mais saudavel e regulada!"
	        );
	}
}
