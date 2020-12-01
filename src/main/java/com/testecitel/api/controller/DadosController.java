package com.testecitel.api.controller;

import java.util.Date;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.testecitel.api.model.Dados;

import br.com.testecitel.Bean.DadosBean;
import br.com.testecitel.Bean.EstadosBean;
import br.com.testecitel.Bean.ResultadoBean;


@RestController
public class DadosController {

	private ResultadoBean resultadoBean;

	
	@RequestMapping(value = "/listarDados", method = RequestMethod.GET)
	@ResponseBody
	public String Get(@PathVariable("dados") String dados) {
		Gson gson = new Gson();
		Dados[] dadosJson = gson.fromJson(dados, Dados[].class);
		resultadoBean = new ResultadoBean();
		capturarDados(dados);
		return "Tudo certo";
	}
	
	
	
	public void capturarDados(String dadosJson) {
		resultadoBean.setListaDados(DadosBean.popularDados());
		for (int i = 0; i < resultadoBean.getListaDados().size(); i++) {
			calcularDados(resultadoBean.getListaDados().get(i));
		}
		if (resultadoBean.getImc10() > 0.0f && resultadoBean.getnImc10() > 0) {
			resultadoBean.setMediaImc10(resultadoBean.getImc10() / resultadoBean.getnImc10());
		}
		if (resultadoBean.getImc20() > 0.0f && resultadoBean.getnImc20() > 0) {
			resultadoBean.setMediaImc20(resultadoBean.getImc20() / resultadoBean.getnImc20());
		}
		if (resultadoBean.getImc30() > 0.0f && resultadoBean.getnImc30() > 0) {
			resultadoBean.setMediaImc30(resultadoBean.getImc30() / resultadoBean.getnImc30());
		}
		if (resultadoBean.getImcMais() > 0.0f && resultadoBean.getnImcMais() > 0) {
			resultadoBean.setMediaImcMais(resultadoBean.getImcMais() / resultadoBean.getnImcMais());
		}
		if (resultadoBean.getIdadeAMais() > 0.0f && resultadoBean.getnIdadeAMais() > 0) {
			idadeAMais = idadeAMais / nIdadeAMais;
		}
		if (idadeAMenos > 0 && nIdadeAMenos > 0) {
			idadeAMenos = idadeAMenos / nIdadeAMenos;
		}
		if (idadeBMais > 0 && nIdadeBMais > 0) {
			idadeBMais = idadeBMais / nIdadeBMais;
		}
		if (idadeBMenos > 0 && nIdadeBMenos > 0) {
			idadeBMenos = idadeBMenos / nIdadeBMenos;
		}
		if (idadeABMais > 0 && nIdadeABMais > 0) {
			idadeABMais = idadeABMais / nIdadeABMais;
		}
		if (idadeABMenos > 0 && nIdadeABMenos > 0) {
			idadeABMenos = idadeABMenos / nIdadeABMenos;
		}
		if (idadeOMais > 0 && nIdadeOMais > 0) {
			idadeOMais = idadeOMais / nIdadeOMais;
		}
		if (idadeOMenos > 0 && nIdadeOMenos > 0) {
			idadeOMenos = idadeOMenos / nIdadeOMenos;
		}
		if (nHomemObeso > 0 && totalHomem > 0) {
			percentualHomem = (nHomemObeso * 100) / listaDados.size();
		}
		if (nMulherObesa > 0 && totalMulher > 0) {
			percentualMulher = (nMulherObesa * 100) / listaDados.size();
		}
	}

