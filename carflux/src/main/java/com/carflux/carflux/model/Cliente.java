package com.carflux.carflux.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente extends Pessoa {
	
	

	public Cliente(Integer codigoCliente, String nome, String documento, Contato contato, String perfil,
			Endereco endereco) {
		super(codigoCliente, nome, documento, contato, perfil, endereco);
	}

	@Override
	public String toString() {
		return "Cliente [getCodigoCliente()=" + getCodigoCliente() + ", getNome()=" + getNome() + ", getDocumento()="
				+ getDocumento() + ", getContato()=" + getContato() + ", getPerfil()=" + getPerfil()
				+ ", getEndereco()=" + getEndereco() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

	
}

