package com.carflux.carflux.services;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContatoServiceTest {

	@Autowired
	ContatoService service;
	@Test
	void test() {
		System.out.println(service.buscarContatoClientePeloIdCliente(1));
	}

}
