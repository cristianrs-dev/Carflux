package com.carflux.carflux.model;


public class Pessoa {
	
	private Integer codigoCliente;
	private String nome;
	private String documento;
	private String contato;
	private String perfil;
	private String endereco;
	
	public Pessoa(Integer codigoCliente, String nome, String documento, String contato, String perfil,
			String endereco) {
		super();
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.documento = documento;
		this.contato = contato;
		this.perfil = perfil;
		this.endereco = endereco;
	}

	public Pessoa() {
		super();
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
