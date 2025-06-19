package com.carflux.carflux.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carflux.carflux.model.Endereco;
import com.carflux.carflux.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	EnderecoRepository repository;
	
	public List<Endereco> ListarTodosOsEnderecos(){
		
		return repository.findAll();
		
	}
	
	public Endereco buscarEnderecoPeloId(Integer id) {
		
		return repository.findById(id).orElse(null);
			
	}
	
	public Endereco buscarEnderecoPeloIdCliente(Integer idCliente) {
		
	
		return repository.findByClienteCodigoCliente(idCliente).orElse(null);
		
	}

}
