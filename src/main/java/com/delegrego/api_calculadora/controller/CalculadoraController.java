package com.delegrego.api_calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegrego.api_calculadora.dto.CalculadoraRequisicao;
import com.delegrego.api_calculadora.dto.CalculadoraResposta;
import com.delegrego.api_calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	private final CalculadoraService servico;

	// @Autowired
	public CalculadoraController(CalculadoraService servico) {
		this.servico = servico;
	}

	@PostMapping("/somar")
	public CalculadoraResposta somar(@RequestBody CalculadoraRequisicao requisicao) {
		return servico.somar(requisicao);
	}

	@PostMapping("/subtrair")
	public CalculadoraResposta subtrair(@RequestBody CalculadoraRequisicao requisicao) {
		return servico.subtrair(requisicao);
	}

	@PostMapping("/multiplicar")
	public CalculadoraResposta multiplicar(@RequestBody CalculadoraRequisicao requisicao) {
		return servico.multiplicar(requisicao);
	}

	@PostMapping("/dividir")
	public CalculadoraResposta dividir(@RequestBody CalculadoraRequisicao requisicao) {
		return servico.dividir(requisicao);
	}

}
