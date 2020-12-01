package com.testecitel.api.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dados")
public class Dados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iddados")
	private Integer iddados;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "rg")
	private String rg;
	@Column(name = "data_nasc")
	private String data_nasc;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "mae")
	private String mae;
	@Column(name = "pai")
	private String pai;
	@Column(name = "email")
	private String email;
	@Column(name="cep")
	private String cep;
	@Column(name = "endereco")
	private String endereco;
	@Column(name = "numero")
	private int numero;
	@Column(name = "bairro")
	private String bairro;
	@Column(name = "cidade")
	private String cidade;
	@Column(name="estado")
	private String estado;
	@Column(name = "telefone_fixo")
	private String telefone_fixo;
	@Column(name = "celular")
	private String celular;
	@Column(name = "altura")
	private float altura;
	@Column(name = "peso")
	private float peso;
	@Column(name = "tipo_sanguineo")
	private String tipo_sanguineo;
	
	
	public Dados() {
	
	}


	public Integer getIddados() {
		return iddados;
	}


	public void setIddados(Integer iddados) {
		this.iddados = iddados;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getData_nasc() {
		return data_nasc;
	}


	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getMae() {
		return mae;
	}


	public void setMae(String mae) {
		this.mae = mae;
	}


	public String getPai() {
		return pai;
	}


	public void setPai(String pai) {
		this.pai = pai;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getTelefone_fixo() {
		return telefone_fixo;
	}


	public void setTelefone_fixo(String telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}


	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (iddados != null ? iddados.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		//
		if (!(object instanceof Dados)) {
			return false;
		}
		Dados other = (Dados) object;
		if ((this.iddados == null && other.iddados != null)
				|| (this.iddados != null && !this.iddados.equals(other.iddados))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Dados[ iddados=" + iddados + " ]";
	}
	
	
	
	
	

}
