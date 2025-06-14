package com.carflux.carflux.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoCliente;
	
	private String nome;
	private String documento;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contato")
	private Contato contato;
	private String perfil;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	

	public Pessoa(Integer codigoCliente, String nome, String documento, Contato contato, String perfil,
			Endereco endereco) {
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

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [codigoCliente=" + codigoCliente + ", nome=" + nome + ", documento=" + documento + ", contato="
				+ contato + ", perfil=" + perfil + ", endereco=" + endereco + "]";
	}

	
	
}
