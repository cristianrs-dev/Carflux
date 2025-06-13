package com.carflux.carflux.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_veiculo")
public class Veiculo implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codigoVeiculo;
	private String marca;
	private String modelo;
	private Integer ano;
	private String cor;
	private Double km;
	private String combustivel;
	private String cambio;
	private Double preco;
	
	
	
	public Veiculo() {
		
	}
	
	

	public Veiculo(Integer codigoVeiculo, String marca, String modelo, Integer ano, String cor, Double km,
			String combustivel, String cambio, Double preco) {
		super();
		this.codigoVeiculo = codigoVeiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.km = km;
		this.combustivel = combustivel;
		this.cambio = cambio;
		this.preco = preco;
	}



	public Integer getCodigoVeiculo() {
		return codigoVeiculo;
	}

	public void setCodigoVeiculo(Integer codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public Double getKm() {
		return km;
	}



	public void setKm(Double km) {
		this.km = km;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public Double getPreco() {
		return preco;
	}



	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
