package com.carflux.carflux.model;

public class Cliente extends Pessoa {
	
	private FormaPagamento FormaPagamento;

	public Cliente(Integer codigoCliente, String nome, String documento, Contato contato, String perfil,
			Endereco endereco, com.carflux.carflux.model.FormaPagamento formaPagamento) {
		super(codigoCliente, nome, documento, contato, perfil, endereco);
		FormaPagamento = formaPagamento;
	}

	public Cliente(Integer codigoCliente, String nome, String documento, Contato contato, String perfil,
			Endereco endereco) {
		super(codigoCliente, nome, documento, contato, perfil, endereco);
	}

	public FormaPagamento getFormaPagamento() {
		return FormaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		FormaPagamento = formaPagamento;
	}
	
	
	
}

