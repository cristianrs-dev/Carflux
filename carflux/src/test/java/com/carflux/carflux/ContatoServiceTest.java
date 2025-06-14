package com.carflux.carflux;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carflux.carflux.model.Contato;
import com.carflux.carflux.services.ContatoService;

@SpringBootTest
public class ContatoServiceTest {
	
	@Autowired
	ContatoService service;
	
	@Test
	public void buscarContatoPeloId() {
		Contato contato = service.buscarContatoPeloId(1);
		
		
		System.out.println(contato.toString());
		
		assertNotNull(contato.getIdContato(),"codigo do contato");
		assertEquals(1, contato.getCliente().getCodigoCliente());
		
	}

}
