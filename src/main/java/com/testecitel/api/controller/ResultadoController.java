package com.testecitel.api.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testecitel.api.model.Resultado;

public class ResultadoController {

	

	@RequestMapping(value = "/salvarResultado", method = RequestMethod.POST)
	public int Post(@Validated @RequestBody Resultado resultado) {
		
		return 0;
	}
}
