package com.carflux.carflux;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BancoDadosConnectionTest {
	
	 @Autowired
	    private DataSource dataSource;
	 @Test
	    void deveConectarAoBancoDeDados() throws Exception {
	        try (Connection connection = dataSource.getConnection()) {
	            System.out.println("Conexão estabelecida com sucesso!");
	            assertNotNull(connection); // Verifica se a conexão não é nula
	        }
	    }

}
