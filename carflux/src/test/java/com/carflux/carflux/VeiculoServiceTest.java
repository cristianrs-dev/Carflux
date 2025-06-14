package com.carflux.carflux;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.carflux.carflux.model.Veiculo;
import com.carflux.carflux.services.VeiculoService;

import jakarta.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class VeiculoServiceTest {
	Veiculo veiculo = new Veiculo();
	
	
	@Autowired
	private VeiculoService service;
	
	@Test
	
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
		assertNotNull(veiculo.getCodigoVeiculo(),"codigo do veiculo");
		assertEquals("Toyota", veiculo.getMarca(),"a marca deve ser Toyota");
	}
	
	@Test
	void buscarCor() {
		List<Veiculo> lista;
		lista = service.listarVeiculoPelaCor("vermelho");
		
		for (Veiculo veiculo : lista) {
		
			System.out.println(veiculo.getCor());
			
		}
	}
	
	
	@Test
	void buscarMarca() {
		List<Veiculo> lista;
		lista = service.listarVeiculoPelaMarca("ford");
		
		for (Veiculo veiculo : lista) {
		
			System.out.println(veiculo.getMarca());
			
		}
	}
	
	@Test
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
	
	@Test
	 void buscarVeiculoPeloId() {
		veiculo = service.buscarVeiculoPeloCodigo(1);
		System.out.println(veiculo.getMarca());
	}
	
	@Test
	void listarVeiculos() {
		List<Veiculo> lista = service.listarVeiculos();
		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.getMarca());
		}
	}
	
	
	
	
}
