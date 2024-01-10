package com.generation.helloworld.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BSMGenerationController {
	@GetMapping
	public List<String> bsmGeneration() {
		return Arrays.asList(
	            "Proatividade",
	            "Trabalho em equipe",
	            "Comunicação efetiva e não violenta",
	            "Responsabilidade pessoal",
	            "Mentalidade de crescimento",
	            "Orientação ao futuro",
	            "Atenção aos detalhes",
	            "Persistência"
	        );
	}
}