	public void calcularDados(Dados dados) {
		Date dataNascimento = Formatacao.ConvercaoStringDataBrasil(dados.getData_nasc());
		int idade = Formatacao.getIdade(dataNascimento);
		float imc = dados.getPeso() / (dados.getAltura() * 2);
		if (idade <= 10) {
			imc10 = imc10 + imc;
			nImc10 = nImc10 + 1;
		} else if (idade > 10 && idade <= 20) {
			imc20 = imc20 + imc;
			nImc20 = nImc20 + 1;
		} else if (idade > 20 && idade <= 30) {
			imc30 = imc30 + imc;
			nImc30 = nImc30 + 1;
		} else {
			imcMais = imcMais + imc;
			nImcMais = nImcMais + 1;
		}
		if (dados.getSexo().equalsIgnoreCase("Masculino")) {
			if (imc >= 30) {
				nHomemObeso = nHomemObeso + 1;
				totalHomem = totalHomem + 1;
			}
		} else if (dados.getSexo().equalsIgnoreCase("Feminino")) {
			if (imc >= 30) {
				nMulherObesa = nMulherObesa + 1;
				totalMulher = totalMulher + 1;
			}
		}
		if (dados.getTipo_sanguineo().equalsIgnoreCase("A+")) {
			idadeAMais = idadeAMais + idade;
			nIdadeAMais = nIdadeAMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorAMais = nDoadorAMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("A-")) {
			idadeAMenos = idadeAMenos + idade;
			nIdadeAMenos = nIdadeAMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorAMenos = nDoadorAMenos + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("B+")) {
			idadeBMais = idadeBMais + idade;
			nIdadeBMais = nIdadeBMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorBMais = nDoadorBMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("B-")) {
			idadeBMenos = idadeBMenos + idade;
			nIdadeBMenos = nIdadeBMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorBMenos = nDoadorBMenos + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("AB+")) {
			idadeABMais = idadeABMais + idade;
			nIdadeABMais = nIdadeABMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorABMais = nDoadorABMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("AB-")) {
			idadeABMenos = idadeABMenos + idade;
			nIdadeABMenos = nIdadeABMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorABMenos = nDoadorABMenos + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("O+")) {
			idadeOMais = idadeOMais + idade;
			nIdadeOMais = nIdadeOMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorOMais = nDoadorOMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("O-")) {
			idadeOMenos = idadeOMenos + idade;
			nIdadeOMenos = nIdadeOMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorOMenos = nDoadorOMenos + 1;
			}
		}
		calcularNCandidatos(dados.getEstado());
	}

	public void instanciarVariaveis() {
		imc10 = 0.0f;
		imc20 = 0.0f;
		imc30 = 0.0f;
		imcMais = 0.0f;
		mediaImc10 = 0.0f;
		mediaImc20 = 0.0f;
		mediaImc30 = 0.0f;
		mediaImcMais = 0.0f;
		percentualHomem = 0.0f;
		percentualMulher = 0.0f;
	}
	
	
	public void calcularNCandidatos(String estadoCandidato) {
		estados = EstadosBean.adicionarCandidato(estados, estadoCandidato);
	}
	
	
	public String refazer() {
		return "index";
	}
	 
	 
	public void salvarResultado() {
		
		
		estados = estadosFacade.salvar(estados);
		Resultado resultado = new Resultado();
		resultado.setEstados(estados);
		resultado.setIdadeabmais(idadeABMais);
		resultado.setIdadeabmenos(idadeABMenos);
		resultado.setIdadeamais(idadeAMais);
		resultado.setIdadeamenos(idadeAMenos);
		resultado.setIdadebmais(idadeBMais);
		resultado.setIdadebmenos(idadeBMenos);
		resultado.setIdadeomais(idadeOMais);
		resultado.setIdadeomenos(idadeOMenos);
		resultado.setMediaimc10(mediaImc10);
		resultado.setMediaimc20(mediaImc20);
		resultado.setMediaimc30(mediaImc30);
		resultado.setMediaimcmais(mediaImcMais);
		resultado.setNdoadorabmais(nDoadorABMais);
		resultado.setNdoadorabmenos(nDoadorABMenos);
		resultado.setNdoadoramais(nDoadorAMais);
		resultado.setNdoadoramenos(nDoadorAMenos);
		resultado.setNdoadorbmais(nDoadorBMais);
		resultado.setNdoadorbmenos(nDoadorBMenos);
		resultado.setNdoadoromais(nDoadorOMais);
		resultado.setNdoadoromenos(nDoadorOMenos);
		ResultadosFacade resultadosFacade = new ResultadosFacade();
		resultado = resultadosFacade.salvar(resultado);
		Mensagem.lancarMensagemInfo("Salvo com Sucesso", "");
	}
	
	
	
	
	
	
}
