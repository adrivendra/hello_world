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
	            "Engajamento de empregadores e levantamento de vagas desde o início",
	            "Recrutamento de jovens (18-30 anos) com base em características intrínsecas e requisitos profissionais para a profissão",
	            "De 10 a 12 semanas de treinamento intensivo em habilidades técnicas, comportamentais, mentalidade + serviços de apoio social (ex: auxílio internet, notebook e bolsa)",
	            "Conexão com mercado de trabalho (Feira de Projetos e Indicações)",
	            "Mentoria durante e após o programa e comunidade de alumni que acompanham os alunos no local de trabalho",
	            "Cálculo de retorno sobre o investimento (ROI) para empregadores, estudantes e sociedade",
	            "Uma abordagem centrada em monitoramento e avaliação de dados em cada etapa"
	        );
	}
}
