package com.carflux.carflux.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnderecoServiceTest {
	
	@Autowired
	EnderecoService service;

	@Test
	void test() {
		
		System.out.println(service.buscarEnderecoPeloIdCliente(1));
		
		
	}

}
