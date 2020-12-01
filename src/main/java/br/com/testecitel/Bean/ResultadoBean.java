package br.com.testecitel.Bean;

import java.util.List;


import com.testecitel.api.model.Dados;
import com.testecitel.api.model.Estado;


public class ResultadoBean {

	private Dados dados;
	private List<Dados> listaDados;
	private float imc10;
	private float imc20;
	private float imc30;
	private float imcMais;
	private int nImc10;
	private int nImc20;
	private int nImc30;
	private int nImcMais;
	private float mediaImc10;
	private float mediaImc20;
	private float mediaImc30;
	private float mediaImcMais;
	private int idadeAMais;
	private int nIdadeAMais;
	private int idadeAMenos;
	private int nIdadeAMenos;
	private int idadeBMais;
	private int nIdadeBMais;
	private int idadeBMenos;
	private int nIdadeBMenos;
	private int idadeABMais;
	private int nIdadeABMais;
	private int idadeABMenos;
	private int nIdadeABMenos;
	private int idadeOMais;
	private int nIdadeOMais;
	private int idadeOMenos;
	private int nIdadeOMenos;
	private int nDoadorAMais;
	private int nDoadorAMenos;
	private int nDoadorBMais;
	private int nDoadorBMenos;
	private int nDoadorABMais;
	private int nDoadorABMenos;
	private int nDoadorOMais;
	private int nDoadorOMenos;
	private int nHomemObeso;
	private int nMulherObesa;
	private float percentualHomem;
	private float percentualMulher;
	private int totalHomem;
	private int totalMulher;
	private String titulo;
	private Estado estados;
	private String dadosJson;
	public Dados getDados() {
		return dados;
	}
	public void setDados(Dados dados) {
		this.dados = dados;
	}
	public List<Dados> getListaDados() {
		return listaDados;
	}
	public void setListaDados(List<Dados> listaDados) {
		this.listaDados = listaDados;
	}
	public float getImc10() {
		return imc10;
	}
	public void setImc10(float imc10) {
		this.imc10 = imc10;
	}
	public float getImc20() {
		return imc20;
	}
	public void setImc20(float imc20) {
		this.imc20 = imc20;
	}
	public float getImc30() {
		return imc30;
	}
	public void setImc30(float imc30) {
		this.imc30 = imc30;
	}
	public float getImcMais() {
		return imcMais;
	}
	public void setImcMais(float imcMais) {
		this.imcMais = imcMais;
	}
	public int getnImc10() {
		return nImc10;
	}
	public void setnImc10(int nImc10) {
		this.nImc10 = nImc10;
	}
	public int getnImc20() {
		return nImc20;
	}
	public void setnImc20(int nImc20) {
		this.nImc20 = nImc20;
	}
	public int getnImc30() {
		return nImc30;
	}
	public void setnImc30(int nImc30) {
		this.nImc30 = nImc30;
	}
	public int getnImcMais() {
		return nImcMais;
	}
	public void setnImcMais(int nImcMais) {
		this.nImcMais = nImcMais;
	}
	public float getMediaImc10() {
		return mediaImc10;
	}
	public void setMediaImc10(float mediaImc10) {
		this.mediaImc10 = mediaImc10;
	}
	public float getMediaImc20() {
		return mediaImc20;
	}
	public void setMediaImc20(float mediaImc20) {
		this.mediaImc20 = mediaImc20;
	}
	public float getMediaImc30() {
		return mediaImc30;
	}
	public void setMediaImc30(float mediaImc30) {
		this.mediaImc30 = mediaImc30;
	}
	public float getMediaImcMais() {
		return mediaImcMais;
	}
	public void setMediaImcMais(float mediaImcMais) {
		this.mediaImcMais = mediaImcMais;
	}
	public int getIdadeAMais() {
		return idadeAMais;
	}
	public void setIdadeAMais(int idadeAMais) {
		this.idadeAMais = idadeAMais;
	}
	public int getnIdadeAMais() {
		return nIdadeAMais;
	}
	public void setnIdadeAMais(int nIdadeAMais) {
		this.nIdadeAMais = nIdadeAMais;
	}
	public int getIdadeAMenos() {
		return idadeAMenos;
	}
	public void setIdadeAMenos(int idadeAMenos) {
		this.idadeAMenos = idadeAMenos;
	}
	public int getnIdadeAMenos() {
		return nIdadeAMenos;
	}
	public void setnIdadeAMenos(int nIdadeAMenos) {
		this.nIdadeAMenos = nIdadeAMenos;
	}
	public int getIdadeBMais() {
		return idadeBMais;
	}
	public void setIdadeBMais(int idadeBMais) {
		this.idadeBMais = idadeBMais;
	}
	public int getnIdadeBMais() {
		return nIdadeBMais;
	}
	public void setnIdadeBMais(int nIdadeBMais) {
		this.nIdadeBMais = nIdadeBMais;
	}
	public int getIdadeBMenos() {
		return idadeBMenos;
	}
	public void setIdadeBMenos(int idadeBMenos) {
		this.idadeBMenos = idadeBMenos;
	}
	public int getnIdadeBMenos() {
		return nIdadeBMenos;
	}
	public void setnIdadeBMenos(int nIdadeBMenos) {
		this.nIdadeBMenos = nIdadeBMenos;
	}
	public int getIdadeABMais() {
		return idadeABMais;
	}
	public void setIdadeABMais(int idadeABMais) {
		this.idadeABMais = idadeABMais;
	}
	public int getnIdadeABMais() {
		return nIdadeABMais;
	}
	public void setnIdadeABMais(int nIdadeABMais) {
		this.nIdadeABMais = nIdadeABMais;
	}
	public int getIdadeABMenos() {
		return idadeABMenos;
	}
	public void setIdadeABMenos(int idadeABMenos) {
		this.idadeABMenos = idadeABMenos;
	}
	public int getnIdadeABMenos() {
		return nIdadeABMenos;
	}
	public void setnIdadeABMenos(int nIdadeABMenos) {
		this.nIdadeABMenos = nIdadeABMenos;
	}
	public int getIdadeOMais() {
		return idadeOMais;
	}
	public void setIdadeOMais(int idadeOMais) {
		this.idadeOMais = idadeOMais;
	}
	public int getnIdadeOMais() {
		return nIdadeOMais;
	}
	public void setnIdadeOMais(int nIdadeOMais) {
		this.nIdadeOMais = nIdadeOMais;
	}
	public int getIdadeOMenos() {
		return idadeOMenos;
	}
	public void setIdadeOMenos(int idadeOMenos) {
		this.idadeOMenos = idadeOMenos;
	}
	public int getnIdadeOMenos() {
		return nIdadeOMenos;
	}
	public void setnIdadeOMenos(int nIdadeOMenos) {
		this.nIdadeOMenos = nIdadeOMenos;
	}
	public int getnDoadorAMais() {
		return nDoadorAMais;
	}
	public void setnDoadorAMais(int nDoadorAMais) {
		this.nDoadorAMais = nDoadorAMais;
	}
	public int getnDoadorAMenos() {
		return nDoadorAMenos;
	}
	public void setnDoadorAMenos(int nDoadorAMenos) {
		this.nDoadorAMenos = nDoadorAMenos;
	}
	public int getnDoadorBMais() {
		return nDoadorBMais;
	}
	public void setnDoadorBMais(int nDoadorBMais) {
		this.nDoadorBMais = nDoadorBMais;
	}
	public int getnDoadorBMenos() {
		return nDoadorBMenos;
	}
	public void setnDoadorBMenos(int nDoadorBMenos) {
		this.nDoadorBMenos = nDoadorBMenos;
	}
	public int getnDoadorABMais() {
		return nDoadorABMais;
	}
	public void setnDoadorABMais(int nDoadorABMais) {
		this.nDoadorABMais = nDoadorABMais;
	}
	public int getnDoadorABMenos() {
		return nDoadorABMenos;
	}
	public void setnDoadorABMenos(int nDoadorABMenos) {
		this.nDoadorABMenos = nDoadorABMenos;
	}
	public int getnDoadorOMais() {
		return nDoadorOMais;
	}
	public void setnDoadorOMais(int nDoadorOMais) {
		this.nDoadorOMais = nDoadorOMais;
	}
	public int getnDoadorOMenos() {
		return nDoadorOMenos;
	}
	public void setnDoadorOMenos(int nDoadorOMenos) {
		this.nDoadorOMenos = nDoadorOMenos;
	}
	public int getnHomemObeso() {
		return nHomemObeso;
	}
	public void setnHomemObeso(int nHomemObeso) {
		this.nHomemObeso = nHomemObeso;
	}
	public int getnMulherObesa() {
		return nMulherObesa;
	}
	public void setnMulherObesa(int nMulherObesa) {
		this.nMulherObesa = nMulherObesa;
	}
	public float getPercentualHomem() {
		return percentualHomem;
	}
	public void setPercentualHomem(float percentualHomem) {
		this.percentualHomem = percentualHomem;
	}
	public float getPercentualMulher() {
		return percentualMulher;
	}
	public void setPercentualMulher(float percentualMulher) {
		this.percentualMulher = percentualMulher;
	}
	public int getTotalHomem() {
		return totalHomem;
	}
	public void setTotalHomem(int totalHomem) {
		this.totalHomem = totalHomem;
	}
	public int getTotalMulher() {
		return totalMulher;
	}
	public void setTotalMulher(int totalMulher) {
		this.totalMulher = totalMulher;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Estado getEstados() {
		return estados;
	}
	public void setEstados(Estado estados) {
		this.estados = estados;
	}
	public String getDadosJson() {
		return dadosJson;
	}
	public void setDadosJson(String dadosJson) {
		this.dadosJson = dadosJson;
	}
	
	
	
}
