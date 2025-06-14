package com.carflux.carflux.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carflux.carflux.model.Cliente;
import com.carflux.carflux.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public void cadastrarCliente(Cliente cliente) {
		
		repository.save(cliente);
		
	}
	
	public List<Cliente> listarClientes(){
		
		return  repository.findAll();
		
	}
	
public void atualizarRegistroDeCliente(Cliente cliente) {
		
		repository.save(cliente);
		
	}
	
	
}
