package br.com.testecitel.Bean;

import java.util.ArrayList;
import java.util.List;

import com.testecitel.api.model.Dados;


public class DadosBean {

	private String nome;
	private String cpf;
	private String rg;
	private String data_nasc;
	private String sexo;
	private String mae;
	private String pai;
	private String email;
	private String cep;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone_fixo;
	private String celular;
	private float altura;
	private float peso;
	private String tipo_sanguineo;
	
	
	
	
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
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
	public static List<Dados> popularDados() {
		List<Dados> lista = new ArrayList<Dados>();
		Dados dados = new Dados();
		dados.setAltura(1.53f);
		dados.setData_nasc("23/05/2000");
		dados.setEstado("MG");  
		dados.setNome("Milena Analu Pires");
		dados.setPeso(80);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.92f);
		dados.setData_nasc("07/09/1992");
		dados.setEstado("SE");  
		dados.setNome("Marcos Vinicius Kevin Samuel Santos");
		dados.setPeso(95);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.93f);
		dados.setData_nasc("27/03/1991");
		dados.setEstado("MG");  
		dados.setNome("Noah Severino Freitas");
		dados.setPeso(84);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.66f);
		dados.setData_nasc("20/12/1994");
		dados.setEstado("PE");  
		dados.setNome("Nair Brenda Ayla Cardoso");
		dados.setPeso(72);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.88f);
		dados.setData_nasc("05/10/1951");
		dados.setEstado("MA");  
		dados.setNome("Vinicius Leandro Danilo Assun��o");
		dados.setPeso(100);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.80f);
		dados.setData_nasc("03/01/1975");
		dados.setEstado("RN");  
		dados.setNome("Oliver Rafael Marcos Vinicius Foga�a");
		dados.setPeso(87);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.67f);
		dados.setData_nasc("18/09/1965");
		dados.setEstado("RO");  
		dados.setNome("Renan Matheus Murilo Peixoto");
		dados.setPeso(62);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.80f);
		dados.setData_nasc("08/04/1945");
		dados.setEstado("TO");  
		dados.setNome("Oliver Thomas Vieira");
		dados.setPeso(61);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.90f);
		dados.setData_nasc("03/09/1985");
		dados.setEstado("BA");  
		dados.setNome("Iago C�sar Calebe da Paz");
		dados.setPeso(92);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.54f);
		dados.setData_nasc("12/07/1958");
		dados.setEstado("SP");  
		dados.setNome("Giovana Vera da Mata");
		dados.setPeso(82);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.66f);
		dados.setData_nasc("15/01/1952");
		dados.setEstado("AL");  
		dados.setNome("Manuel Samuel Lima");
		dados.setPeso(109);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1987");
		dados.setEstado("SC");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(125);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1996");
		dados.setEstado("RR");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.49f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("PE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1956");
		dados.setEstado("RR");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1956");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(83);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.69f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(53);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1987");
		dados.setEstado("SC");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(125);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1996");
		dados.setEstado("RR");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.49f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("PE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1956");
		dados.setEstado("RR");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1956");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(83);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1975");
		dados.setEstado("RJ");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(89);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.69f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(53);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("SE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(179);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("SE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(179);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("SE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(179);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("SE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(179);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/2006");
		dados.setEstado("SE");  
		dados.setNome("Benjamin Iago Raimundo Alves");
		dados.setPeso(179);
		dados.setSexo("Feminino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("DF");  
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("RO");  
		dados.setPeso(150);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("AM");  
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1996");
		dados.setEstado("DF");  
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.87f);
		dados.setData_nasc("22/01/1956");
		dados.setEstado("DF");  
		dados.setPeso(75);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("A+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1946");
		dados.setEstado("DF");  
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/2011");
		dados.setEstado("PA");  
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("B-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("AL");  
		dados.setPeso(58);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB-");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.89f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("AC");  
		dados.setPeso(98);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("AB+");
		lista.add(dados);
		
		
		dados = new Dados();
		dados.setAltura(1.45f);
		dados.setData_nasc("22/01/1986");
		dados.setEstado("SC");  
		dados.setPeso(63);
		dados.setSexo("Masculino");
		dados.setTipo_sanguineo("O-");
		lista.add(dados);
		
		
		return lista;
	}
	
	
	
	
	
	
}
