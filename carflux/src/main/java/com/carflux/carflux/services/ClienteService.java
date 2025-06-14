package com.carflux.carflux.services;


import java.util.List;
import java.util.Optional;

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
	
	public Cliente buscarClientePeloCodigo(Integer id) {
		
		 return repository.findById(id).orElse(null);
		 
	}
	
	public List<Cliente> listarClientes(){
		
		return  repository.findAll();
		
	}
	
	//adicionar o id do endereço e o id contato para não duplicar
	public void atualizarRegistroDeCliente(Cliente cliente,Integer id) {
		Cliente clienteExistente = buscarClientePeloCodigo(id);
		if(clienteExistente == null) {
			System.out.println("CLIENTE INEXISTENTE");
			return;
		}
		
			clienteExistente.setCodigoCliente(id);
			repository.save(cliente);
		
		
	}
	
	
}
