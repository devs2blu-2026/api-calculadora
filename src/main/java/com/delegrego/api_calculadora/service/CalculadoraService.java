package com.delegrego.api_calculadora.service;

import org.springframework.stereotype.Service;

import com.delegrego.api_calculadora.dto.CalculadoraRequisicao;
import com.delegrego.api_calculadora.dto.CalculadoraResposta;

@Service
public class CalculadoraService {

	public CalculadoraResposta somar(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.getNumero1() + requisicao.getNumero2();

		return new CalculadoraResposta(requisicao.getNumero1(), requisicao.getNumero2(), "soma", resultado);
	}

	public CalculadoraResposta subtrair(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.getNumero1() - requisicao.getNumero2();

		return new CalculadoraResposta(requisicao.getNumero1(), requisicao.getNumero2(), "subtração", resultado);
	}

	public CalculadoraResposta multiplicar(CalculadoraRequisicao requisicao) {
		double resultado = requisicao.getNumero1() * requisicao.getNumero2();

		return new CalculadoraResposta(requisicao.getNumero1(), requisicao.getNumero2(), "multiplicação", resultado);
	}

	public CalculadoraResposta dividir(CalculadoraRequisicao requisicao) {

		double resultado;

		if (requisicao.getNumero2() == 0) {
			resultado = 0;
		} else {
			resultado = requisicao.getNumero1() / requisicao.getNumero2();
		}

		// resultado = requisicao.getNumero2() == 0 ? 0 : requisicao.getNumero1() / requisicao.getNumero2();

		return new CalculadoraResposta(requisicao.getNumero1(), requisicao.getNumero2(), "divisão", resultado);
	}

}
