package com.carflux.carflux.services;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carflux.carflux.model.Cliente;
import com.carflux.carflux.model.Contato;
import com.carflux.carflux.model.Endereco;
import com.carflux.carflux.model.FormaPagamento;

@SpringBootTest
class ClienteServiceTest {

	@Autowired
	private ClienteService service;
	
	
	
	@Test
	void atualizarRegistroDoCliente() {
		//teger codigoCliente = 101;

		String nome = "Lucas Martins";

		String documento = "123.456.789-00"; // CPF fictício

		Contato contato = new Contato();
		contato.setTipo("Celular");
		contato.setValor("(92) 91234-5678");
		

		Endereco endereco = new Endereco();
		endereco.setRua("Av. Constantino Nery");
		endereco.setNumero("1200");
		endereco.setBairro("Centro");
		endereco.setCidade("Manaus");
		endereco.setEstado("AM");

		String perfil = "FREE";

		
		Cliente cliente1 = new Cliente(1, nome, documento, contato, perfil, endereco);
		contato.setCliente(cliente1);
		endereco.setCliente(cliente1);
		service.atualizarRegistroDeCliente(cliente1,1);
	}
	/*
 void listarClientes() {
		List<Cliente> cliente = service.listarClientes();
		
		for (Cliente cliente2 : cliente) {
			System.out.println(cliente2.toString());
		}
	}

	void cadastrarCliente() {
		//teger codigoCliente = 101;

		String nome = "Lucas Martins";

		String documento = "123.456.789-00"; // CPF fictício

		Contato contato = new Contato();
		contato.setTipo("Celular");
		contato.setValor("(92) 91234-5678");
		

		Endereco endereco = new Endereco();
		endereco.setRua("Av. Constantino Nery");
		endereco.setNumero("1250");
		endereco.setBairro("Centro");
		endereco.setCidade("Manaus");
		endereco.setEstado("AM");

		String perfil = "CLIENTE";

		FormaPagamento formaPagamento = new FormaPagamento();
		formaPagamento.setDescricao("Cartão de Crédito");
		
		Cliente cliente1 = new Cliente(null, nome, documento, contato, perfil, endereco);
		contato.setCliente(cliente1);
		endereco.setCliente(cliente1);
		service.cadastrarCliente(cliente1);

		
	
}*/
}
