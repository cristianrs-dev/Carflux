package com.carflux.carflux;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carflux.carflux.model.Veiculo;
import com.carflux.carflux.services.VeiculoService;

@SpringBootTest
public class VeiculoServiceTest {
	Veiculo veiculo = new Veiculo();
	
	@Autowired
	private VeiculoService service;
	
	@Test
	void buscarCor() {
		List<Veiculo> lista;
		lista = service.listarVeiculoPelaCor("vermelho");
		
		for (Veiculo veiculo : lista) {
		
			System.out.println(veiculo.getCor());
			
		}
	}
	
	
	
	/*
	 * 
	 * void buscarMarca() {
		List<Veiculo> lista;
		lista = service.listarVeiculoPelaMarca("ford");
		
		for (Veiculo veiculo : lista) {
		
			System.out.println(veiculo.getMarca());
			
		}
	}
	
	  void atualizarRegistroDoVeiculo() {
		Veiculo veiculo = new Veiculo(
				1,              // código, null porque será gerado pelo banco
			    "Toyota",          // marca
			    "Corolla",         // modelo
			    2023,              // ano
			    "Prata",           // cor
			    15000.0,           // km rodados
			    "Gasolina",        // combustível
			    "Automático",      // câmbio
			    95000.0      
				);
		service.atualizarDadosDoVeiculo(veiculo);
	}
	
	
	 void buscarVeiculoPeloId() {
		veiculo = service.buscarVeiculoPeloCodigo(1);
		System.out.println(veiculo.getMarca());
	}
	
	
	void listarVeiculos() {
		lista = service.listarVeiculos();
		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.getMarca());
		}
	}
	
	
	void cadastrarVeiculo() {
		Veiculo veiculo = new Veiculo(
				null,              // código, null porque será gerado pelo banco
			    "Toyota",          // marca
			    "Corolla",         // modelo
			    2022,              // ano
			    "Prata",           // cor
			    15000.0,           // km rodados
			    "Gasolina",        // combustível
			    "Automático",      // câmbio
			    95000.0      
				);
		service.cadastrarVeiculo(veiculo);
	}*/
	
}
